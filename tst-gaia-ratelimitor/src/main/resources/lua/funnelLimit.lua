-- 参数说明:
-- KEYS[1]: 限流器的 key
-- ARGV[1]: 容量，决定最大并发量
-- ARGV[2]: 漏水速率，决定平均的并发量
-- ARGV[3]: 当前请求的时间戳
-- ARGV[4]: 请求的加水量（通常为1）

local limitInfo = redis.call('hmget', KEYS[1], 'capacity', 'passRate', 'water', 'lastTs')
local capacity = limitInfo[1]
local passRate = limitInfo[2]
local water = limitInfo[3]
local lastTs = limitInfo[4]

-- 初始化漏桶
if capacity == nil then
    capacity = tonumber(ARGV[1])
    passRate = tonumber(ARGV[2])
    lastTs = tonumber(ARGV[3])
    redis.call('hmset', KEYS[1], 'capacity', capacity, 'passRate', passRate, 'water', 0, 'lastTs', lastTs)
    return 1 -- 初始化成功
else
    local nowTs = tonumber(ARGV[3])
    -- 计算自上次请求以来漏掉的水量
    local waterPass = tonumber(passRate) * (nowTs - tonumber(lastTs))
    water = math.max(tonumber(0), tonumber(water) - waterPass) -- 更新水量，确保不为负
    lastTs = nowTs -- 更新上次时间戳

    -- 如果桶未满，允许处理请求
    if tonumber(water) + tonumber(ARGV[4]) <= tonumber(capacity) then
        water = water + tonumber(ARGV[4]) -- 增加当前请求的水量
        redis.call('hmset', KEYS[1], 'water', water, 'lastTs', lastTs) -- 更新状态
        return 1 -- 请求处理成功
    end

    return 0 -- 请求被拒绝
end

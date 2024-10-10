-- 参数说明:
-- KEYS[1]: 令牌桶的 key
-- ARGV[1]: 桶的最大容量 (Capacity)
-- ARGV[2]: 令牌生成速率 (Token Rate)，每秒生成的令牌数
-- ARGV[3]: 当前请求的时间戳 (current timestamp)
-- ARGV[4]: 本次请求需要的令牌数量（通常为1）

-- 从 Redis 获取令牌桶的状态: 容量、令牌生成速率、当前令牌数、上次时间戳
local bucketInfo = redis.call('hmget', KEYS[1], 'capacity', 'tokenRate', 'tokens', 'lastTs')
local capacity = tonumber(bucketInfo[1])
local tokenRate = tonumber(bucketInfo[2])
local tokens = tonumber(bucketInfo[3])
local lastTs = tonumber(bucketInfo[4])

-- 初始化令牌桶
if capacity == nil then
    capacity = tonumber(ARGV[1])
    tokenRate = tonumber(ARGV[2])
    tokens = capacity -- 初始化时，令牌桶是满的
    lastTs = tonumber(ARGV[3])
    redis.call('hmset', KEYS[1], 'capacity', capacity, 'tokenRate', tokenRate, 'tokens', tokens, 'lastTs', lastTs)
    return 1 -- 初始化成功，返回1表示请求通过
end

-- 当前时间戳
local nowTs = tonumber(ARGV[3])

-- 根据时间间隔计算生成的新令牌数
local timeDiff = nowTs - lastTs
local newTokens = timeDiff * tokenRate

-- 更新令牌数，不能超过桶的最大容量
tokens = math.min(capacity, tokens + newTokens)

-- 更新上次的时间戳
lastTs = nowTs

-- 检查是否有足够的令牌处理请求
if tokens >= tonumber(ARGV[4]) then
    -- 有足够的令牌，处理请求并扣除相应数量的令牌
    tokens = tokens - tonumber(ARGV[4])
    -- 更新令牌桶的状态到 Redis
    redis.call('hmset', KEYS[1], 'tokens', tokens, 'lastTs', lastTs)
    return 1 -- 返回1表示请求通过
else
    -- 令牌不足，请求被拒绝
    redis.call('hmset', KEYS[1], 'tokens', tokens, 'lastTs', lastTs)
    return 0 -- 返回0表示请求被拒绝
end

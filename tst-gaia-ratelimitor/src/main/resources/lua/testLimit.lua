local function token_bucket(key, rate, burst, now)
    local current = tonumber(redis.call('get', key) or burst)
    local last_refreshed = tonumber(redis.call('get', key .. ':last_refreshed') or '0')
    local time_passed = math.max(now - last_refreshed, 0)
    local new_tokens = math.floor(time_passed * rate)

    if new_tokens > 0 then
        current = math.min(current + new_tokens, burst);
        redis.call('set', key, current)
        redis.call('set', key .. ':last_refreshed', now)
    end

    if current > 0 then
        redis.call('decr', key)
        return current-1;
    end
    return current
end

-- 调用令牌桶限流算法
return token_bucket(KEYS[1], tonumber(ARGV[1]), tonumber(ARGV[2]), tonumber(ARGV[3]))

-- 参考函数使用方法，其他不必理会

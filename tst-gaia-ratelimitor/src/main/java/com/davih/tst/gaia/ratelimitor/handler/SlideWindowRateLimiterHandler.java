package com.davih.tst.gaia.ratelimitor.handler;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

public class SlideWindowRateLimiterHandler extends AbstractRateLimitService {

    private final RedisTemplate<String, Object> redisTemplate;

    private final RedisScript<Long> redisScript;

    public SlideWindowRateLimiterHandler(@Lazy RedisTemplate<String, Object> redisTemplate,
                           @Lazy RedisScript<Long> redisScript) {
        this.redisTemplate = redisTemplate;
        this.redisScript = redisScript;
    }

    @Override
    public boolean accquire(String key, int resourceNum) {

        return false;
    }


}

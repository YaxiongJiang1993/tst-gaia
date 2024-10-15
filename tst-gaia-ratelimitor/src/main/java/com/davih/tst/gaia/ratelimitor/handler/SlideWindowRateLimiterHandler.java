package com.davih.tst.gaia.ratelimitor.handler;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

import java.util.Collections;
import java.util.Objects;

public class SlideWindowRateLimiterHandler extends AbstractRateLimitService {

    private final String slidePrefix = "slide:";

    private final RedisTemplate<String, Object> redisTemplate;

    private final RedisScript<Long> redisScript;

    public SlideWindowRateLimiterHandler(@Lazy RedisTemplate<String, Object> redisTemplate,
                                         @Lazy RedisScript<Long> redisScript) {
        this.redisTemplate = redisTemplate;
        this.redisScript = redisScript;
    }

    @Override
    public boolean accquire(String key, Object[] limitParams) {
        String combineKey = getSlidePrefix().concat(key);
        Long allow = redisTemplate.execute(redisScript, Collections.singletonList(combineKey), limitParams);
        if (Objects.nonNull(allow) && allow.equals(0L)) {
            return false;
        }
        return true;
    }

    public String getSlidePrefix() {
        return ratePrefix.concat(slidePrefix);
    }


}

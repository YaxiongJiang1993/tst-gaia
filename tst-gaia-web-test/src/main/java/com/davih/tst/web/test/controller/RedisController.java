package com.davih.tst.web.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Objects;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/tst/gaia/redis")
public class RedisController {

    private final RedisTemplate<String, Object> redisTemplate;

    private final RedisScript<Long> redisScript;

    public RedisController(@Lazy RedisTemplate<String, Object> redisTemplate,
                           @Lazy RedisScript<Long> redisScript) {
        this.redisTemplate = redisTemplate;
        this.redisScript = redisScript;
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        redisTemplate.opsForValue().set("name", "zhangsan");
        String value = redisTemplate.opsForValue().get("name").toString();
        log.info("hello name: {}", name);
        return name;
    }

    @GetMapping("/fix-window")
    public String fixWindow(@RequestParam("name") String name) {
        int time = 300;
        int count = 10;
        String combineKey = name + "_count";
        Object[] o = {count, time};
        Long allowd = redisTemplate.execute(redisScript, Collections.singletonList(combineKey), o);
        if (Objects.nonNull(allowd) && allowd.equals(1L)) {
            return "allow";
        }
        return "not allow";
    }
}

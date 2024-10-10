package com.davih.tst.web.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

@Configuration
public class RedisLuaConfiguration {

    @Bean
    public DefaultRedisScript<Long> limitScript() {
        //执行 Redis Lua 脚本的一种方式
        DefaultRedisScript<Long> redisScript = new DefaultRedisScript<>();
        //将lua脚本加载ClassPathResource中
        ClassPathResource resource = new ClassPathResource("lua/test.lua");
        //将脚本加载容器中方便后续执行
        ResourceScriptSource resourceScriptSource = new ResourceScriptSource(resource);
        redisScript.setScriptSource(resourceScriptSource);
        redisScript.setResultType(Long.class);
        return redisScript;
    }
}

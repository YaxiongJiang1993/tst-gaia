package com.davih.tst.gaia.ratelimitor.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.scripting.support.ResourceScriptSource;

import java.time.Duration;

@Configuration
public class RedisConfiguration {

   /* @Bean
    public LettuceConnectionFactory lettuceConnectionFactory() {

        LettuceClientConfiguration clientConfig = LettuceClientConfiguration.builder()
                .useSsl().and()
                .commandTimeout(Duration.ofSeconds(30))
                .shutdownTimeout(Duration.ZERO)
                .build();

        RedisStandaloneConfiguration redisStandaloneConfiguration=new RedisStandaloneConfiguration("51.81.244.225", 6997);
        redisStandaloneConfiguration.setPassword("vdata#valor");

        return new LettuceConnectionFactory(redisStandaloneConfiguration, clientConfig);
    }*/

    @Bean
    public DefaultRedisScript<Long> limitScript() {
        //执行 Redis Lua 脚本的一种方式
        DefaultRedisScript<Long> redisScript = new DefaultRedisScript<>();
        //将lua脚本加载ClassPathResource中
        ClassPathResource resource = new ClassPathResource("lua/slideWindowLimit.lua");
        //将脚本加载容器中方便后续执行
        ResourceScriptSource resourceScriptSource = new ResourceScriptSource(resource);
        redisScript.setScriptSource(resourceScriptSource);
        redisScript.setResultType(Long.class);
        return redisScript;
    }
}

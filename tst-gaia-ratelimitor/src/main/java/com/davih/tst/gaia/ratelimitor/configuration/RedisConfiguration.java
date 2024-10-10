package com.davih.tst.gaia.ratelimitor.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

import java.time.Duration;

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
}

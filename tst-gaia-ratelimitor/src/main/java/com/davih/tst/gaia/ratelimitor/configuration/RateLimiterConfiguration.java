package com.davih.tst.gaia.ratelimitor.configuration;

import com.davih.tst.gaia.ratelimitor.aspect.RateLimiterAspect;
import com.davih.tst.gaia.ratelimitor.handler.SlideWindowRateLimiterHandler;
import com.davih.tst.gaia.ratelimitor.service.RateLimitService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

@Configuration
public class RateLimiterConfiguration {

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
    public RateLimiterAspect rateLimiterAspect(RateLimitService slideWindowRateLimiterHandler){
        return new RateLimiterAspect(slideWindowRateLimiterHandler);
    }

    @Bean
    public RateLimitService slideWindowRateLimiterHandler(RedisTemplate<String, Object> redisTemplate,
                                                          RedisScript<Long> redisScript) {
        return new SlideWindowRateLimiterHandler(redisTemplate, redisScript);
    }
}

package com.davih.tst.web.test.configuration;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class OkHttpConfig {

    @Bean
    public OkHttpClient okHttpClient() {

        return new OkHttpClient.Builder()
                // 连接失败时是否重试
                .retryOnConnectionFailure(false)
                // 连接池
                .connectionPool(new ConnectionPool(200, 5, TimeUnit.MINUTES))
                // 连接超时
                .connectTimeout(30, TimeUnit.SECONDS)
                // 读超时
                .readTimeout(30, TimeUnit.SECONDS)
                // 写超时
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }
}

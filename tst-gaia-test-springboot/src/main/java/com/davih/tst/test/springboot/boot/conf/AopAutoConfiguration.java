package com.davih.tst.test.springboot.boot.conf;

import com.davih.tst.test.springboot.boot.anno.TestConditionalOnClass;
import com.davih.tst.test.springboot.boot.server.JettyWebServer;
import com.davih.tst.test.springboot.boot.server.TomcatWebServer;
import com.davih.tst.test.springboot.boot.util.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.context.WebApplicationContext;

@Configuration(proxyBeanMethods = false)
public class AopAutoConfiguration implements AutoConfiguration {

    @EnableAspectJAutoProxy
    @Configuration(proxyBeanMethods = false)
    @TestConditionalOnClass("org.aspectj.weaver.Advice")
    static class AopConfiguration{

    }
}

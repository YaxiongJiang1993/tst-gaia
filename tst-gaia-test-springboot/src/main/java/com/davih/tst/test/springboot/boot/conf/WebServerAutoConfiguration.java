package com.davih.tst.test.springboot.boot.conf;

import com.davih.tst.test.springboot.boot.anno.TestConditionalOnClass;
import com.davih.tst.test.springboot.boot.server.JettyWebServer;
import com.davih.tst.test.springboot.boot.server.TomcatWebServer;
import com.davih.tst.test.springboot.boot.util.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;

//@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration {

    @Bean
    @TestConditionalOnClass("org.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer(WebApplicationContext applicationContext){
        return new TomcatWebServer(applicationContext);
    }

    @Bean
    @TestConditionalOnClass("org.eclipse.jetty.server.Server")
    public JettyWebServer jettyWebServer(WebApplicationContext applicationContext){
        return new JettyWebServer(applicationContext);
    }

   /* @Bean
    @Conditional(TestWebServerCondition.class)
    public TomcatWebServer tomcatWebServer(){
        return new TomcatWebServer();
    }*/
}

package com.davih.tst.test.springboot.boot.anno;

import com.davih.tst.test.springboot.boot.util.TestSelectorImport;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan
@Import(TestSelectorImport.class)
public @interface TestSpringBootApplication {
}

package com.davih.tst.gaia.ratelimitor.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GaiaRateLimiter {

    String key() default "";

    int total() default 100;

    int resource() default 1;

    /**
     * 窗口大小 单位是s
     */
    int windowSize() default 60;

   /* String value() default "";*/
}

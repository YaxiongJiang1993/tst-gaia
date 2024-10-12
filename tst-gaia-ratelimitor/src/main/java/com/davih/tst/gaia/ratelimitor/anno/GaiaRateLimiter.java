package com.davih.tst.gaia.ratelimitor.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GaiaRateLimiter {

    String key() default "";

    int resource() default 1;

   /* String value() default "";*/
}

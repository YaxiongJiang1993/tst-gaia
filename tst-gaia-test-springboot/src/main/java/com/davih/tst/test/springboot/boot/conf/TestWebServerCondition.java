package com.davih.tst.test.springboot.boot.conf;

import com.davih.tst.test.springboot.boot.anno.TestConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class TestWebServerCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(TestConditionalOnClass.class.getName());
        String value = annotationAttributes.get("value").toString();

        try {
            context.getClassLoader().loadClass(value);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}

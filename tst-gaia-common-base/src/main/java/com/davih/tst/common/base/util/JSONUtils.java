package com.davih.tst.common.base.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JSONUtils {

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static String object2String(Object object) {
        try {
            return OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.warn("object2String object: {}, msg: {}", object, e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 将JSON字符串转换为泛型对象
     *
     * @param json         JSON字符串
     * @param valueTypeRef TypeReference<T>对象，用于描述泛型类型
     * @param <T>          泛型类型
     * @return 泛型对象
     */
    public static <T> T fromJson(String json, TypeReference<T> valueTypeRef) {
        try {
            return OBJECT_MAPPER.readValue(json, valueTypeRef);
        } catch (JsonProcessingException e) {
            log.warn("fromJson json: {}, msg: {}", json, e.getMessage(), e);
            throw new RuntimeException(e);
        }

    }
}

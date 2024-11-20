package com.davih.tst.common.test.cache.caffeine;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

public class DavTest {

    public static void main(String[] args) {

    }

    public static void test1() {
        Cache<String, String> cache = Caffeine.newBuilder()
                //5秒没有读写自动删除
                .expireAfterAccess(5, TimeUnit.SECONDS)
                //最大容量1024个，超过会自动清理空间
                .maximumSize(1024)
                .removalListener(((key, value, cause) -> {
                    //清理通知 key,value ==> 键值对   cause ==> 清理原因
                }))
                .build();

        //添加值
        cache.put("张三", "浙江");
        //获取值
        cache.getIfPresent("张三");
        //remove
        cache.invalidate("张三");
    }
}

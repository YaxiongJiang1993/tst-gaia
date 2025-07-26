package com.davih.tst.web.test.controller;


import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/tst/gaia/redisson")
public class RedissonController {

    private final RedissonClient redissonClient;

    public RedissonController(@Lazy RedissonClient redissonClient){
        this.redissonClient = redissonClient;
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        RLock lock = redissonClient.getLock(name);
        try {
            lock.lock();
            Thread.sleep(10000);
        } catch (Exception e) {
            log.warn("test msg: {}", e.getMessage(), e);
        } finally {
            lock.unlock();
        }
        log.info("hello name: {}", name);
        return name;
    }

    @GetMapping("/bloom-filter")
    public String bloomFilter(@RequestParam("name") String name) {
        // 3. 获取布隆过滤器实例
        RBloomFilter<String> bloomFilter = redissonClient.getBloomFilter("myBloomFilter");

        // 4. 初始化布隆过滤器，容量和误判率
        // 注意：初始化操作只需执行一次即可，后续直接使用即可
        bloomFilter.tryInit(1000000L, 0.01);

        // 5. 添加元素
        bloomFilter.add("apple");
        bloomFilter.add("banana");

        // 6. 判断元素是否存在
        System.out.println(bloomFilter.contains("apple"));   // true
        System.out.println(bloomFilter.contains("orange"));  // false

//        // 7. 关闭客户端
//        redissonClient.shutdown();
        return name;
    }
}

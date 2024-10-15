package com.davih.tst.web.test.controller;


import com.davih.tst.gaia.ratelimitor.anno.GaiaRateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/tst/gaia/rate-limit")
public class RateLimitController {

    @GetMapping("/test")
    @GaiaRateLimiter(key = "#name", total = 10)
    public String test(@RequestParam("name") String name){
        log.info("hello name: {}", name);
        return name;
    }
}

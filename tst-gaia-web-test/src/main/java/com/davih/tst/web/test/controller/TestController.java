package com.davih.tst.web.test.controller;


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
@RequestMapping("/tst/gaia/test")
public class TestController {

    @GetMapping("/test")
    public String test(@RequestParam("name") String name){
        log.info("hello name: {}", name);
        return name;
    }
}

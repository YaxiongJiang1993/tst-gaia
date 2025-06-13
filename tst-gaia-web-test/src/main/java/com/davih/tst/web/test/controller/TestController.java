package com.davih.tst.web.test.controller;


import com.davih.tst.web.test.kafka.KafkaTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/tst/gaia/test")
public class TestController {


    @GetMapping("/test01")
    public String test01() {
        log.info("hello name: {}", "01");
        KafkaTest.test01();
        return null;
    }

    @GetMapping("/test02")
    public String test02() {
        log.info("hello name: {}", "02");
        KafkaTest.send();
        return null;
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name) {
        log.info("hello name: {}", name);
        return name;
    }

    @PostMapping("/sa")
    public String sa(@RequestParam("project") String project,
                     @RequestParam("token") String token,
                     @RequestParam(value = "gzip", required = false, defaultValue = "1") Integer gzip,
                     @RequestParam(value = "data", required = false) String data,
                     @RequestParam(value = "data_list", required = false) String data_list) {
        log.info("sa name: {}", project);
        return project;
    }

    @PostMapping("/test-map/{project}/{id}")
    public String testMap(@RequestHeader("User-Id") String userId,
                          @RequestHeader("User-Token") String userToken,
                          @PathVariable("project") String project,
                          @PathVariable("id") String id,
                          @RequestBody Map<String, String> map) {
        log.info("sa name: {}", project);
        return project;
    }
}

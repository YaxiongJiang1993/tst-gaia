package com.davih.tst.web.test.controller;


import com.davih.tst.web.test.anno.LogExecution;
import com.davih.tst.web.test.dto.AddPersonRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
@RequestMapping("/tst/gaia/aop")
public class AopController {

    @PostMapping("/add")
    @LogExecution(key = "'tet-' + #request.name + '-' + #request.age", resource = 2)
    public String test(@RequestBody AddPersonRequest request) {
        log.info("hello name: {}", request);
        return "success";
    }
}

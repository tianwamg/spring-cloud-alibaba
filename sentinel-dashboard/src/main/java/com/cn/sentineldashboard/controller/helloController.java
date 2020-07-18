package com.cn.sentineldashboard.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sh-hello")
public class helloController {

    @GetMapping("/h")
    @SentinelResource(value = "h")
    public String hello(){
        return "hello : sentinel-dashboard";
    }
}

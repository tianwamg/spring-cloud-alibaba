package com.cn.sentineldashboard.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cn.sentineldashboard.FeignService.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sh-hello")
public class helloController {


    @Autowired
    FeignService feignService;

    @GetMapping("/h")
    @SentinelResource(value = "h")
    public String hello(){
        return "hello : sentinel-dashboard"+feignService.hello();
    }
}

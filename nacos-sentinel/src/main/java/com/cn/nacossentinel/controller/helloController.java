package com.cn.nacossentinel.controller;

import com.cn.nacossentinel.FeignService.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fs-hello")
public class helloController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/h")
    public String hello(){
        return "hello-feign-sentinel: "+feignService.hello();
    }
}

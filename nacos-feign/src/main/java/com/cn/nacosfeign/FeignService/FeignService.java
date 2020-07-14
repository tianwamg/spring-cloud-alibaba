package com.cn.nacosfeign.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider")
public interface FeignService {

    @GetMapping("/p-hello/h")
    String hello();
}

package com.cn.nacossentinel.FeignService;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider",fallbackFactory = FallbackFactory.class)
public interface FeignService {

    @GetMapping("/p-hello/h")
    String hello();
}

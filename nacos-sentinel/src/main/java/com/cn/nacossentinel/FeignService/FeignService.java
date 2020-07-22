package com.cn.nacossentinel.FeignService;

import com.cn.nacossentinel.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class)
public interface FeignService {

    @GetMapping(value = "/p-hello/h")
    String hello();
}

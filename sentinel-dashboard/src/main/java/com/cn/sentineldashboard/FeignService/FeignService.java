package com.cn.sentineldashboard.FeignService;

import com.cn.sentineldashboard.fallback.EchoServiceFallback;
import com.cn.sentineldashboard.fallback.ServiceFallbackFactory;
import feign.hystrix.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "nacos-provider",fallbackFactory = ServiceFallbackFactory.class)
public interface FeignService {

    @GetMapping("/p-hello/h")
    String hello();
}

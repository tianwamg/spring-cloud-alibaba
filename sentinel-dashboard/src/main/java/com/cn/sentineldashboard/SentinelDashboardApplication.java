package com.cn.sentineldashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDashboardApplication.class, args);
    }

}

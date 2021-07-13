package com.cn.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author Administrator
 * @Date 2021/7/12 0012 23:27
 * @Version 1.0
 */

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@EnableFeignClients
public class MyFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyFeignApplication.class, args);
    }
}

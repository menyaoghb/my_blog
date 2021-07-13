package com.cn.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @Author Administrator
 * @Date 2021/7/12 0012 23:27
 * @Version 1.0
 */

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
public class MyAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyAdminApplication.class, args);
    }
}

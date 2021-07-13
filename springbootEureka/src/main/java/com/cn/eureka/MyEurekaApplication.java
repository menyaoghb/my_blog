package com.cn.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Administrator
 * @Date 2021/7/12 0012 23:27
 * @Version 1.0
 */

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaApplication.class, args);
    }
}

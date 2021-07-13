package com.cn.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author 孟小耀
 * @Date 2021/7/13 0013 3:12
 */

@SpringBootApplication
@EnableConfigServer
public class MyConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyConfigApplication.class, args);

    }
}

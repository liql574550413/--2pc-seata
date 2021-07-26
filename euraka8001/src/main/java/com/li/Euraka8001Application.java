package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //表示自己注册为 注册服务中心
public class Euraka8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Euraka8001Application.class, args);
    }

}

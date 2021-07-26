package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
//下面这个解决了循环依赖问题
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Bank1Application {

    public static void main(String[] args) {
        SpringApplication.run(Bank1Application.class, args);
    }

}

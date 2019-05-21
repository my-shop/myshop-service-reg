package com.funtl.myshop.service.reg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: my-shop
 * @description:
 * @author: Mr.Chen
 * @create: 2019-05-16 18:11
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.funtl.myshop.commons.mapper")
public class MyShopServiceRegApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyShopServiceRegApplication.class, args);
    }
}

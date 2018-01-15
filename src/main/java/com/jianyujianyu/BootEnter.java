package com.jianyujianyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lujianyu on 2018/1/15.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jianyujianyu")
public class BootEnter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootEnter.class, args);
    }
}

package com.tianjian.web.proppertytschedules.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tianjian.web"})

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

@MapperScan(value = "com.tianjian.web.dao")
public class PropertyTschedulesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyTschedulesApplication.class, args);
    }

}

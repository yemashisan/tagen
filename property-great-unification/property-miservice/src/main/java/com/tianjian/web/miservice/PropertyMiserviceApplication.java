package com.tianjian.web.miservice;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @program: property-great-unification
 * @description: springboot启动
 * @Author: liangxiaolei
 * @Date: 2019/5/22 9:24
 */
@SpringBootApplication(scanBasePackages = {"com.tianjian.web"})
@MapperScan(value = "com.tianjian.web.dao")
@EnableCaching
public class PropertyMiserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PropertyMiserviceApplication.class, args);
    }
}
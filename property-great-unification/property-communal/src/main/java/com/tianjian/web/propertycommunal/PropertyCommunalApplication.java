package com.tianjian.web.propertycommunal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
*此项目为公共api,并且是公共企业登录
*/
@SpringBootApplication(scanBasePackages = {"com.tianjian.web"})
@MapperScan(value = "com.tianjian.web.dao")
public class PropertyCommunalApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertyCommunalApplication.class, args);
    }

}

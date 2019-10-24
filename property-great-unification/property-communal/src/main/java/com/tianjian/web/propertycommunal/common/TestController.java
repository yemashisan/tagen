package com.tianjian.web.propertycommunal.common;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName:TestController
 * @Description:测试类
 * @author:liangxiaolei
 * @date:2019/5/24 14:47
 * @Version V1.0
 */
@RestController
@RequestMapping("/yong")
public class TestController {

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String registerUser(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password

    ){
        System.out.println(username+"***"+password);
        String  redisServerIP="192.168.1.66";
        String  redisServerPort="6379";
      // RedisProperties.Jedis jedis = new RedisProperties.Jedis(redisServerIP, redisServerPort);
        RedisProperties.Jedis jedis2 = new RedisProperties.Jedis();
        return  "注册";
    }
}

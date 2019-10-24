package com.tianjian.web.miservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import redis.clients.jedis.Jedis;
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
    @Autowired
    RedisTemplate redisTemplate;
    private static Jedis jedis = new Jedis("127.0.0.1",6379);
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String registerUser(HttpServletRequest request, HttpServletResponse response,
                               @RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password

    ){
        System.out.println(username+"***"+password);
      //  CacheProperties.Redis  ss=new  Redis
     //   CacheProperties.Redis
        jedis.auth("test123");

        jedis.set("username",username);   jedis.set("password",password);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("k1", "v1");
        Object k1 = ops.get("k1");
        System.out.println("***"+k1);
        return  "注册";
    }
}

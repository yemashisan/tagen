package com.tianjian.web.miservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

/**
 * @ClassName:TestController
 * @Description:登录
 * @author:liangxiaolei
 * @date:2019/5/24 14:47
 * @Version V1.0
 */
@RestController
public class SecurityController {
    @Autowired
    RedisTemplate redisTemplate;
    private static Jedis jedis = new Jedis("127.0.0.1",6379);
    //===========step1:jwt token 身份认证===========
    //登录页面
    @GetMapping("/security/loginpage")
    public  String loginpage(){
        return "loginpage";
    }
    //登出
    @GetMapping("/security/loginout")
    String loginout(){
        return "loginout success";
    }
    //不需要token，就可以访问
    @GetMapping("/security/noauth")
    String noauth(){
        jedis.auth("test123");
        System.out.println("用户名："+jedis.get("username"));
        System.out.println("密码："+jedis.get("password"));
        System.out.println("年龄："+jedis.get("age"));
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("k1", "v1");
        Object k1 = ops.get("k1");
        ops.set("k2", "天健物业");
        System.out.println("***"+k1);
        System.out.println("***"+ops.get("k2"));
        return "noauth";
    }
    /* *
    *不需要token，就可以访问
    * */
    @GetMapping("/security/noauth2")
    String noauth2(){

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        ValueOperations ops = redisTemplate.opsForValue();
        System.out.println("***"+ops.get("k2"));
        return "noauth";
    }
    //==========step2:需要token，需要权限校验===========
    //需要token，需要common角色
    @GetMapping("/security/common")
    String common(){
        return "security common";
    }
    //需要token，需要admin角色
    @GetMapping("/security/manager")
    String manager(){
        return "security manager";
    }

    //==========step3:需要token，不需要权限校验===========
    @GetMapping("/security/needauth")
    String auth(){
        return "needauth";
    }
}

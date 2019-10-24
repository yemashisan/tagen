package com.tianjian.web.propertycommunal.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:TestController
 * @Description:登录
 * @author:liangxiaolei
 * @date:2019/5/24 14:47
 * @Version V1.0
 */
@RestController
public class SecurityController {
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

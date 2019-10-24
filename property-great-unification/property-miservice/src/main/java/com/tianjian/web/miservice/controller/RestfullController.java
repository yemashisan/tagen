package com.tianjian.web.miservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:RestfullController
 * @Description:index
 * @author:liangxiaolei
 * @date:2019/5/24 14:47
 * @Version V1.0
 */
@RestController
public class RestfullController {
    @RequestMapping("/index")
    String index(){
        return "hello new world";
    }
}

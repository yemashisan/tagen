package com.tianjian.web.entity.exception;

/**
 * @program: property-great-unification
 * @description: 登录异常类
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:58
 */
public class UnauthorizedException extends BaseException{
    public UnauthorizedException() {
    }

    public UnauthorizedException(String message) {
        super(message);
    }

    public UnauthorizedException(Integer code, String message) {
        super(code, message);
    }
}

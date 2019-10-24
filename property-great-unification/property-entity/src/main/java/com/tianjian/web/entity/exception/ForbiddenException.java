package com.tianjian.web.entity.exception;

/**
 * @program: property-great-unification
 * @description: 禁用的异常
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:32
 */
public class ForbiddenException extends BaseException{
    public ForbiddenException() {
        super();
    }

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(Integer code, String message) {
        super(code, message);
    }

}

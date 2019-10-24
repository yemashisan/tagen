package com.tianjian.web.entity.exception;

/**
 * @program: property-great-unification
 * @description: 参数错误异常
 * @Author: liangxiaolei
 * @Date: 2019/5/20 11:02
 */
public class ParamErrorException extends BaseException{
    public ParamErrorException() {
    }

    public ParamErrorException(String message) {
        super(message);
    }

    public ParamErrorException(Integer code, String message) {
        super(code, message);
    }
}

package com.tianjian.web.entity.exception;

/**
 * @program: property-great-unification
 * @description: 不存在的异常
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:02
 */
public class NotExistedException extends BaseException{
    public NotExistedException() {
    }

    public NotExistedException(String message) {
        super(message);
    }

    public NotExistedException(Integer code, String message) {
        super(code, message);
    }
}

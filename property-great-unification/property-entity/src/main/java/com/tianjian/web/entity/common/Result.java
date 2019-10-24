package com.tianjian.web.entity.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @program: property-great-unification
 * @description 返回结果包装类
 * Build构建者模式，优点：1.构造器private修饰，访问范围小;2.成员变量比较多的时候便于理解和管理
 * 知识点： 1.构建者模式
 *          2.@JsonInclude当属性为空时不进行返回
 * @Author: liangxiaolei
 * @Date: 2019/5/20 10:58
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value="返回结果实体类",description="返回结果实体类")
public class Result<T> implements Serializable {
    @ApiModelProperty(value = "状态码,0表示成功 其他表示失败", example = "0")
    private int code;

    @ApiModelProperty(value = "提示信息", example = "ADS_SUCCESS")
    private String message;

    @ApiModelProperty(value = "数据", example = "")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static<T> ResultBuiler<T> builder(){
        return new ResultBuiler<T>();
    }

    public static class ResultBuiler<T>{
        private int code;
        private String message;
        private T data;

        public ResultBuiler<T> code(int code){
            this.code = code;
            return this;
        }

        public ResultBuiler<T> message(String message){
            this.message = message;
            return this;
        }

        public ResultBuiler<T> data(T data){
            this.data = data;
            return this;
        }

        public Result<T> build(){
            return new Result<T>(this.code,this.message,this.data);
        }
    }
}

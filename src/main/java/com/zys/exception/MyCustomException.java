package com.zys.exception;

/**
 * @program: SSM-xml
 * @description:
 * @author: xiaozhang6666
 * @create: 2020-09-18 20:44
 **/
public class MyCustomException extends Exception {
    //定义成员变量: 所有的异常类都具备
    private String message;//错误原因

    //自定义异常类必须有message带参构造
    public MyCustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
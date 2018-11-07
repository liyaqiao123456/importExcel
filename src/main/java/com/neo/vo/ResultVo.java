package com.neo.vo;

/**
 * Created by Administrator on 2017/12/14.
 */
public class ResultVo<T> {

    private Integer code;  //  错误码

    private T data;  //  数据类型

    private String message;   //  提示消息

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

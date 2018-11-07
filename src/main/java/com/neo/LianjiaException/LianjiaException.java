package com.neo.LianjiaException;

import com.neo.enums.ResultEnum;
import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Administrator on 2017/12/12.
 */
public class LianjiaException extends RuntimeException {

    private Integer code;

    public LianjiaException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

   public LianjiaException(Integer code, java.lang.String message){

        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

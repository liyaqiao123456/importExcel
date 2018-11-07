package com.neo.util;

import com.neo.enums.ResultEnum;
import com.neo.vo.ResultVo;

/**
 * Created by Administrator on 2017/12/14.
 */
public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setData(object);
        resultVo.setMessage("成功");
        return resultVo;

    }

    public static ResultVo error(Integer code,String message){
        ResultVo resultVo = new ResultVo();
        resultVo.setMessage(message);
        resultVo.setCode(code);
        return resultVo;
    }

    public static ResultVo error(ResultEnum resultEnum){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(resultEnum.getCode());
        resultEnum.setMessage(resultEnum.getMessage());
        return  resultVo;
    }
    public static ResultVo success(){
        return null;
    }
}

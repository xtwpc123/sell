package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @author: Mr Wang
 * @date: 2019/6/1 19:29
 * @description:
 */

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}

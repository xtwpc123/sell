package com.imooc.enums;

import lombok.Getter;

/**
 * @author: Mr Wang
 * @date: 2019/3/12 21:50
 * @description: 订单状态
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消"),
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

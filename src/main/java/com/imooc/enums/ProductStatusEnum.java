package com.imooc.enums;

import lombok.Getter;

/**
 * @author: Mr Wang
 * @date: 2019/3/10 22:55
 * @description: 商品状态
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

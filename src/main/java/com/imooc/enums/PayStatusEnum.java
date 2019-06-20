package com.imooc.enums;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.Getter;

/**
 * @author: Mr Wang
 * @date: 2019/3/12 21:56
 * @description: 支付状态
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

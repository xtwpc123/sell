package com.imooc.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author: Mr Wang
 * @date: 2019/6/4 23:01
 * @description: 表单验证
 */
@Data
public class OrderForm {

    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家openid
     */
    @NotEmpty(message = "openid必填")
    private  String openid;

    /**
     * 购物车
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
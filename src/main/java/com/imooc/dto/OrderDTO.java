package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.dataobject.OrderDetail;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/6/1 18:58
 * @description:
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
/*
@JsonInclude(JsonInclude.Include.NON_NULL)（等效于在全局配置文件application.yml
中添加
 jackson:
    default-property-inclusion: non_null
 注：此处字段是非必需字段，即字段为null时则不返回给前台
 */

public class OrderDTO {

    /**
     * 订单
     */
    private String orderId;

    /**
     * 买家名字
     */
    private String buyerName;

    /**
     * 买家手机号
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信Openid
     */
    private String buyerOpenid;

    /**
     * 买家总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态,默认为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态，默认为0未支付
     */
    private Integer payStatus;

    /**
     * 创建时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 更新时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /**
     * 订单详情列表
     */
    List<OrderDetail> orderDetailList;
}

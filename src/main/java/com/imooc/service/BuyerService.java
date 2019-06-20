package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * @author: Mr Wang
 * @date: 2019/6/9 21:29
 * @description: 买家
 */

public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}

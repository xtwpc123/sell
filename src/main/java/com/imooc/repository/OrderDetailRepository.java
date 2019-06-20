package com.imooc.repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/3/12 22:11
 * @description:
 */

public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}

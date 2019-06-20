package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/3/10 20:53
 * @description:
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}

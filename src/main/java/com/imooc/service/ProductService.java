package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/3/10 22:47
 * @description:
 */

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void inCreaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOlist);



}

package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/3/10 20:22
 * @description:
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

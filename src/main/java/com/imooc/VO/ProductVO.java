package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: Mr Wang
 * @date: 2019/3/11 21:15
 * @description: 商品（包含类目）
 */
@Data
public class ProductVO {

    /**
     * 类目
     */
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}

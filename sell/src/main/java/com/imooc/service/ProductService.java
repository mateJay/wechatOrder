package com.imooc.service;

import com.imooc.bean.ProductInfo;
import com.imooc.dto.CartDTO;

import java.util.List;

public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     */
    List<ProductInfo> findUpAll();

    List<ProductInfo> findAll();

    ProductInfo save(ProductInfo productInfo);

    ProductInfo update(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}

package com.imooc.mapper;

import com.imooc.bean.ProductInfo;

import java.util.List;

public interface ProductInfoMapper {
    List<ProductInfo> findAll();
    ProductInfo findOneById(String productId);
    List<ProductInfo> findByProductStatus(Integer productStatus);
    void save(ProductInfo productInfo);
    void update(ProductInfo productInfo);

}

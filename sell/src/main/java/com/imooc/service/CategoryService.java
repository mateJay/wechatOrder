package com.imooc.service;

import com.imooc.bean.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory insertCategory(ProductCategory productCategory);
    ProductCategory updateCategory(ProductCategory productCategory);
}

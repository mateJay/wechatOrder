package com.imooc.mapper;

import com.imooc.bean.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {
    public ProductCategory getPrdCatById(Integer id);
    public void insertProCat(ProductCategory productCategory);
    public void updateProCat(ProductCategory productCategory);
    public List<ProductCategory> getAll();
    public List<ProductCategory> getPrdCatByList(List<Integer> categoryTypeList);
}

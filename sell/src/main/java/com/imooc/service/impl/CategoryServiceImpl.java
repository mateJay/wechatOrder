package com.imooc.service.impl;

import com.imooc.bean.ProductCategory;
import com.imooc.mapper.ProductCategoryMapper;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategoryMapper.getPrdCatById(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.getAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryMapper.getPrdCatByList(categoryTypeList);
    }

    @Override
    public ProductCategory insertCategory(ProductCategory productCategory) {
        productCategoryMapper.insertProCat(productCategory);
        return productCategory;
    }
    @Override
    public ProductCategory updateCategory(ProductCategory productCategory) {
        productCategoryMapper.updateProCat(productCategory);
        return productCategory;
    }
}

package com.imooc.service.impl;

import com.imooc.bean.ProductCategory;
import com.imooc.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() {
        List<ProductCategory> list = categoryService.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(2,3,4,8));
        System.out.println(list);
        //Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void insertCategory() {
        ProductCategory productCategory = new ProductCategory("大人最爱",2);
        ProductCategory result = categoryService.insertCategory(productCategory);
        System.out.println(result);
    }

    @Test
    public void updateCategory() {
        ProductCategory productCategory = new ProductCategory(4,"儿童最爱",6);
        ProductCategory result = categoryService.updateCategory(productCategory);
        System.out.println(result);
    }
}
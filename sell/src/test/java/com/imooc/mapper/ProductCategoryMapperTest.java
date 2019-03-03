package com.imooc.mapper;

import com.imooc.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryMapperTest {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void getPrdCatById() {
        ProductCategory productCategory = productCategoryMapper.getPrdCatById(1);
        System.out.println(productCategory);
    }
    @Test
    public void getAll(){
        List<ProductCategory> list = productCategoryMapper.getAll();
        System.out.println(list);
    }
    @Test
    public void insertProCat(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        productCategoryMapper.insertProCat(productCategory);
    }
    @Test
    @Transactional//添加事务，只测试，不在数据库中写入，完全回滚
    public void updateProCat(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(1);
        productCategory.setCategoryType(777);
        productCategory.setCategoryName("男生最爱");
        productCategoryMapper.updateProCat(productCategory);
    }
    @Test
    public void dynamicUpdate(){
        ProductCategory productCategory = productCategoryMapper.getPrdCatById(1);
        productCategory.setCategoryType(8);
        productCategoryMapper.updateProCat(productCategory);
    }

    @Test
    public void getPrdCatByList(){
        List<Integer> list = Arrays.asList(2,3,4,8);
        List<ProductCategory> result = productCategoryMapper.getPrdCatByList(list);
        Assert.assertNotEquals(0,result.size());
    }
}
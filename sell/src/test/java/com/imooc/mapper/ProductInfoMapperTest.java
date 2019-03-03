package com.imooc.mapper;

import com.imooc.bean.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoMapperTest {
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Test
    public void findAll(){
        List<ProductInfo> productInfoList = productInfoMapper.findAll();
        System.out.println(productInfoList);
    }
    @Test
    public void findOneById(){
        ProductInfo productInfo = productInfoMapper.findOneById("123456");
        System.out.println(productInfo);
    }
    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoMapper.findByProductStatus(0);
        System.out.println(list);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的粥");
        productInfo.setProductIcon("http://xxx.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(8);

        productInfoMapper.save(productInfo);
    }

    @Test
    public void update(){
        ProductInfo productInfo = productInfoMapper.findOneById("123456");
        productInfo.setProductStock(55);
        productInfoMapper.update(productInfo);

    }
}
package com.imooc.service.impl;

import com.imooc.bean.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        System.out.println(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        System.out.println(list);
    }

    @Test
    public void findAll() {
        List<ProductInfo> list = productService.findAll();
        System.out.println(list);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("http://xxxSS.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(8);

        productService.save(productInfo);
    }
}
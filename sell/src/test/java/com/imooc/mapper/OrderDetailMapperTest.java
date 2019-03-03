package com.imooc.mapper;

import com.imooc.bean.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Max;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailMapperTest {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Test
    public void save(){
        OrderDetail orderDetail =new OrderDetail();
        orderDetail.setDetailId("1234567800");
        orderDetail.setOrderId("11111111112");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductId("1212313");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(2.5));
        orderDetail.setProductQuantity(3);

        orderDetailMapper.save(orderDetail);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = new ArrayList<>();
        orderDetailList = orderDetailMapper.findByOrderId("11111111112");
        System.out.println(orderDetailList);
    }
}
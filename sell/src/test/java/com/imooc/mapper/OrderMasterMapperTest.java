package com.imooc.mapper;

import com.imooc.bean.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterMapperTest {
    @Autowired
    private OrderMasterMapper orderMasterMapper;

    private final String OPENID = "465456";

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("123465123465");
        orderMaster.setBuyerAddress("慕课网");
        orderMaster.setBuyerOpenid("OPENID");
        orderMaster.setOrderAmount(new BigDecimal(2.5));

        orderMasterMapper.save(orderMaster);
    }
    @Test
    public void update(){
        OrderMaster orderMaster = orderMasterMapper.findOne("123456");
        orderMaster.setBuyerName("师弟");
        orderMasterMapper.update(orderMaster);
    }
    @Test
    public void findOne(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster = orderMasterMapper.findOne("1538540101112922882");
        System.out.println(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() {
        List<OrderMaster> orderMasterList = new ArrayList<>();
        orderMasterList = orderMasterMapper.findByBuyerOpenid(OPENID);
        System.out.println(orderMasterList);
    }
}
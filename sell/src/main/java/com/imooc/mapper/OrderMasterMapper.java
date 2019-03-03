package com.imooc.mapper;

import com.imooc.bean.OrderMaster;

import java.util.List;

public interface OrderMasterMapper {
    OrderMaster findOne(String orderId);
    List<OrderMaster> findByBuyerOpenid(String openid);
    List<OrderMaster> findAll();
    void save(OrderMaster orderMaster);
    void update(OrderMaster orderMaster);
}

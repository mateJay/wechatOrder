package com.imooc.mapper;

import com.imooc.bean.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {
    void save(OrderDetail orderDetail);
    List<OrderDetail> findByOrderId(String orderId);
}

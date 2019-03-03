package com.imooc.service;

import com.imooc.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    //创建订单
    OrderDTO create(OrderDTO orderDTO);
    //查询单个订单
    OrderDTO findOne(String orderId);
    //查询订单列表
    List<OrderDTO> findList(String buyerOpenid);
    //查询所有订单
    List<OrderDTO> findList();
    //取消订单
    OrderDTO cancel(OrderDTO orderDTO);
    //完结订单
    OrderDTO finish(OrderDTO orderDTO);
    //支付订单
    OrderDTO paid(OrderDTO orderDTO);
}

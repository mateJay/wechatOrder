package com.imooc.service;

import com.imooc.dto.OrderDTO;

public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancel(String openid,String orderId);
}

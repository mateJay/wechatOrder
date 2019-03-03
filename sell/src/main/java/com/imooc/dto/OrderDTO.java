package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.bean.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)  对象为null则不返回 ，可在全局配置文件配置
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        if(orderStatus == 0){
            return OrderStatusEnum.NEW;
        }
        else if(orderStatus == 1){
            return OrderStatusEnum.FINISHED;
        }
        else{
            return OrderStatusEnum.CANCEL;
        }
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        if(payStatus == 0){
            return PayStatusEnum.WAIT;
        }
        else{
            return PayStatusEnum.SUCCESS;
        }
    }
}

package com.imooc.bean;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ProductInfo {
    private String productId;
    //名字
    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //商品描述
    private String productDescription;
    //图片
    private String productIcon;
    //商品状态，默认0正常 1下架
    private Integer productStatus;
    //类目编号
    private Integer categoryType;
}

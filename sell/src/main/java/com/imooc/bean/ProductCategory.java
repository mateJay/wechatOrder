package com.imooc.bean;

import lombok.Data;
//位于lombok包下，还有一个插件，自动生成getter setter tostring方法
@Data
public class ProductCategory {
    private Integer categoryId;

    private  String categoryName;

    private Integer categoryType;

    public ProductCategory(Integer categoryId, String categoryName, Integer categoryType) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}

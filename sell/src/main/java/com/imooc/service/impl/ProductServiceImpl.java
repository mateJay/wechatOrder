package com.imooc.service.impl;

import com.imooc.bean.ProductInfo;
import com.imooc.dto.CartDTO;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.mapper.ProductInfoMapper;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Override
    public ProductInfo findOne(String productId) {
        return productInfoMapper.findOneById(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoMapper.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfo> findAll() {
        return productInfoMapper.findAll();
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        productInfoMapper.save(productInfo);
        return productInfo;
    }

    @Override
    public ProductInfo update(ProductInfo productInfo) {
        productInfoMapper.update(productInfo);
        return productInfo;
    }

    @Override
    @Transactional
    public void increaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO : cartDTOList){
            ProductInfo productInfo = productInfoMapper.findOneById(cartDTO.getProductId());
            if(productInfo == null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
            productInfo.setProductStock(result);

            productInfoMapper.update(productInfo);
        }
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for(CartDTO cartDTO : cartDTOList){
            ProductInfo productInfo = productInfoMapper.findOneById(cartDTO.getProductId());
            if(productInfo == null){
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if(result < 0){
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            productInfoMapper.update(productInfo);
        }

    }
}

package com.junze.eshop.cache.service;


import com.junze.eshop.cache.model.ProductInfo;

/**
 * @Author: Junze
 * @Date: Create in 10:54 2017/6/28
 * @Description:
 */
public interface CacheService {

    ProductInfo saveLocalCache(ProductInfo productInfo);

    ProductInfo getLocalCache(Long id);
}

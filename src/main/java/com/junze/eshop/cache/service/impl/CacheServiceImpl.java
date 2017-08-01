package com.junze.eshop.cache.service.impl;

import com.junze.eshop.cache.model.ProductInfo;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.junze.eshop.cache.service.CacheService;


/**
 * @Author: Junze
 * @Date: Create in 10:57 2017/6/28
 * @Description:
 */
@Service("cacheService")
public class CacheServiceImpl implements CacheService {

    public static final String CACHE_NAME = "local";

    @Override
    @CachePut(value = CACHE_NAME,key = "'key'+ #productInfo.getId()")
    public ProductInfo saveLocalCache(ProductInfo productInfo) {
        return productInfo;
    }

    @Override
    @Cacheable(value = CACHE_NAME,key = "'key'+#id")
    public ProductInfo getLocalCache(Long id) {
        return null;
    }
}

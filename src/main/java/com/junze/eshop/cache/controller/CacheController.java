package com.junze.eshop.cache.controller;


import com.junze.eshop.cache.service.CacheService;
import com.junze.eshop.cache.model.ProductInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

/**
 * @Author: Junze
 * @Date: Create in 11:06 2017/6/28
 * @Description:
 */
@Controller
public class CacheController {

    @Resource
    private CacheService cacheService;

    @RequestMapping("/testSave")
    @ResponseBody
    public ProductInfo saveProductInfo(ProductInfo productInfo){
        return  cacheService.saveLocalCache(productInfo);
    }

    @RequestMapping("/testGet")
    @ResponseBody
    public ProductInfo getProductInfo(Long id){
        return cacheService.getLocalCache(id);
    }
}

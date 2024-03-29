package com.junze.eshop.cache.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: Junze
 * @Date: Create in 10:35 2017/6/28
 * @Description:
 */
@Configuration
@EnableCaching
public class CacheConfiguration {
    @Bean
    public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
        EhCacheManagerFactoryBean ehCacheManagerFactoryBean = new EhCacheManagerFactoryBean();
        ehCacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache.xml"));
        ehCacheManagerFactoryBean.setShared(true);
        return  ehCacheManagerFactoryBean;
    }
    @Bean
    public EhCacheCacheManager ehCacheCacheManager(){
        return new EhCacheCacheManager(ehCacheManagerFactoryBean().getObject());
    }
}

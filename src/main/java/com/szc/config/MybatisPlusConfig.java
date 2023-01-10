package com.szc.config;/**
 * @author T-Rex
 * @date 2021/11/16 - 0:07
 */

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program:myblog
 *@description:通过@mapperScan注解指定要变成实现类的接口所在的包，然后包下面的所有接口在编译之后都会生成相应的实现类
 *@author:31933
 @date:2021-11-16 00:07:49
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.szc.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}

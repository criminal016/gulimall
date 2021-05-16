package com.criminal.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 逻辑删除
 * 1，配置全局逻辑删除规则
 * 2，配置逻辑删除组件
 * 3，给对应的字段bean加上@Tablelogic注解
 *
 * 用jsr303做后端的校验 javax.validate
 */
@EnableDiscoveryClient
@MapperScan("com.criminal.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}

package com.criminal.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 使用nacos作为配置中心统一管理配置
 * 1，引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2，创建一个bootstrap.properties中配置
 *	spring.application.name=gulimall-coupon
 * 	spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3，在配置中心中添加一个数据集（dataid） gulimall-coupon.properties。默认规则是应用名.properties
 * 4，动态刷新配置
 * @RefreshScope
 * @Value("${xxxx}")
 * 配置中心有相同项目的话，优先使用配置中心的配置
 *
 */

@EnableDiscoveryClient //开启服务注册功能
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}

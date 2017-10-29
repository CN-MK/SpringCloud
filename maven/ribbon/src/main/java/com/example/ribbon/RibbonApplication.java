package com.example.ribbon;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient//向服务中心server注册
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}
	@Bean		//注册bean
	@LoadBalanced
// 开启负载均衡
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

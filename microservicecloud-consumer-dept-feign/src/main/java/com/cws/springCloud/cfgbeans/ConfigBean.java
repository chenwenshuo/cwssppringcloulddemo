package com.cws.springCloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//实现负载均衡主注解
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

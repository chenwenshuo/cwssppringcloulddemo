package com.cws.springCloud.cfgbeans;

import java.util.Random;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced//实现负载均衡主注解
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
		
		
	}
	
	/*@Bean
   public IRule mIRule() {
	return new RandomRule();//随机算法
}*/

}

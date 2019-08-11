package com.spring.cloudeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudEurekaClient3Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaClient3Application.class, args);
	}

}

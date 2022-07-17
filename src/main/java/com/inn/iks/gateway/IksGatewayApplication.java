package com.inn.iks.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class IksGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IksGatewayApplication.class, args);
	}

}

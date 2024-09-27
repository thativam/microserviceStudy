package com.gateway.aluraGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AluraGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraGatewayApplication.class, args);
	}

}

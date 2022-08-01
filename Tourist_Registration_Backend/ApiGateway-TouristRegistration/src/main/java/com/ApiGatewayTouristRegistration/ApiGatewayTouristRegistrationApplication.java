package com.ApiGatewayTouristRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayTouristRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayTouristRegistrationApplication.class, args);
	}

}

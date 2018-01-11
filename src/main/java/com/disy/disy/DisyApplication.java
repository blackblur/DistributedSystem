package com.disy.disy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DisyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisyApplication.class, args);
	}
}

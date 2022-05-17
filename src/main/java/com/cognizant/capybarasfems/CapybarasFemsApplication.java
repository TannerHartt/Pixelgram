package com.cognizant.capybarasfems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CapybarasFemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapybarasFemsApplication.class, args);
	}
}

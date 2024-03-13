package com.shantesh.obmunitsuserwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ObmUnitsUserWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObmUnitsUserWorkApplication.class, args);
	}

}

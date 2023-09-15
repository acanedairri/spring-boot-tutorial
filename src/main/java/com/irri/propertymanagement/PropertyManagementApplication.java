package com.irri.propertymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PropertyManagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(PropertyManagementApplication.class, args);
	}

}

package com.example.banking_demo.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.banking_demo.Configure"})
public class BankingDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankingDemoApplication.class, args);
	}

}




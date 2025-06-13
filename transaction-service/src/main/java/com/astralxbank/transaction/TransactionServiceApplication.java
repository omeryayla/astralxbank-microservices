package com.astralxbank.transaction;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

	@Value("${my.test-property}")
	private String testProperty;

	@PostConstruct
	public void printTestProperty() {
		System.out.println(">>> TEST PROPERTY: " + testProperty);
	}

}

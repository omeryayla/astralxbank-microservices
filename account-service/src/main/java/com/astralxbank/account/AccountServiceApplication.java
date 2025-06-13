package com.astralxbank.account;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	@Value("${my.test-property}")
	private String testProperty;

	@PostConstruct
	public void printTestProperty() {
		System.out.println(">>> TEST PROPERTY: " + testProperty);
	}


}

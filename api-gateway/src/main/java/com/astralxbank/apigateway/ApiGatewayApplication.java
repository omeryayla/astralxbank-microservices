package com.astralxbank.apigateway;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Value("${my.test-property}")
    private String testProperty;

    @PostConstruct
    public void printTestProperty() {
        System.out.println(">>> TEST PROPERTY: " + testProperty);

    }
}

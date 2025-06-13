package com.astralxbank.transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("/transaction/hello")
    public String hello() {
        return "Hello from Transaction Service";
    }
}

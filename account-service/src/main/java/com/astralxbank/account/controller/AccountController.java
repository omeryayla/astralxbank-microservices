package com.astralxbank.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account/hello")
    public String hello() {
        return "Hello from Account Service";
    }
}

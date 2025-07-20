package com.micro.accountservice.controller;

import com.micro.accountservice.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccountDetails() {
        return new Account("ACC12345", "Savings", 10000.0);
    }
}

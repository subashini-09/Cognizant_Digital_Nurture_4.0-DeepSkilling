package com.micro.loanservice.controller;

import com.micro.loanservice.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan getLoanDetails() {
        return new Loan("LOAN98765", "Home Loan", 500000.0);
    }
}

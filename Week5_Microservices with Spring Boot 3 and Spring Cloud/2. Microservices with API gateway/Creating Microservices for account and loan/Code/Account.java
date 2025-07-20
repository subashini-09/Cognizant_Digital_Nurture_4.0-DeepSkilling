package com.micro.accountservice.model;

public class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    // constructors, getters, setters
    public Account(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // getters and setters
}

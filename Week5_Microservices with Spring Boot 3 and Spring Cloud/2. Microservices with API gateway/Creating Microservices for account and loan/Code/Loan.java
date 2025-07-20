package com.micro.loanservice.model;

public class Loan {
    private String loanNumber;
    private String loanType;
    private double loanAmount;

    // constructors, getters, setters
    public Loan(String loanNumber, String loanType, double loanAmount) {
        this.loanNumber = loanNumber;
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    // getters and setters
}

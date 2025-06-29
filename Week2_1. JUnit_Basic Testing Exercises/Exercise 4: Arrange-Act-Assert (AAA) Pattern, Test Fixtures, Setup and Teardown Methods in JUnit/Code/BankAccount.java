package com.example.tdd1;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

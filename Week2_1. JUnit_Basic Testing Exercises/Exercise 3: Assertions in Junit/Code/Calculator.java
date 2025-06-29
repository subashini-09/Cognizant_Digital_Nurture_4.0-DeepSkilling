package com.example.tdd;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getWelcomeMessage() {
        return "Welcome to JUnit!";
    }

    public String getNullValue() {
        return null;
    }
}

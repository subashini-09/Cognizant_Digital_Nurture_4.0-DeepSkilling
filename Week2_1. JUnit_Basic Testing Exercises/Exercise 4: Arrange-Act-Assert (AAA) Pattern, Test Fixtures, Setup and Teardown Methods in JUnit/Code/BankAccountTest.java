package com.example.tdd1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @BeforeEach
    void setup() {
        account = new BankAccount(100); // Arrange
    }

    @AfterEach
    void teardown() {
        System.out.println("Test completed.");
    }

    @Test
    void testDeposit() {
        account.deposit(50); // Act
        assertEquals(150, account.getBalance()); // Assert
    }

    @Test
    void testWithdraw() {
        account.withdraw(30); // Act
        assertEquals(70, account.getBalance()); // Assert
    }

    @Test
    void testWithdrawTooMuch() {
        account.withdraw(200); // Act
        assertEquals(100, account.getBalance()); // Assert
    }
}

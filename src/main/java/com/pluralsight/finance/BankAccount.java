package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    String name;
    int accountNumber;
    BigDecimal balance;

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {
        return amount;
    }

    public double withdraw(double amount) {
        return amount;
    }

    public double getValue() {

        return getValue();
    }
}

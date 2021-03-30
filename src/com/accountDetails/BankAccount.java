package com.accountDetails;


public class BankAccount {

    private String accountNo;

    public BankAccount() {
        this.accountNo = "";
    }

    public BankAccount(String accountNumber) {
        this();
        this.accountNo = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNo;
    }

}

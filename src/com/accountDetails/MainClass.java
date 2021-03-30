package com.accountDetails;

import javax.swing.*;
import java.io.IOException;
import static java.lang.Double.isNaN;

public class MainClass {

    public static void main(String[] args) throws IOException {
        start();

    }

    public static void start() throws IOException {
        BankAccount account;
        int input = JOptionPane.showConfirmDialog(null, "Do you have an Account ? \n\nClick No to create one otherwise Yes");
        if(input == JOptionPane.NO_OPTION){
            account = openNewAccount();
        }else if(input == JOptionPane.YES_OPTION){
            account = new BankAccount(getAccountNumber());
        }else{
            return;
        }

        if(account.getAccountDetails().length < 2 ) {
            JOptionPane.showMessageDialog(null, "Account number is invalid! Try Again!");
            start();
        }

    }

    public static String getAccountNumber(){
        return JOptionPane.showInputDialog("Enter your account number");
    }

    public static BankAccount openNewAccount() throws IOException {
        String name = JOptionPane.showInputDialog("Enter your name").trim();
        return BankAccount.open(name);
    }
}

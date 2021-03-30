package com.accountDetails;

import javax.swing.*;
import java.io.IOException;

import static java.lang.Double.isNaN;

public class MainClass {

    public static void main(String[] args){

        try {
            begin();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("thank you!");
        }
    }

    public static void begin() throws IOException {
        com.accountDetails.BankAccount account;
        int input = JOptionPane.showConfirmDialog(null, "Do you have an account \n\n Click No to create one.");
        if(input == JOptionPane.NO_OPTION){
            account = openNewAccount();
        }else if(input == JOptionPane.YES_OPTION){
            account = new com.accountDetails.BankAccount(getAccountNumber());
        }else{
            return;
        }

        if(account.getAccountDetails().length < 2 ) {
            JOptionPane.showMessageDialog(null, "Invalid Account number! Try Again!");
            begin();
        }


        while(true){
            String output = "Name - "+account.getAccountDetails()[0]+"\nAccount number - "+account.getAccountNumber();
            output += "\nBalance - "+account.getAccountDetails()[1];
            String option = JOptionPane.showInputDialog(output+"\nSelect \n1 to deposit\n 2 for withdraw").trim();
            double amount;

            try{
                amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount").trim());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Incorrect Input! Try Again!");
                continue;
            }

            if(isNaN(amount) || amount < 0){
                JOptionPane.showMessageDialog(null, "Incorrect Input! Try Again!");
                continue;
            }

            if(option.equals("2")){
                amount = -amount;
            }

            account.processTransaction(new com.accountDetails.Transaction(amount));

        }

    }

    public static String getAccountNumber(){
        return JOptionPane.showInputDialog("Enter you account number");
    }

    public static com.accountDetails.BankAccount openNewAccount() throws IOException {
        String name = JOptionPane.showInputDialog("Enter your name").trim();
        return com.accountDetails.BankAccount.open(name);
    }
}

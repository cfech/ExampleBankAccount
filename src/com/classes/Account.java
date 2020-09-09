package com.classes;

import java.security.PublicKey;
import java.util.Random;

public class Account {
    Random rand = new Random();
    long accountNumber = rand.nextInt(100000000);
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    public Account(double balance, String customerName, String email, String phoneNumber ){
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double deposit) {
        if (deposit > 0) {
            this.balance += deposit;
            System.out.println("You have successfully deposited $" + deposit + " \n Your new balance is: $" + this.balance);
        } else {
            System.out.println("Please enter a value > 0" + " \n Your current balance is: $" + this.balance);
        }
    }

    public void withdraw(double withdraw) {
        if (withdraw > this.balance) {
            System.out.println("Sorry looks like you can withdraw a maximum of $" + this.balance);
        }
        if (withdraw > 0 && withdraw <= this.balance) {
            this.balance -= withdraw;
            System.out.println("You have withdrawn $" + withdraw + " \n Your new Balance is: $" + this.balance);

        }
        if (withdraw < 0) {
            System.out.println("Please enter a value > 0");
        }
    }

    public void getCustomerInfo(){
        System.out.println("Name = " + this.customerName);
        System.out.println("Email = " + this.email);
        System.out.println("Phone = " + this.phoneNumber);
        System.out.println("Account number = " + this.accountNumber);
    }
}

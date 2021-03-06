package com.classes;

import java.net.Socket;
import java.security.PublicKey;
import java.util.Random;

public class Account {
    Random rand = new Random();
    private long accountNumber = rand.nextInt(100000000);
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Constructor example 1 - defaults
    public Account() {
        //only use of this in this manner, must be first line in a default constructor

        this(123, "Test", "defualt email", "123-456-789");
        System.out.println("Default constructor called");
    }

    //Constructor example 2 - some defaults , some input
    public Account(String customerName, String email, String phoneNumber) {
        //for only starting with a default balance
        this(155, customerName, email, phoneNumber);
    }

    //example 3, all input
    public Account(double balance, String customerName, String email, String phoneNumber) {
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

    public void getCustomerInfo() {
        System.out.println("Name = " + this.customerName);
        System.out.println("Email = " + this.email);
        System.out.println("Phone = " + this.phoneNumber);
        System.out.println("Account number = " + this.accountNumber);
    }
}

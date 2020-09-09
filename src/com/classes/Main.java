package com.classes;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account myAccount = new Account();
        myAccount.setCustomerName("Connor Fech");
        myAccount.setEmail("cfech44@gmail.com");
        myAccount.setPhoneNumber("908-202-0463");
        myAccount.setBalance(0);

        System.out.println("Name = " + myAccount.getCustomerName());
        System.out.println("Email = " + myAccount.getEmail());
        System.out.println("Phone = " + myAccount.getPhoneNumber());
        System.out.println("Account number = " + myAccount.getAccountNumber());


        myAccount.deposit(1500);
        System.out.println("Balance: $" + myAccount.getBalance());
        myAccount.withdraw(500);

        myAccount.deposit(-50);
        myAccount.withdraw(20000);

        myAccount.deposit(1000);
        myAccount.withdraw(1000);

    }
}

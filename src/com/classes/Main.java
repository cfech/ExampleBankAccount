package com.classes;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account myAccount = new Account(0, "Connor Fech", "cfech44@gmail.com", "908-202-0463");

        myAccount.getCustomerInfo();

        myAccount.deposit(1500);
        System.out.println("Balance: $" + myAccount.getBalance());
        myAccount.withdraw(500);

        //tests for validation
        myAccount.deposit(-50);
        myAccount.withdraw(20000);
        //tests for validation


        myAccount.withdraw(1000);
        System.out.println("==================================================");
        // New account using different constructor
        Account secondAccount = new Account("Tim", "test@test.com", "123");
        secondAccount.getCustomerInfo();

        //Account using all defaults
        System.out.println("==================================================");
        Account defaultAccount = new Account();
        defaultAccount.getCustomerInfo();

    }
}

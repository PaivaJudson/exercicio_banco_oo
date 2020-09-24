package com.company.application;

import com.company.entities.Account;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Account c1 = new Account(100, "Judson Paiva", 10000.0);
        Account c2 = new Account(200, "Leonor José");

        System.out.println("Updated account data");
        c2.deposit(5000.02);
        c1.withdraw(50.0);

        System.out.println("Print account data");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

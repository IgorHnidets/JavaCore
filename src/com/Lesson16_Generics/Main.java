package com.Lesson16_Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TestUserService testUserService = new TestUserService();
        testUserService.users = new ArrayList<User>();
        testUserService.users.add(new User("Yura", new DebetAcc(1,21)));
        testUserService.users.add(new User("Vaska",new CreditAccount("2",23)));
        System.out.println("All users: ");
        testUserService.showAllUsers();
        System.out.println("IdAccounts: ");
        testUserService.showAllAccount();
        System.out.println("Taxes: ");
        testUserService.showTax();


    }
}

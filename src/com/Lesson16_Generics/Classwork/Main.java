package com.Lesson16_Generics.Classwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        TestUserService testUserService = new TestUserService();
        testUserService.users = new ArrayList<User>();
//        Map<String,TestUserService> testUserServiceMap = new HashMap<>();
        testUserService.users.add(new User("Yura", new DebetAcc(1,21)));
        testUserService.users.add(new User("Vaska",new CreditAccount("2",23)));
        testUserService.users.add(new User("Oleh",new CreditAccount("4",28)));
        testUserService.users.remove(1);
        System.out.println("All users: ");
        testUserService.showAllUsers();
        System.out.println("IdAccounts: ");
        testUserService.showAllAccount();
        System.out.println("Taxes: ");
        testUserService.showTax();


    }
}

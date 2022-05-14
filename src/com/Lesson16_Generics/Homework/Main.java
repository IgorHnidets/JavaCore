package com.Lesson16_Generics.Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        MyEntry myEntry = new MyEntry();
        myEntry.users = new ArrayList<User>();
        Map<String,MyEntry> myEntryMap = new HashMap<>();
//        myEntryMap.put(User,Account);
        
        myEntry.users.add(new User("Yura", new DebetAcc(1,21)));
        myEntry.users.add(new User("Vaska",new CreditAccount("2",23)));
        myEntry.users.add(new User("Oleh",new CreditAccount("4",28)));
        myEntry.users.remove(1);
        System.out.println("All users: ");
        myEntry.showAllUsers();
        System.out.println("IdAccounts: ");
        myEntry.showAllAccount();
        System.out.println("Taxes: ");
        myEntry.showTax();


    }
}

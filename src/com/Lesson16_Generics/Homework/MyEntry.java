package com.Lesson16_Generics.Homework;

import java.util.List;

public class MyEntry implements UserService<User, Account<Integer>> {
    List<User> users;

    public MyEntry() {
    }
    @Override
    public void showAllUsers(){
        for (User user:users){
            System.out.println(user.name);
        }
    }
    @Override
    public void showAllAccount(){
        for (User user:users){
            System.out.println(user.account.id);
        }
    }
    @Override
    public void showTax() {
        for (User user : users) {
            System.out.println(user.account.sum * 0.05);
        }
    }
}

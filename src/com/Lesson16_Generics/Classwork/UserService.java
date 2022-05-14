package com.Lesson16_Generics.Classwork;

public interface UserService <T extends  User, Account>{

    void showAllUsers();
    void showAllAccount();
    void showTax();
}

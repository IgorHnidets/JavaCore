package com.Lesson16_Generics.Classwork;

public class Account <T>{
    T id;
    Integer sum;

    public Account(T id, Integer sum) {
        this.id = id;
        this.sum = sum;
    }
}

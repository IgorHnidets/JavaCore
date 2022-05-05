package com.Lesson13_Map.Classwork;

public class Account {
    Integer id;
    String name;

    public Account(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

package com.Homework_4.Task3;

public class Animal {
    private String name;
    private double fast;
    private double age;

    public Animal(String name, double fast, double age) {
        this.name = name;
        this.fast = fast;
        this.age = age;
    }

    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFast() {
        return fast;
    }

    public void setFast(double fast) {
        this.fast = fast;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String toString() {
        return "Animal name = " + name + '\'' +
                ", fast=" + fast +
                ", age=" + age +
                "years}";
    }
}
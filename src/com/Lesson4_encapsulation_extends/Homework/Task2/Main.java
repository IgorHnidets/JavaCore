package com.Lesson4_encapsulation_extends.Homework.Task2;

public class Main {

    public static void main(String[] args) {
        Kermo kermo1 = new Kermo(2.3D);
        Kuzov kuzov1 = new Kuzov(1.4D);
        Koleso koleso = new Koleso(10D);
        Car car = new Car("red",1500,kermo1,kuzov1,koleso);
        kermo1.expand();
        koleso.increase();
        car.change();
        System.out.println(car.toString());
    }
}
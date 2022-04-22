package com.Homework_4.Task3;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Leopard",20,7);
        String name = animal.getName();
        double fast = animal.getFast();
        double age = animal.getAge();
        System.out.println("Name of animal : " + name + "\nSpeed of animal " + fast + "\nAge of animal " + age);
        Animal animal1 = new Animal();
        animal1.setName("Byk");
        animal1.setFast(2);
        animal1.setAge(14);

        System.out.println(animal1);

    }
}

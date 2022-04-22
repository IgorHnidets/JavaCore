package com.Lesson6_interface.Task2.SECOND;

//  Створіть інтерфейс Plus з методoм додати; Minus з методoм відняти; Multiply з методoм помножити; Devide з
//методoм поділити;
//створіть інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus, Minus, Multiply, Devide в пакеті
//first.
//Створіть пакет second в якому створіть клас MyCalculator і заімплементіть даному класу інтерфейс Numerable та
//задайте реалізацію всім методам даного інтерфейсу.
//Створіть метод мейн та створіть об’єкт класу MyCalculator , до якого викличте всі його методи . Результати
//арифметичних операцій виведіть на консоль.//
public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(100, 41);

        MyCalculator.Result(myCalculator.plus());
        MyCalculator.Result(myCalculator.minus());
        MyCalculator.Result(myCalculator.multiply());
        MyCalculator.Result(myCalculator.devide());
    }
}
// Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем,
// парним або непарним. Якщо користувач введе не ціле число, то повідомляти йому про помилку.
package com.Lesson8_exeption.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number : ");
            int number = scanner.nextInt();
            CheckNumber(number);

        } catch (InputMismatchException e) {
            throw new InputMismatchException("only integer number");
        }
    }

    public static void CheckNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
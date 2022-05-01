package com.Lesson12_Set_Queue.Classwork;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main1 {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (Purchase purchase : task1()) {
            System.out.println(purchase);
        }
    }
       private static Set<Purchase> task1() {
        Set<Purchase> purchases = new TreeSet<>();

        boolean IfContinur = true;

        while (IfContinur) {
            System.out.println("Enter product name: ");
            String name = scanner.next();

            if(name.equalsIgnoreCase("break")) {
                IfContinur = false;
            } else {
                System.out.println("Enter count : ");
                int counter = scanner.nextInt();
                purchases.add(new Purchase(name,counter));
            }
        }
        return purchases;
    }
}

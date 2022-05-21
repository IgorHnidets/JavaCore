package com.Lesson2_Arrays.Task3;


public class FibornacciArray {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 1;
        int f3;
        System.out.print(f1+" "+f2+" ");
        for (int i = 3; i <= 15; i++) {
            f3 = f1 + f2;
            System.out.print(f3 +" ");
            f1 = f2;
            f2 = f3;
        }
    }
    }

package com.Lesson2_Arrays.Task1;

public class Divide14 {

    public static void main(String[] args) {

        int[] numb = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i % 14 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

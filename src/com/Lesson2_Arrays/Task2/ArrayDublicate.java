package com.Lesson2_Arrays.Task2;

import java.util.Arrays;

public class ArrayDublicate {
    public static void main(String[] args) {
        int array[] = {11, 15, 26, 8625, 15236, 25, 11, 89, 73};
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == (array[j])) && (i != j)) {
                    System.out.println(array[j]);
                }
            }
        }
    }
}

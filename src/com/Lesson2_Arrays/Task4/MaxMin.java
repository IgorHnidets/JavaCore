package com.Lesson2_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] array1 = {216,66,65,56,546,56,6,54,646,99};

        int max = array1[0];
        int min = array1[0];
        for (int i = 1;i<array1.length;i++) {
            if (array1[i] > max) max = array1[i];
            if (array1[i] < min) min = array1[i];
        }
            System.out.println("Minimal : " + min);
            System.out.println("Maximal : " + max);
    }
}

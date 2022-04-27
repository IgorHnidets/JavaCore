package com.Lesson2_Arrays.Task5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {849,56,849,6546,984,6549,8495,564,46,9,88,98,848};
        SortAndPrint(array);
    }
    public static void SortAndPrint(int[] array1 ) {
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}

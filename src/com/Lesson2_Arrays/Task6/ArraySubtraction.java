package com.Lesson2_Arrays.Task6;

public class ArraySubtraction {
    public static void main(String[] args) {
        int[] arrayA = {55,65,646,165,4654,1651,15};
        int[] arrayB = {45,56,89,98,6546,654,955};
        int[] arrayC = new int[7];

        arrayC[0] = arrayA[0] - arrayB[0];
        arrayC[1] = arrayA[1] - arrayB[1];
        arrayC[2] = arrayA[2] - arrayB[2];
        arrayC[3] = arrayA[3] - arrayB[3];
        arrayC[4] = arrayA[4] - arrayB[4];
        arrayC[5] = arrayA[5] - arrayB[5];
        arrayC[6] = arrayA[6] - arrayB[6];

        for (int Sub : arrayC) {
            System.out.println("Result is " + Sub);
        }
    }
}

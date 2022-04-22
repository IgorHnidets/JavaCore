package com.Classwork.Classwork_18April;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words ");

//        String text1 = scanner.nextLine();

        String array[] = new String[5];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter " + (i + 1) + " word : ");
            array[i] = scanner.next();
        }

        String max = array[0];
        String min = array[0];
        int maxIndex = 0;
        int minIndex = 0;



        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= max.length()) {
                max = array[i];
                maxIndex=(i+1);
            } else if (array[i].length() <= min.length()){
                min=array[i];
                minIndex=(i+1);
            }
        }
        System.out.println("Max : " + max + ", index : " + maxIndex);
        System.out.println("Min : " + min + ", index : " + minIndex);
    }
}
package com.Lesson10_Collection_List;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter word: ");
        String input = scanner.nextLine();

        while (!input.equals("Break")) {
            list.add(input);

            System.out.println("Enter word retry");
            input = scanner.nextLine();
            }

        if (input.length() > 5) {
            System.out.println("More than 5: " + input.length());

            System.out.println("All your words" + list);
        }
    }
}

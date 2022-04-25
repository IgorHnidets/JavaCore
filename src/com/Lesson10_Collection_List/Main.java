package com.Lesson10_Collection_List;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> counter = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter word: ");
        String input = scanner.nextLine();

        while (!input.equals("Break")) {
            list.add(input);
            System.out.println("Enter word retry");
            input = scanner.nextLine();
            }

        String prefix = "s";
        for (String s:list) {
            if (s.startsWith(prefix)) {
                counter.add(s);
            }
            System.out.println("Start with s" + counter);

//        for (String f:list) {
//            if (f.length()>5) {
//                counter.add(f);
//            }
//
//        }
//        System.out.println("All your words" + list);
//        System.out.println("Have more than 5 :" + counter);
    }
}
}


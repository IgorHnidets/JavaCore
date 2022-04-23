package com.Lesson10_Collection_List.Classwork_22April;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What you want? ");
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            list.add(input);
            System.out.println("What you want?");
            input = scanner.nextLine();

        }
        System.out.println("Size of our order = " + list.size());
        System.out.println("All our dishes: \n" + list);

//        if (list.size()>2) {
//            list.remove(0);
//            list.remove(list.size() - 1);
//
//            System.out.println(""); }

        System.out.println("List after removing 1st and last: \n" + list);
        }
    }


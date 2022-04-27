//Зробити валідацію для емейл-адрес, зберігати лише ті, які закінчуються на @gmail.com
package com.Lesson9_Memory_RegEx.Homework.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        System.out.println("Enter your email : ");
        Scanner scanner = new Scanner(System.in);
        String em = scanner.nextLine();

        while (!em.isEmpty()) {
            list.add(em);
            System.out.println("Enter word retry");
            em = scanner.nextLine();
        }

        String end = "gmail.com";
        for (String ru : list) {
            if (ru.endsWith(end)) {
                list1.add(ru);
            }
        }
        System.out.println("Gmail.com adresses: " + list1);
    }
}
//        Pattern pattern = Pattern.compile("@lpnu.ua$");
//        Matcher matcher = pattern.matcher(em);
//
//        System.out.println("Email : " + matcher.find());

//        while (matcher.find()) {
//            System.out.println("Found match end " + matcher.start() + " to " + matcher.end());

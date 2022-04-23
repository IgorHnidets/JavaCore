package com.Lesson9_Memory_RegEx.Homework.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String em = scanner.next();

        Pattern pattern = Pattern.compile("@lpnu.ua$");
        Matcher matcher = pattern.matcher(em);

        System.out.println("Email : " + matcher.find());

//        while (matcher.find()) {
//            System.out.println("Found match end " + matcher.start() + " to " + matcher.end());
        }

    }


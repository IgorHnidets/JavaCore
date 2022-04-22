package com.Lesson9_Memory_RegEx.Homework.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "yurii.v.sidun@lpnu.ua";

        Pattern pattern = Pattern.compile("@lpnu.ua$");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found match end " + matcher.start() + " to " + matcher.end());
        }

    }
}

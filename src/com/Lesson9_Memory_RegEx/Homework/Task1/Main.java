package com.Lesson9_Memory_RegEx.Homework.Task1;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter please few words: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{L}+");
        Matcher matcher = pattern.matcher(words);

        while (matcher.find()) {
            String word = matcher.group();
            if(word.toLowerCase().startsWith("a"));
            System.out.println(word);

        }
    }
}

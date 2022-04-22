package com.Classwork.Classwork_20April;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {

    public static void main(String[] args) {

//	Person p1 = new Person("Bogdan", 45);
//    Person p2 = new Person("Anton",25);
//
//        System.out.println(p1.equals(p2));
//        System.out.println("P1 hash : " + p1.hashCode());
//        System.out.println("P2 hash : " + p2.hashCode());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        String text = scanner.next();

        Pattern pattern = Pattern.compile("^a");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Matches? " + matcher.matches());
        System.out.println("Find?" + matcher.find());
        System.out.println("Start : " + matcher.start());
        System.out.println("End : " + matcher.end());
    }
}

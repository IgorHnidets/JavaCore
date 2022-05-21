package com.Lesson20_Lambda.Classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Task2
        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Yulya", "Vadim", "Oleg"));
//        names.forEach(name -> System.out.println(name));
//        names.forEach(System.out::println);

//        names.forEach(element -> {
//            element = element.toUpperCase();
//            System.out.println(element);
//        });
//
//        StringBuilder string = new StringBuilder();
//        names.forEach(string::append);
//        System.out.println(string);

//        names.forEach((String elem) -> {
//            System.out.println(elem);
//            int countOfLetters = elem.length();
//            System.out.println("Count of letters : " + countOfLetters);
//        });

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Lilia",26),
                new Person("Oleg",15),
                new Person("Vasil",16),
                new Person("Yura",21),
                new Person("Andry",27),
                new Person("Vika",23)
        ));

        List<Person> adultList = new ArrayList<>();
        List<Person> underage = new ArrayList<>();
        List<Integer> ageList = new ArrayList<>();

        people.forEach(element-> {
            ageList.add(element.getAge());
            if (element.getAge()>= 18) adultList.add(element);
            else underage.add(element);
        });

        System.out.println("Adults");
        adultList.forEach(System.out::println);

        System.out.println("Under 18");
        adultList.forEach(System.out::println);

        System.out.println("Ages: ");
        ageList.forEach(System.out::println);

        System.out.println("After 5 years");
        ageList.forEach(age -> {
            age += 5;
                    System.out.println(age);
                });
    }
}


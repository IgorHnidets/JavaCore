package com.Lesson21.StreamsAPI.Homework;

import com.Lesson21.StreamsAPI.Classwork.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>(Arrays.asList(
                new People("Vasya",16,"man"),
                new People("Oleh",19,"man"),
                new People("Nastya",26,"woman"),
                new People("Ivan",21,"man"),
                new People("Yana",20,"woman"),
                new People("Mark",17,"man"),
                new People("Bodya",31,"man") ,
                new People("Mark",27,"man"),
                new People("Marysya",56,"woman"),
                new People("Petro",27,"man"),
                new People("MAKS",62,"man"),
                new People("Roma",14,"man"),
                new People("Vika",34,"woman"),
                new People("Anya",24,"woman"),
                new People("Alena",22,"woman"),
                new People("Yulya",24,"woman")
        ));
//     Task1
//        peopleList.stream().filter(people -> people.getSex()=="man").filter(people -> people.getAge()>=18&& people.getAge()<=27).forEach(System.out::println);
//        Task2
        double aver1 = peopleList.stream().filter(people -> people.getSex()=="man").mapToInt(People::getAge).average().getAsDouble();
        System.out.println("Average age: " + aver1);
//        Task3
//        peopleList.stream().filter(people -> people.getSex()=="man").filter(people -> people.getAge()>=18&& people.getAge()<=60).forEach(System.out::println);
//        peopleList.stream().filter(people -> people.getSex()=="woman").filter(people -> people.getAge()>=18&& people.getAge()<=55).forEach(System.out::println);
//       Task4
//        List<People> peopleSort = peopleList.stream().sorted(Comparator.comparing(People::getName))
//                .collect(Collectors.toList());
//        peopleSort.forEach(System.out::println);
//        Task5
//        System.out.println("Sort by name:");
//        List<People> peopleSort = peopleList.stream().sorted(Comparator.comparing(People::getName))
//                .collect(Collectors.toList());
//        peopleSort.forEach(System.out::println);
//        System.out.println("Sort by age:");
//        List<People> peopleSort1 = peopleList.stream().sorted(Comparator.comparing(People::getAge))
//                .collect(Collectors.toList());
//        peopleSort1.forEach(System.out::println);
//        Task6
//        People max = peopleList.stream().max(Comparator.comparing(People::getAge)).orElseThrow(NullPointerException::new);
//        System.out.println(max);
////        Task7
//        People min = peopleList.stream().min(Comparator.comparing(People::getAge)).orElseThrow(NullPointerException::new);
//        System.out.println(min);
//        Task8
//        long countMan = peopleList.stream().filter(people -> people.getSex()=="man").count();
//        System.out.println(countMan);
////        Task9
//        long countWoman = peopleList.stream().filter(people -> people.getSex()=="woman").count();
//        System.out.println(countWoman);
//        Task10
//        List<People> listA = peopleList.stream().filter(people -> people.getSex()=="woman").filter(people -> people.getName().contains("A"))
//                .collect(Collectors.toList());
//        listA.forEach(System.out::println);
    }
}

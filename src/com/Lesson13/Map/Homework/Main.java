package com.Lesson13.Map.Homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub("ZooClub");

        Animal animal1 = new Animal("dog","Joe");
        Animal animal2 = new Animal("cat","Tom");
        Animal animal3 = new Animal("mouse","Gerry");
        Animal animal4 = new Animal("horse","lavrov");
        Animal animal5 = new Animal("chiken","juzya");


        Person person1 = new Person("Oleg",19);
        Person person2 = new Person("Misha" , 20);
//
//        Map<ZooClub,List<Person>> map2 = new HashMap<ZooClub,List<Person>>();
//        map2.put(zooClub,new ArrayList<Person>());
//        map2.get(zooClub).add(person1);
//        map2.get(zooClub).add(person2);
//
//        Map<Person, List<Animal>> map1=new HashMap<Person,List<Animal>>();
//        map1.put(person1,new ArrayList<Animal>());
//        map1.get(person1).add(animal1);
//        map1.get(person1).add(animal2);
//        map1.get(person1).add(animal5);
//        map1.get(person1).remove(animal2);
//
//        map1.put(person2,Arrays.asList(animal3,animal4));
//        map1.get(person2).add(animal2);

        Map<ZooClub,List<Person>> map2 = new HashMap<ZooClub,List<Person>>();
        map2.put(zooClub,new ArrayList<Person>());

        Map<Person, List<Animal>> map1=new HashMap<Person,List<Animal>>();
        map1.put(person1,new ArrayList<Animal>());
        map1.put(person2,new ArrayList<Animal>());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter what you want to do: ");
        String input = scanner.nextLine();

        while (!input.equals("Exit")) {
            switch (input) {
                case "Add Misha":
                    map2.get(zooClub).add(person2);
                    System.out.println(map2);
                    break;
                case "Add Oleh":
                    map2.get(zooClub).add(person1);
                    System.out.println(map2);
                    break;
                case "Remove Misha":
                    map2.get(zooClub).remove(person2);
                    System.out.println(map2);
                    break;
                case "Remove Oleg":
                    map2.get(zooClub).remove(person1);
                    System.out.println(map2);
                    break;
                case "Add dog to Misha":
                    map1.get(person2).add(animal1);
                    System.out.println(map1);
                    break;
                case "Add dog to Oleh":
                    map1.get(person1).add(animal1);
                    System.out.println(map1);
                    break;
                case "Add cat to Misha":
                    map1.get(person2).add(animal2);
                    System.out.println(map1);
                    break;
                case "Add cat to Oleh":
                    map1.get(person1).add(animal2);
                    System.out.println(map1);
                    break;

            }
            System.out.println("Enter retry");
            input = scanner.nextLine();
        }

//        System.out.println(map1);
//
//        System.out.println("Club member: " + map2);

    }
}

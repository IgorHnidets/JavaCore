package com.Lesson20_Lambda.Classwork;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Task1
       Person person1 = new Person("Vova",25);
       Person person2 = new Person();
       Person person3 = null;

        Optional<Person> optional1 = Optional.of(person1);
        optional1.ifPresent(System.out::println);

        Optional<Person > optional2 = Optional.of(person2);
        optional2.ifPresent(System.out::println);

        Optional<Person> optional3 = Optional.ofNullable(person3);
        optional3.ifPresent(System.out::println);
        System.out.println(optional3.orElse(new Person("Misha",40)));
        System.out.println(optional3.orElseGet(()->new Person("Dima",20)));
        System.out.println(optional3.orElseThrow(()-> new NullPointerException()));
    }
}

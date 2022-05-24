package com.Lesson21.StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList("Today","is","good","weather",".","The","sun","is","shuny"));
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Alla",35),
                new Person("Oleg",23),
                new Person("Yura",32),
                new Person("Lesya",19),
                new Person("Bodya",27)
                ));

        List<String> data = new ArrayList<>(Arrays.asList("Today is good weather","The sun is shining"));

//        fillter text
//        text.stream().filter((word->word.length()>4)).forEach(System.out::println);

//        skip text
//        text.stream().skip(5).forEach(System.out::println);

//        distinct text
//        text.stream().distinct().forEach(System.out::println);

//        filter+skip+distinct text
//        text.stream().distinct().skip(1).filter(word->word.length()>=3).forEach(System.out::println);
//
//        map text
//        text.stream().map(String::toUpperCase).forEach(System.out::println);

//        peek people
//        people.stream().peek(person -> {
//            person.setName(person.getName().toUpperCase());
//            person.setTimeStamp(new Date(System.currentTimeMillis()));
//        }).forEach(System.out::println);

//        limit people
//        people.stream().filter(person -> person.getAge()>=18).limit(1).forEach(System.out::println);

//        sorted by name people
//        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);

//        flatMap data
//        List<String> words = data.stream().flatMap(str->Arrays.stream(str.split(" "))).collect(Collectors.toList());
//        words.forEach(System.out::println);

//        findFirst and findEnd people
//        Person person = people.stream().sorted(Comparator.comparing(Person::getName))
//                .findAny().orElseThrow(NullPointerException::new);
//        System.out.println(person);

//        collect people
//        List<Person> personSorted = people.stream().sorted(Comparator.comparing(Person::getName))
//                .collect(Collectors.toList());
//        personSorted.forEach(System.out::println);

//        anymatch allmatch nonematch people
        boolean anymatch = people.stream().anyMatch(person -> person.getName().contains("i"));
        boolean allmatch = people.stream().allMatch(person -> person.getName().contains("i"));
        boolean nonematch = people.stream().anyMatch(person -> person.getName().length()<=4);

        System.out.println(allmatch);
        System.out.println(anymatch);
        System.out.println(nonematch);

//Min and Max people
       Person min = people.stream().min(Comparator.comparing(Person::getAge)).orElseThrow(NullPointerException::new);
      Person max = people.stream().max(Comparator.comparing(Person::getAge)).orElseThrow(NullPointerException::new);
        System.out.println(max);
        System.out.println(min);



    }

}

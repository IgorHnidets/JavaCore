package com.Lesson13.Map.Classwork;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(1,"acc1");
        Account account2 = new Account(2,"acc2");
        Account account3 = new Account(3,"acc3");

        Person p1 = new Person(1,"Person1");
        Person p2 = new Person(2,"Person2");
        Person p3 = new Person(3,"Person3");

        Map<Person, List<Account>> map1 = new HashMap<Person,List<Account>>();
        map1.put(p1,new ArrayList<Account>());
        map1.get(p1).add(account1);
        map1.get(p1).add(account3);

        map1.put(p2, Arrays.asList(account3,account2));
        map1.put(p3,Arrays.asList((new Account(4,"Acc4"))));

        map1.get(p1).remove(account3);
        map1.put(p1,Arrays.asList((new Account(5,"Acc5"))));

        System.out.println(map1);
    }
}

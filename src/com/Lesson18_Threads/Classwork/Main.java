package com.Lesson18_Threads.Classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws InterruptedException {
//        ???????? 1
//        System.out.println("Start");
//        long starttime = System.currentTimeMillis();
//        Thread.sleep(7000);
//        long sleepingTime = (System.currentTimeMillis() - starttime) / 1000;
//        System.out.println(" I sleep " + sleepingTime + " seconds ");
//         ???????? 2
        List<String > p1 = new ArrayList<>(Arrays.asList("Anton","Nastya" ,"Mike","Henry","Pedro"));
        List<String > p2 = new ArrayList<>(Arrays.asList("Igor","Mark" ,"Vika","Oleh","Vadim"));
        PeopleQueue peopleQueue1 = new PeopleQueue(p1);
        PeopleQueue peopleQueue2 = new PeopleQueue(p2);

//        peopleQueue1.start();
//        peopleQueue2.start();
////      ??? ????????????????
//        peopleQueue1.run();
//        peopleQueue2.run();
//        ???????? 3
        peopleQueue1.start();
        peopleQueue1.join();
        peopleQueue2.start();

    }
}

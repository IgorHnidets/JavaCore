package com.Lesson18_Threads.Classwork;

import java.util.List;

public class PeopleQueue extends Thread{

    private List<String> people;

    public PeopleQueue(List<String> people) {
        this.people = people;
    }

    @Override
    public void run(){
        for (String person : people){
            System.out.println("Documents are processed for:" + person);
            try {
                sleep(4000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

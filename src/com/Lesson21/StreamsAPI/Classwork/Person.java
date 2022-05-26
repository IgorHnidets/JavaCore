package com.Lesson21.StreamsAPI.Classwork;

import java.util.Date;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private Date timeStamp;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(timeStamp, person.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, timeStamp);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public int compareTo(Person person){
        return this.getAge()-person.getAge();
    }
}

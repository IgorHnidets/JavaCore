package com.Lesson20_Lambda.Classwork;

import java.util.Date;
import java.util.Objects;

public class Person {
    private  String name;
    private int age;
    private Date timatamp;

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

    public Date getTimatamp() {
        return timatamp;
    }

    public void setTimatamp(Date timatamp) {
        this.timatamp = timatamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(timatamp, person.timatamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, timatamp);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", timatamp=" + timatamp +
                '}';
    }
}

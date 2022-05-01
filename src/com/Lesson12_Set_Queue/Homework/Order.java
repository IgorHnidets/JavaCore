package com.Lesson12_Set_Queue.Homework;

import com.Lesson11_Interator_Comparator.Homework.Commodity;

import java.util.Comparator;
import java.util.Objects;

public class Order implements Comparable<Order> {
    private String name;
    private int value;

    public Order(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order aClass = (Order) o;
        return value == aClass.value && name.equals(aClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
    @Override
    public int compareTo(Order o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = (int)(this.value - o.value);
        }
        return result;
    }

    public static Comparator<Order> valueC() {
        Comparator<Order> valueC = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return (int) (o1.getValue() - o2.getValue());
            }
        };
        return valueC;
    }
    }

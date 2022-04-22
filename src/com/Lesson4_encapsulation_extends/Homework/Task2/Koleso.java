package com.Lesson4_encapsulation_extends.Homework.Task2;

public class Koleso {

    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Koleso(double size) {
        this.size = size;
    }

    public String toString() {
        return "Koleso{" + "size=" + size + '}';
    }

    public void increase() {this.size *=2.0D;}

}

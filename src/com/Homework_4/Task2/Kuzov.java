package com.Homework_4.Task2;

public class Kuzov {

    private double lenght;

    public Kuzov(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getLength() {
        return this.lenght ;
    }

    public String toString() {
        return ", Kuzov length = " + this.lenght ;
    }
}

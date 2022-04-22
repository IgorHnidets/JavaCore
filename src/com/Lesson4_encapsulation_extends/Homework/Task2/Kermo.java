package com.Lesson4_encapsulation_extends.Homework.Task2;

public class Kermo {

    private double diameter;

    public Kermo(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String toString() {return "Kermo{" + "diameter=" + this.diameter + '}';
    }

    public void expand() {++this.diameter ;}
}
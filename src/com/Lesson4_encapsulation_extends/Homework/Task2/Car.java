package com.Lesson4_encapsulation_extends.Homework.Task2;

public class Car {

    private String colour;
    private double price;
    private Kermo kermo;
    private  Kuzov kuzov;
    private  Koleso koleso;

    public Car(String colour, double price, Kermo kermo, Kuzov kuzov, Koleso koleso) {
        this.colour = colour;
        this.price = price;
        this.kermo = kermo;
        this.kuzov = kuzov;
        this.koleso = koleso;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Kermo getKermo() {
        return kermo;
    }

    public void setKermo(Kermo kermo) {
        this.kermo = kermo;
    }

    public Kuzov getKuzov() {
        return kuzov;
    }

    public void setKuzov(Kuzov kuzov) {
        this.kuzov = kuzov;
    }

    public Koleso getKoleso() {
        return koleso;
    }

    public void setKoleso(Koleso koleso) {
        this.koleso = koleso;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + this.colour + '\'' +
                ", price=" + this.price +
                ", kermo=" + this.kermo +
                ", kuzov=" + this.kuzov +
                ", koleso=" + this.koleso +
                '}';
    }
    public void change() {this.price /= 1.5D;}
}
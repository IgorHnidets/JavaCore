package com.Lesson14_Reflection_API.Homework;

public class Apple {
    private String name;
    public int id;
    double price;
    protected int count;

    public Apple(String name, int id, double price, int count) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.count = count;
    }

    public Apple(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Apple(double price) {
        this.price = price;
    }

    public Apple() {

    }

    private void  Parameter(String param) {
        System.out.println(price+ " : " + param);
    }

    protected double TotalPrice() {
        return price*count;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    void NameUp() {
        String name = this.getName();
        this.setName(String.valueOf(name.charAt(0)).toUpperCase());
    }


    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}

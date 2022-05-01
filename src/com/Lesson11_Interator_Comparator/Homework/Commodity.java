package com.Lesson11_Interator_Comparator.Homework;

import com.Lesson11_Interator_Comparator.Classwork.Product;

import java.util.Comparator;
import java.util.Objects;

public class Commodity implements Comparable<Commodity>{
    private String name;
    private int lenght;
    private int width;
    private double weight;

    public Commodity(String name, int lenght, int width, double weight) {
        this.name = name;
        this.lenght = lenght;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return lenght == commodity.lenght && width == commodity.width && Double.compare(commodity.weight, weight) == 0 && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lenght, width, weight);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", lenght=" + lenght +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
    int result = this.name.compareTo(o.name);
        if (result == 0) {
        result = (int)(this.lenght - o.lenght);
    }
        return result;
}

    //    public static Comparator<Commodity> departmentL() {
//        Comparator<Commodity> departmentL = new Comparator<Product>() {
//            @Override
//            public int compare(Commodity o1, Commodity o2) {
//                return o2.getLenght().compareTo(o1.getLenght());
//            }
//        };
//        return departmentC;
//    }
    public static Comparator<Commodity> lenghtC() {
        Comparator<Commodity> lenghtC = new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getLenght() - o2.getLenght());
            }
        };
        return lenghtC;
    }

    public static Comparator<Commodity> widthC() {
        Comparator<Commodity> widthC = new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getWidth() - o2.getWidth());
            }
        };
        return widthC;
    }

    public static Comparator<Commodity> weightC() {
        Comparator<Commodity> weightC = new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        };
        return weightC;
    }
}
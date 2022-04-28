package com.Lesson11_Interator_Comparator.Classwork;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private double price;
    private long idcode;
    private String departament;

    public Product(String name, double price, long idcode, String departament) {
        this.name = name;
        this.price = price;
        this.idcode = idcode;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getIdcode() {
        return idcode;
    }

    public void setIdcode(long idcode) {
        this.idcode = idcode;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && idcode == product.idcode && Objects.equals(name, product.name) && Objects.equals(departament, product.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, idcode, departament);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", idcode=" + idcode +
                ", departament='" + departament + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = (int)(this.price - o.price);

        }
        return result;
    }

    public static Comparator<Product> departmentC() {
        Comparator<Product> departmentC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getDepartament().compareTo(o1.getDepartament());
            }
        };
        return departmentC;
    }
    public static  Comparator<Product> priceC() {
        Comparator<Product> priceC = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };
        return priceC;
    }

}

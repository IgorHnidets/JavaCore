package com.Lesson11_Interator_Comparator.Classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Tomate", 30.9, 5423623, "Vegetables");
        Product product2 = new Product("Skumbria", 32, 5623623, "Fish");
        Product product3 = new Product("Soap", 52.4, 5613623, "Bath");
        Product product4 = new Product("Avocado", 39.9, 5423651, "Vegetables");
        Product product5 = new Product("Tomate", 30.9, 5423623, "Vegetables");
        Product product6 = new Product("Milk", 40.9, 5653623, "DailyP");
        Product product7 = new Product("Cheese", 60.9, 5452623, "Cheese");

        List<Product> productList = new ArrayList<>(Arrays.asList(product1, product2, product3, product4, product5, product6, product7));

        System.out.println("Sorted name: ");
        Collections.sort(productList);
        show(productList);

        System.out.println("Sorted by Price: ");
        Collections.sort(productList, Product.priceC());
        show(productList);

        System.out.println("Sorted by Department: ");
        Collections.sort(productList, Product.departmentC());
        show(productList);
    }
    private static void show(List<Product> products) {
        for (Product product: products) {
            System.out.println(product);
        }





    }
}

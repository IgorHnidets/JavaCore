package com.Lesson12_Set_Queue.Homework;

import com.Lesson11_Interator_Comparator.Homework.Commodity;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (Order order : task1()) {
            System.out.println(order);
        }
        List<Order> orderList = new ArrayList<>(task1());

        System.out.println("Sorted name: ");
        Collections.sort(orderList);
        show(orderList);

        System.out.println("Sorted by Value: ");
        Collections.sort(orderList, Order.valueC());
        show(orderList);
    }
    private static Set<Order> task1() {
    Set<Order> orders = new TreeSet<>();

    boolean IfContinue = true;

    while (IfContinue) {
        System.out.println("Enter product name ");
        String name = scanner.next();

        if (name.equalsIgnoreCase("Break")) {
            IfContinue = false;
        }else {
            System.out.println("Enter value: ");
            int value = scanner.nextInt();
            orders.add(new Order(name,value));
        }
    }
        return orders;
        }

    private static void show(List<Order> orders) {
        for (Order order: orders) {
            System.out.println(order);
        }}
    }


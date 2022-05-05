package com.Lesson14_Reflection_API.Homework;


import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException,InstantiationException,NoSuchMethodException, InvocationException, InvocationTargetException {

//        Class<Apple> appleClass =(Class<Apple>) Class.forName("com.Lesson14_Reflection_API.Homework.Apple");

        Apple apple = new Apple();
        Class<Apple> appleClass = (Class<Apple>) apple.getClass();

//        Class<Apple> appleClass = Apple.class;
        System.out.println("Fields:");
        System.out.println(Arrays.toString(appleClass.getFields()));
        System.out.println(Arrays.toString(appleClass.getDeclaredFields()) );
        System.out.println("Methods:");
        System.out.println(Arrays.toString(appleClass.getMethods()));
        System.out.println(Arrays.toString(appleClass.getDeclaredMethods()));
        System.out.println("Constructors:");
        System.out.println(Arrays.toString(appleClass.getConstructors()));

        Apple apple1 = appleClass.newInstance();
        apple.setName("IPhone");
        apple.setCount(50);
        apple.setId(123456);
        apple.setPrice(1000);
        System.out.println(apple1);
        System.out.println(apple1.TotalPrice());


    }
}

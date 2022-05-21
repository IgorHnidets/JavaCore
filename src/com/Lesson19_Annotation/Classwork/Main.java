package com.Lesson19_Annotation.Classwork;


public class Main {

    public static void main(String[] args) {
//        Task1
//        System.out.println(concat("test","that"));
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//    }
//    public static String concat(String... element){
//        return Arrays.toString(element);
//    }


//        Task2
        System.out.println(multiply(10,95)+" , "+add(835.23,464.77));
    }
    @Math(reason = "for adding two numbers",name = "Ihor")
    public static double add(double n1,double n2){
        return n1+n2;
    }
    @Math(reason = "multiply",name = "Ihor")
    public static int multiply(int i1,int i2){
        return i1*i2;
    }
}

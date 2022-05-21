package com.Lesson20_Lambda.Homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<VariablesX> varr = new ArrayList<>(Arrays.asList(
//                new VariablesX(5),
//                new VariablesX(64),
//                new VariablesX(8)
//                ));
//
//        List<Integer> varrList = new ArrayList<>();
//        List<VariablesX> more18 = new ArrayList<>();
//        List<VariablesX> less18 = new ArrayList<>();

//        varr.forEach(element-> {
//            varrList.add(element.getVariable());
//            if (element.getVariable()>= 18) more18.add(element);
//            else less18.add(element);
//        });
//        System.out.println("More 18:");
//        more18.forEach(System.out::println);



//       Other method
//       IntVar suma = new IntVar() {
//           @Override
//           public int sum(int a, int b, int c) {
//               return a+b+c;
//           }
//       };
//        System.out.println(suma.sum(1,5,3));


       IntVar suma2 = (a,b,c)-> a+b+c;
       IntVar middle = (a,b,c)->(a+b+c)/2 ;
       IntVar max = (a,b,c)->Math.max(b,c);


        System.out.println(suma2.sum(1,6,36));
        System.out.println(middle.sum(3,7,4));
        System.out.println(max.sum(1,54,56));
        }
    }


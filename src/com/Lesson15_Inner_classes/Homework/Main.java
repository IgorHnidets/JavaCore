package com.Lesson15_Inner_classes.Homework;

import com.Lesson11_Interator_Comparator.Classwork.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Commodity1> commodity1ArrayList = new ArrayList<Commodity1>();

        commodity1ArrayList.add(new Commodity1("Notebook", 20, 30, 10.4));
        commodity1ArrayList.add(new Commodity1("DVD", 40, 10, 17.4));
        commodity1ArrayList.add(new Commodity1("Telephone", 30, 10, 1.4));
        commodity1ArrayList.add(new Commodity1("PC", 50, 20, 40.4));

        Collections.sort(commodity1ArrayList, new Comparator<Commodity1>() {
            @Override
            public int compare(Commodity1 o1, Commodity1 o2) {
                if (o1.lenght < o2.lenght) {
                    return 1;
                }
                ;
                return -1;
            }
        });
        System.out.println("Sort by lenght: ");
        for (Commodity1 Commody : commodity1ArrayList) {
            System.out.println(Commody.name + " + " + Commody.lenght);
        }

        Collections.sort(commodity1ArrayList, new Comparator<Commodity1>() {
            @Override
            public int compare(Commodity1 o1, Commodity1 o2) {
                if (o1.width < o2.width) {
                    return 1;
                }
                return -1;
            }
        });
        System.out.println("Sort by width: ");
        for (Commodity1 Commody1 : commodity1ArrayList) {
            System.out.println(Commody1.name + " + " + Commody1.width);
        }

        Collections.sort(commodity1ArrayList, new Comparator<Commodity1>() {
            @Override
            public int compare(Commodity1 o1, Commodity1 o2) {
                if (o1.weight < o2.weight) {
                    return 1;
                }
                ;
                return -1;
            }
        });
        System.out.println("Sort by weight: ");
        for (Commodity1 Commody2 : commodity1ArrayList) {
            System.out.println(Commody2.name + " + " + Commody2.weight);
        }

//        Collections.sort(commodity1ArrayList, new Comparator<Commodity1>() {
//         @Override
//        public int compare(Product o) {
//            int result = this.name.compareTo(o.name);
////
////            return result;
//        }
//    });
    }
}

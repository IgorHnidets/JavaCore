//  Посортувати за назвою,довжиною,шириною,вагою.Виводимо і-ті елементи колекції, допоки не введемо Exit
package com.Lesson11_Interator_Comparator.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Commodity commodity1 = new Commodity("Notebook", 20, 30, 10.4);
        Commodity commodity2 = new Commodity("DVD", 40, 10, 17.4);
        Commodity commodity3 = new Commodity("Telephone", 30, 10, 1.4);
        Commodity commodity4 = new Commodity("PC", 50, 20, 40.4);

        List<Commodity> commodityList = new ArrayList<>(Arrays.asList(commodity1, commodity2, commodity3, commodity4));

        System.out.println("Sorted name: ");
        Collections.sort(commodityList);
        show(commodityList);

        System.out.println("Sorted by Lenght: ");
        Collections.sort(commodityList, Commodity.lenghtC());
        show(commodityList);

        System.out.println("Sorted by Width: ");
        Collections.sort(commodityList, Commodity.widthC());
        show(commodityList);

        System.out.println("Sorted by Weight: ");
        Collections.sort(commodityList, Commodity.weightC());
        show(commodityList);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter commodity element: ");
//        String input = scanner.nextLine();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter commodity element: ");
//        String input = scanner.nextLine();

//        while (!input.equals("Exit")) {
//            switch (input) {
//                case "1":
//                    System.out.println(commodity1);
//                    break;
//                case "2":
//                    System.out.println(commodity2);
//                    break;
//                case "3":
//                    System.out.println(commodity3);
//                    break;
//                case "4":
//                    System.out.println(commodity4);
//                    break;
//            }
//            System.out.println("Enter element retry");
//            input = scanner.nextLine();
//        }


//        if (input.equals("1")) {
//            System.out.println(commodity1);
//        } else if (input.equals("2")) {
//            System.out.println(commodity2);
//        } else if (input.equals("3")) {
//            System.out.println(commodity3);
//        } else if (input.equals("4")) {
//            System.out.println(commodity4); }
    }

    private static void show(List<Commodity> commodities) {
        for (Commodity commodity : commodities) {
            System.out.println(commodity);
        }
    }
}

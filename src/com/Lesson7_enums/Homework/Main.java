package com.Lesson7_enums.Homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mounth = askUser();
        checkOnParity(mounth);
    }

    public static String askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mounth : ");
        return scanner.next();
    }

    public static void checkOnParity(String month1) {
        Parne_ne_parne month = Parne_ne_parne.valueOf(month1.toUpperCase());
        switch (month) {
            case DECEMBER: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.DECEMBER.ordinal());
                break;
            }
            case JANUARY: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.JANUARY.ordinal());
                break;
            }
            case FEBRUARY: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.FEBRUARY.ordinal());
                break;
            }
            case MARCH: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.MARCH.ordinal());
                break;
            }
            case APRIL: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.APRIL.ordinal());
                break;
            }
            case MAY: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.MAY.ordinal());
                break;
            }
            case JUNE: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.JUNE.ordinal());
                break;
            }
            case JULY: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.JULY.ordinal());
                break;
            }
            case AUGUST: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.AUGUST.ordinal());
                break;
            }
            case SEPTEMBER: {
                System.out.println("neParne");
                System.out.println("Ordinal : " + Parne_ne_parne.SEPTEMBER.ordinal());
                break;
            }
        }
    }
}

//    Season season = Season.SPRING;
//        System.out.println(season.getSeasons());
//
//      Days days = Days.TWENTY_EIGHT;
//        System.out.println(days.getDay());
//    }
//}

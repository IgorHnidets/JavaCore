package com.Classwork.Classwork_11April;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String color = askUser();
        checkTrafficSignal(color);

    }
    public static String askUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Traffic light signal");
        return scanner.next();
    }
    public static void checkTrafficSignal(String light) {
        TrafficSignal signal = TrafficSignal.valueOf(light.toUpperCase());
        switch (signal) {
            case GREEN: {
                System.out.println("You can go!");
                System.out.println("Ordinal : " + TrafficSignal.GREEN.ordinal());
                break;
            }
            case YELLOW: {
                System.out.println("Be ready");
                System.out.println("Ordinal: " + TrafficSignal.YELLOW.ordinal());
                break;
            }
            case RED: {
                System.out.println("Stop");
                System.out.println("Ordinal: " + TrafficSignal.RED.ordinal());
                break;
            }
        }
    }

}
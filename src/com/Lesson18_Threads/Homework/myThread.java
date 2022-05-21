package com.Lesson18_Threads.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class myThread extends Thread{

    private int f1 =1;
    private  int f2 = 1;
    private  int f3;
    public int arraylenght;

    public myThread(){

    }


    @Override
    public void run(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arraylenght : ");
        arraylenght = scanner.nextInt();


        System.out.print(f1+" "+f2+" ");
        for (int i = 3; i <=arraylenght; i++) {
            f3 = f1 + f2;
            System.out.print(f3 +" ");
            f1 = f2;
            f2 = f3;


            try {
                sleep(1000);
            } catch (InterruptedException e ){
                e.printStackTrace();
            }
        }
    }
}

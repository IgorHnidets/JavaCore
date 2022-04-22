package com.Lesson6_interface.Task1;

public class Main {

    public static void main(String[] args) {
        Zarplata zarplata1 = new Employee_hour(50,10);
        zarplata1.employee_hour();

        Zarplata zarplata2 = new Employee_mounth(10000,16);
        zarplata2.employee_mounth();
    }
}
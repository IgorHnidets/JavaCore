package com.Lesson15_Inner_classes.Classwork;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

        employeeArrayList.add(new Employee("Mike",3000));
        employeeArrayList.add(new Employee("Joe",3100));
        employeeArrayList.add(new Employee("Mike1",3300));
        employeeArrayList.add(new Employee("Joe1",3150));
        employeeArrayList.add(new Employee("Mike2",3090));

        Collections.sort(employeeArrayList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.salary<o2.salary) {
                    return 1;
                };
                return -1;
            }
        });
        System.out.println("Name\nSalary");
        System.out.println("--------------");
        for (Employee Employee : employeeArrayList) {
            System.out.println(Employee.name + " + " +  Employee.salary);
        }
    }
}

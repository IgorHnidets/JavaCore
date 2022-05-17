package com.Lesson17_IO.Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Methods implements MethodsVoid {

    public Methods(){
    }

    Emloyee[] emloyees = { new Emloyee("Mark",300,1000),
            new Emloyee("Sasha", 299,1010),
            new Emloyee("Igor",201,1050)};

//    Emloyee object = new Emloyee("Mark",300,1000);
//    Emloyee object1 = new Emloyee("Sasha", 299,1010);
//    Emloyee object2 = new Emloyee("Igor",201,1050);


    String filename = "file.ser";

    @Override
    public void serealize(){
        try {
//            save object in file
            FileOutputStream file = new FileOutputStream("Employee.bin");
            ObjectOutputStream out = new ObjectOutputStream(file);
//          For Array
            out.writeInt(emloyees.length);

            for (Emloyee emloyee:emloyees){
                out.writeObject(emloyee);
            }
            out.close();


//            method for serelialization of object
//            out.writeObject(emloyees);
//            out.close();
//            file.close();
//            System.out.println("Object has been sereliazed");

//            System.out.println("Name = " + object.getName());
//            System.out.println("Id = " + object.getId());
//            System.out.println("Salary " + object.getSalary());
        }

        catch (IOException ex) {
            System.out.println("IOExp is caught1");
        }
    }

//    Emloyee object0 = null;

    @Override
    public void deserealize(){try {
//            reading from a file
        FileInputStream fileInput = new FileInputStream("Employee.bin");
        ObjectInputStream in = new ObjectInputStream(fileInput);
//      For Array
        int employeeCount = in.readInt();
        Emloyee[] emloyee = new Emloyee[employeeCount];

        for (int i = 0; i < employeeCount; i++){
           emloyee[i] = (Emloyee) in.readObject();
        }

        System.out.println(Arrays.toString(emloyee));

//            method for deserializ
//        emloyees1 = (Emloyee) in.readObject();
//        in.close();
//        fileInput.close();
//        System.out.println("Object has been deserealized");
//
//        System.out.println("Name = " + object0.getName());
//        System.out.println("Id = " + object0.getId());
//        System.out.println("Salary " + object0.getSalary());
    }
    catch (IOException ex){
        System.out.println("IOExp is caught");
    }
    catch (ClassNotFoundException ex){
        System.out.println("ClassNotFound is caught");
    }
    }

    }


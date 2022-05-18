package com.Lesson17_IO.Homework;

import com.Lesson17_IO.Classwork.Demo;

import java.io.*;

public class Methods implements MethodsVoid {

    public Methods(){
    }

    Emloyee object = new Emloyee("Mark",300,1000);
    String filename = "file.ser";

    @Override
    public void serealize(){
        try {
//            save object in file
            FileOutputStream file = new FileOutputStream("E://Output.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
//            method for serelialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been sereliazed");
        }

        catch (IOException ex) {
            System.out.println("IOExp is caught1");
        }
    }
    Emloyee object1 = null;
    @Override
    public void deserealize(){try {
//            reading from a file
        FileInputStream fileInput = new FileInputStream("E://Input.txt");
        ObjectInputStream in = new ObjectInputStream(fileInput);

//            method for deserializ
        object1 = (Emloyee) in.readObject();
        in.close();
        fileInput.close();
        System.out.println("Object has been deserealized.txt");

        System.out.println("Name = " + object1.getName());
        System.out.println("Id = " + object1.getId());
        System.out.println("Salary " + object1.getSalary());
    }
    catch (IOException ex){
        System.out.println("IOExp is caught");
    }
    catch (ClassNotFoundException ex){
        System.out.println("ClassNotFound is caught");
    }
    }

    }


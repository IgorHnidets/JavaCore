package com.Lesson17_IO.Classwork;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Demo object = new Demo(1,"iotest");
        String filename = "file.ser";
//      Serealization
        try {
//            save object in file
            FileOutputStream file = new FileOutputStream("E://Output.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
//            method for serelialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been sereliazed.txt");
        }

        catch (IOException ex){
            System.out.println("IOExp is caught");
        }
        Demo object1 = null;

//        Deserialization
        try {
//            reading from a file
            FileInputStream fileInput = new FileInputStream("E://Input.txt");
            ObjectInputStream in = new ObjectInputStream(fileInput);

//            method for deserializ
            object1 = (Demo) in.readObject();
            in.close();
            fileInput.close();
            System.out.println("Object has been deserealized.txt");

            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        catch (IOException ex){
            System.out.println("IOExp is caught");
        }
        catch (ClassNotFoundException ex){
            System.out.println("ClassNotFound is caught");
        }
    }

}

package com.Lesson17_IO.Classwork;

import java.io.Serializable;

public class Demo implements Serializable {

    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }
}

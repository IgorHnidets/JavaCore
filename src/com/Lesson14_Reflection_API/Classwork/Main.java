package com.Lesson14_Reflection_API.Classwork;

import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException,InstantiationException,NoSuchMethodException, InvocationException, InvocationTargetException {
//Class<Device> deviceClass =(Class<Device>) Class.forName("com.Lesson14_Reflection_API.Classwork.Device");
//              Class.getClass
        Device device = new Device();
        Class<Device> deviceClass = (Class<Device>) device.getClass();
//        .clas
//        Class<Device> deviceClass = (Class<Device>)
//        Class<Device> deviceClass = Device.class;

        System.out.println(Arrays.toString(deviceClass.getInterfaces()));
        System.out.println(deviceClass.getSuperclass());

        System.out.println(Arrays.toString(deviceClass.getFields()));

        System.out.println(Arrays.toString(deviceClass.getDeclaredFields()));

        System.out.println(Arrays.toString(deviceClass.getMethods()));
        System.out.println(Arrays.toString(deviceClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(deviceClass.getConstructors()));

        Device device1 = deviceClass.newInstance();
        device.setName("IPhone");
        device.setCount(50);
        device.setId(123456);
        device.setPrice(1000);
        System.out.println(device1);
        System.out.println(device1.getTotalPrice());

//        Constructor<Device> constructor = deviceClass5.getConstructor(new Class[]{String.class});
//        Constructor constructor1 = deviceClass5.getConstructors()[3];
//        Device device2 = (Device) constructor1.newInstance("TV",120,150,10);
//        System.out.println(device2);
//
//        Method methodGetTotalPrice = deviceClass.getDeclaredMethod("getTotalPrice",null);
//        System.out.println(methodGetTotalPrice.invoke(device1,null));



    }
}

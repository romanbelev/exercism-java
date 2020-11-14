package com.company;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Random;

public class Array {
    int[] array;

    public Array() {
        array = new int[10];
        initRandom(10);
    }

    public Array(int size) {
        array = new int[size];
        initRandom(size);
    }

    public void initRandom(int size) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void sort(Comparator comparator) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - 1; ++j) {
                if (comparator.compare(array[j], array[j + 1]) == 1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // use link for creating
    public <T> void sortSecond(Class<T> myClass) throws Exception {
        // CustomComp comp = null;
        // T myCustomComparator = comparator;
        // myCustomComparator.print();
        // T customComparator = cls.newInstance();
        // customComparator.print();
        // T myCustomComparator = cls.getDeclaredConstructor().newInstance();

        // Class myCustomClass = Class.forName(CustomComp.class.getName());
        // comp = (CustomComp)myCustomClass.getConstructor().newInstance();
        // comp.print();

        Class<?> myCustomClass = Class.forName(myClass.getName());
        // System.out.println(myClass.getDeclaredConstructor().newInstance());
        // System.out.println(myCustomClass);


        // T mycls = myClass.getDeclaredConstructor().newInstance();

        // T myclass = (T)myCustomClass.getConstructor().newInstance();
        // myclass.print();
        // System.out.println(myclass);

        // Method m = myCustomClass.getMethod("print");

        Method m = myCustomClass.getMethod("print");
        m.invoke(myClass.getDeclaredConstructor().newInstance());

        /*
        Method[] methods = myCustomClass.getDeclaredMethods();
        for (Method method : methods) {
            method.invoke(myClass.getDeclaredConstructor().newInstance());
        }
        */




        // T comp = (T)myCustomClass.getConstructor().newInstance();
        // comp.print();

        // T myClass = cls.getConstructor().newInstance();
        // System.out.println(myClass);

    }

    @Override
    public String toString() {
        String stringArray = "";

        for (int value: array) {
            stringArray += " " + String.valueOf(value);
        }

        return stringArray;
    }
}

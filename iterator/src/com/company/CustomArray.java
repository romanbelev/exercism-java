package com.company;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class CustomArray<T> {

    // private T[] value = (T[])new Object[16];

    private T[] value;
    private int pointer = 0;
    private int size;
    private Class<T>className;

    CustomArray(Class<T> className, int size) {
        this.className = className;
        this.size = size;

        final T[] a = (T[]) Array.newInstance(className, size);
        this.value = a;
    }

    public void add(T value) {
        this.value[pointer] = value;
        pointer++;
    }

    public CustomIterator iterator() {
        return new CustomIterator<T>(value, className, size, pointer);
    }

    public void print() {
        System.out.println(value[0]);
        System.out.println(value[1]);

    }
}

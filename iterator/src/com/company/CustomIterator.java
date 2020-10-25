package com.company;

import java.lang.reflect.Array;

public class CustomIterator<T> implements CustomIteratorInterface<T> {
    T[] value;
    Class<T> className;
    int size;
    int capacity;
    int pointer = 0;

    CustomIterator(T[] value, Class<T> className, int size, int capacity) {
        // final T[] a = (T[]) Array.newInstance(className, size);
        // this.value = a;
        this.value = value;

        this.className = className;
        this.size = size;
        this.capacity = capacity;
    }

    public T next() {
        T item = value[pointer];
        pointer++;

        return item;
    }

    public boolean hasNext() {
        return pointer < capacity;
    }
}

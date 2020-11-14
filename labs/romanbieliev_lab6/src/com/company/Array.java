package com.company;

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

    @Override
    public String toString() {
        String stringArray = "";

        for (int value: array) {
            stringArray += " " + String.valueOf(value);
        }

        return stringArray;
    }
}

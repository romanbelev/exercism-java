package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    Array arrayOne = new Array();
        Array arrayTwo = new Array();
        Array arrayThree = new Array();


        System.out.println("Array increasing: ");
        System.out.printf("Generate: %s\n", arrayTwo.toString());

        arrayOne.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer valueOne, Integer valueTwo) {
                if (valueOne > valueTwo) {
                    return 1;
                } else if (valueOne < valueTwo) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.printf("After sort: %s\n\n", arrayOne.toString());

        System.out.println("Array decreasing: ");
        System.out.printf("Generate: %s\n", arrayTwo.toString());

        arrayTwo.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer valueOne, Integer valueTwo) {
                if (valueOne < valueTwo) {
                    return 1;
                } else if (valueOne > valueTwo) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.printf("After sort: %s\n\n", arrayTwo.toString());

        System.out.println("Array increasing with last digit comparation: ");
        System.out.printf("Generate: %s\n", arrayThree.toString());

        arrayThree.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer valueOne, Integer valueTwo) {
                int lastDigitNumberOne = Math.abs(valueOne % 10);
                int lastDigitNumberTwo = Math.abs(valueTwo % 10);

                if (lastDigitNumberOne > lastDigitNumberTwo) {
                    return 1;
                } else if (lastDigitNumberOne < lastDigitNumberTwo) {
                    return -1;
                } else {
                    if (valueOne > valueTwo) {
                        return 1;
                    } else if (valueOne < valueTwo) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        System.out.printf("After sort: %s\n", arrayThree.toString());

    }
}


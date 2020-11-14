package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	    Array ar = new Array();

	    /*
        ar.sort(new Comparator<Integer>() {
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
        System.out.println(ar.toString());
	    */

        /*
        ar.sort(new Comparator<Integer>() {
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
        System.out.println(ar.toString());
        */

        /*
        ar.sort(new Comparator<Integer>() {
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
        System.out.println(ar.toString());
        */


        try {
            // CustomComp cp = new CustomComp();
            // ar.<CustomComp>sortThird(cp::print);
            ar.<CustomComp>sortSecond(CustomComp.class);
        } catch (Exception ex) {

        }

    }
}


class IncreasingComparator implements Comparator<Integer> {
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
}

class DecreasingComparator implements Comparator<Integer> {
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
}

class CustomComp {
    public void print() {
        System.out.println("This is method from custom comparator");
    }
}

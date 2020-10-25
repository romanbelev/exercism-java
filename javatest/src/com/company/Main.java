package com.company;

public class Main {

    public static void main(String[] args) {
        int s[] = {20, 10};
        String ss[] = {"20", "10"};

        Ar a = new Ar();
        a.printArray(s);
    }
}


class Ar {
    public void printArray( Object x ){
        if( x instanceof int[] ){
            System.out.println("Array of Int");
            int[] n = (int[]) x ;
            for( int i = 0 ; i < n.length ; i++ ) {
                System.out.println("integers = " + n[i]);
            }
        }

        if( x instanceof String[] ){
            System.out.println("Array of Strings");
        }
    }
}
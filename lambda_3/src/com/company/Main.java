package com.company;

public class Main {

    public static void main(String[] args) {
        Operation op = action(1);
        System.out.println(op.execute(1, 2));
    }

    public static Operation action(int number) {
        switch(number) {
            case 1:
                return (f, s) -> f + s;
            case 2:
                return (f, s) -> f * s;
            case 3:
                return (f, s) -> f / s;
            default:
                return (f, s) -> 0;
        }
    }
}


interface Operation {
    public int execute(int first, int second);
}
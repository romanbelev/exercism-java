package com.company;

public class Main {

    public static void main(String[] args) {

        Vector3d vectorOne = new Vector3d(1, 2, 3);
        Vector3d vectorTwo = new Vector3d(2, 1, -2);

        // System.out.println(vectorOne.scalarMultiply(vectorTwo));
        Vector3d newVector = vectorOne.vectorMultiply(vectorTwo);
        System.out.println(newVector.toString());
    }
}

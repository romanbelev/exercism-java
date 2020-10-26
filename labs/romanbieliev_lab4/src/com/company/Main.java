package com.company;

public class Main {

    public static void main(String[] args) {

        Vector3d vectorOne = new Vector3d(3, 6, 3);
        Vector3d vectorTwo = new Vector3d(1, 3, -2);
        Vector3d vectorThree = new Vector3d(2, 2, 2);

        // System.out.println(vectorOne.scalarMultiply(vectorTwo));
        // Vector3d newVector = vectorOne.vectorMultiply(vectorTwo);
        // System.out.println(newVector.toString());

        // System.out.println(Vector3d.staticScalarMultiply(vectorOne,vectorTwo));

        Tetrahedron tetrahedron = new Tetrahedron(vectorOne, vectorTwo, vectorThree);
        System.out.println(tetrahedron.calculateVolume());


    }
}

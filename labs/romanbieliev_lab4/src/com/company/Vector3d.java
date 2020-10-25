package com.company;

public class Vector3d {

    private double coordX;
    private double coordY;
    private double coordZ;

    // private final int COORD_COUNT = 3;

    public Vector3d(double coordX, double coordY, double coordZ) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.coordZ = coordZ;
    }

    public double getCoordX() {
        return coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public double getCoordZ() {
        return coordZ;
    }

    public static double staticScalarMultiply(Vector3d vectorOne, Vector3d vectorTwo) {
        double res = 0;

        res += Math.abs(vectorOne.getCoordX() * vectorTwo.getCoordX());
        res += Math.abs(vectorOne.getCoordY() * vectorTwo.getCoordY());
        res += Math.abs(vectorOne.getCoordZ() * vectorTwo.getCoordZ());

        return res;
    }

    public double scalarMultiply(Vector3d vectorTwo) {
        double res = 0;

        res += Math.abs(coordX * vectorTwo.getCoordX());
        res += Math.abs(coordY * vectorTwo.getCoordY());
        res += Math.abs(coordZ * vectorTwo.getCoordZ());

        return res;
    }

    public static Vector3d staticVectorMultiply(Vector3d vectorOne, Vector3d vectorTwo) {
        double vectorOneCoordX = vectorOne.getCoordX();
        double vectorOneCoordY = vectorOne.getCoordY();
        double vectorOneCoordZ = vectorOne.getCoordZ();

        double vectorTwoCoordX = vectorTwo.getCoordX();
        double vectorTwoCoordY = vectorTwo.getCoordY();
        double vectorTwoCoordZ = vectorTwo.getCoordZ();

        double newVectorCoordX = vectorOneCoordY * vectorTwoCoordZ - vectorOneCoordZ * vectorTwoCoordY;
        double newVectorCoordY = - (vectorOneCoordX * vectorTwoCoordZ - vectorOneCoordZ * vectorTwoCoordX);
        double newVectorCoordZ = vectorOneCoordX * vectorTwoCoordY - vectorOneCoordY * vectorTwoCoordX;

        return new Vector3d(newVectorCoordX, newVectorCoordY, newVectorCoordZ);
    }

    public Vector3d vectorMultiply(Vector3d vectorTwo) {
        double vectorTwoCoordX = vectorTwo.getCoordX();
        double vectorTwoCoordY = vectorTwo.getCoordY();
        double vectorTwoCoordZ = vectorTwo.getCoordZ();

        double newVectorCoordX = coordY * vectorTwoCoordZ - coordZ * vectorTwoCoordY;
        double newVectorCoordY = - (coordX * vectorTwoCoordZ - coordZ * vectorTwoCoordX);
        double newVectorCoordZ = coordX * vectorTwoCoordY - coordY * vectorTwoCoordX;

        return new Vector3d(newVectorCoordX, newVectorCoordY, newVectorCoordZ);
    }

    @Override
    public String toString() {
        return "Vector3d: " + coordX + ", " + coordY + ", " + coordZ;
    }

}

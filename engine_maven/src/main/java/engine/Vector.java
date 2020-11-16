package engine;

public class Vector {

    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;

    public Vector(int coordinateX, int coordinateY, int coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public Vector addVectorToVector(Vector vector) {
        int newCoordinateX = coordinateX + vector.getCoordinateX();
        int newCoordinateY = coordinateY + vector.getCoordinateY();
        int newCoordinateZ = coordinateZ + vector.getCoordinateZ();

        return new Vector(newCoordinateX, newCoordinateY, newCoordinateZ);
    }

    public Vector subtractVectorFromVector(Vector vector) {
        int newCoordinateX = coordinateX - vector.getCoordinateX();
        int newCoordinateY = coordinateY - vector.getCoordinateY();
        int newCoordinateZ = coordinateZ - vector.getCoordinateZ();

        return new Vector(newCoordinateX, newCoordinateY, newCoordinateZ);
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int getCoordinateZ() {
        return coordinateZ;
    }

    @Override
    public String toString() {
        return "Vector: (" + coordinateX + ", " + coordinateY + ", " + coordinateZ + ")";
    }
}

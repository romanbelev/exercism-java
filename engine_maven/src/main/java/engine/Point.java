package engine;

public class Point {
    private int coordinateX;
    private int coordinateY;
    private int coordinateZ;

    public Point(int coordinateX, int coordinateY, int coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    /*
    public Point addVectorToPoint(Vector vector) {

    }

    public Point substractVectorFromPoint(Vector vector) {

    }

    public Vector substractPointFromPoint(Point point) {

    }
    */

    public String draw() {
        return String.valueOf(coordinateX) + ", " + String.valueOf(coordinateY) + ", " + String.valueOf(coordinateZ);
    }

    @Override
    public String toString() {
        return "Point: (" + coordinateX + ", " + coordinateY + ", " + coordinateZ + ")";
    }
}

package engine;

import javafx.scene.canvas.GraphicsContext;

public abstract class Figure {
    GraphicsContext gc;

    public Figure(GraphicsContext gc) {
        this.gc = gc;
    }

    public abstract String getName();
    public abstract void draw(Point[] points);
}

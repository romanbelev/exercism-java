package engine;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Controller {
    @FXML
    public Canvas canvas;

    public void draw() {
        GraphicsContext graphicsContext2D = canvas.getGraphicsContext2D();

        graphicsContext2D.beginPath();
        graphicsContext2D.moveTo(30.5, 30.5);
        graphicsContext2D.lineTo(150.5, 30.5);
        graphicsContext2D.stroke();
    }




}

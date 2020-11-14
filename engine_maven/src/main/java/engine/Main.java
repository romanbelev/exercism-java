package engine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Parent mainRoot = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        // Scene scene = new Scene(mainRoot);
        // primaryStage.setScene(scene);
        // primaryStage.setTitle("First Application");
        // primaryStage.show();

        Pane pane = new Pane();
        Canvas canvas = new Canvas(700, 700);
        pane.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Point[] rectanglePoints = new Point[] {
                new Point(420, 200),
                new Point(620, 200),
                new Point(620, 400),
                new Point(420, 400)
        };

        Point[] trianglePoints = new Point[] {
                new Point(100, 500),
                new Point(200, 500),
                new Point(150, 600)
        };

        Point[] polygonPoints = new Point[] {
                new Point(250, 40),
                new Point(320, 65),
                new Point(380, 140),
                new Point(405, 180),
                new Point(390, 280),
                new Point(320, 350),
                new Point(220, 370),
                new Point(130, 320),
                new Point(80, 230),
                new Point(100, 130),
                new Point(170, 60),
        };

        Rectangle rectangle = new Rectangle(gc);
        rectangle.draw(rectanglePoints);

        Triangle triangle = new Triangle(gc);
        triangle.draw(trianglePoints);

        Polygon polygon = new Polygon(gc);
        polygon.draw(polygonPoints);







        Scene scene = new Scene(pane, 700, 700);
        primaryStage.setTitle("Engine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

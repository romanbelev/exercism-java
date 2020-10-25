package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import java.util.Date;

public final class Simulation {

    private static Simulation instance;
    private final int FRAME_RATE = 3;

    private Timeline timeline;
    private Pane pane;
    private Field field;
    private Label fieldGeneration;
    private int frameCounter;

    public Simulation(Pane pane, Label fieldGeneration) {
        this.pane = pane;
        this.fieldGeneration = fieldGeneration;
        this.timeline = new Timeline(new KeyFrame(Duration.millis(1000 / FRAME_RATE), this::drowFrame));
        this.timeline.setCycleCount(Animation.INDEFINITE);
    }

    public static Simulation getInstance(Field field, Pane pane, Label fieldGeneration) {
        if (instance == null) {
            instance = new Simulation(pane, fieldGeneration);
        }
        return instance;
    }

    public void startSimulation() {
        this.timeline.play();
    }

    public void stopSimulation() {
        this.timeline.stop();
    }

    private void drowFrame(ActionEvent event) {
        System.out.println("Task repeated: " + new Date());

        pane.getChildren().clear();
        pane.getChildren().add(field);
        fieldGeneration.setText(String.valueOf(frameCounter));

        field = field.analyzeField();

        frameCounter++;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setFrameCounter(int frameCounter) {
        this.frameCounter = frameCounter;
    }
}

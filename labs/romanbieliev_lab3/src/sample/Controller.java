package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Pane anchorContent;

    @FXML
    private Label fieldGeneration;

    private Simulation simulation;

    private static final int FIELD_SIZE_X = 40;
    private static final int FIELD_SIZE_Y = 30;

    public Controller() {

    }

    @FXML
    public void actionBtnRandom(ActionEvent event) {
        Field field = new Field(FIELD_SIZE_X, FIELD_SIZE_Y);
        field.generateLifeRandom();

        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(field);

        simulation = Simulation.getInstance(field, anchorContent, fieldGeneration);
        simulation.setField(field);
        simulation.setFrameCounter(0);
    }

    @FXML
    public void actionBtnGlider(ActionEvent event) {
        Field field = new Field(FIELD_SIZE_X, FIELD_SIZE_Y);
        field.generateLifeGlider();

        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(field);

        simulation = Simulation.getInstance(field, anchorContent, fieldGeneration);
        simulation.setField(field);
        simulation.setFrameCounter(0);
    }


    @FXML
    public void actionBtnCross(ActionEvent event) {
        Field field = new Field(FIELD_SIZE_X, FIELD_SIZE_Y);
        field.createFieldCross();

        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(field);

        simulation = Simulation.getInstance(field, anchorContent, fieldGeneration);
        simulation.setField(field);
        simulation.setFrameCounter(0);

    }

    @FXML
    public void actionBtnBorder(ActionEvent event) {
        Field field = new Field(FIELD_SIZE_X, FIELD_SIZE_Y);
        field.createFieldBorder();

        anchorContent.getChildren().clear();
        anchorContent.getChildren().add(field);

        simulation = Simulation.getInstance(field, anchorContent, fieldGeneration);
        simulation.setField(field);
        simulation.setFrameCounter(0);

    }

    @FXML
    public void actionBtnStart(ActionEvent event) {
        try {
            simulation.startSimulation();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    @FXML
    public void actionBtnStop(ActionEvent event) {
        try {
            simulation.stopSimulation();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

}

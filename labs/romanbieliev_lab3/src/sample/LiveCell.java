package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class LiveCell extends Rectangle {

    private boolean liveStatus = true;

    public LiveCell() {
    }

    public boolean getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(boolean liveStatus) {
        this.liveStatus = liveStatus;
    }

    public void init() {

        Color color = liveStatus ? Color.GREEN : Color.GREY;

        this.setFill(color);
        this.setWidth(20);
        this.setHeight(20);
        this.setArcHeight(5);
        this.setArcWidth(5);
    }
}

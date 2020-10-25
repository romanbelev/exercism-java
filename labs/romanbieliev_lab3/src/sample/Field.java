package sample;

import javafx.scene.layout.GridPane;

import java.util.Random;

public class Field extends GridPane {

    private final int fieldSizeX;
    private final int fieldSizeY;
    private LiveCell[][] fieldArray;
    private LiveCell[][] nextFieldArray;

    public Field(int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        fieldArray = new LiveCell[fieldSizeY][fieldSizeX];
        nextFieldArray = new LiveCell[fieldSizeY][fieldSizeX];
    }

    public void createField() {
    }

    public void generateLifeRandom() {

        Random random = new Random();
        boolean randomLiveStatus;

        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                randomLiveStatus = random.nextBoolean();
                LiveCell liveCell = new LiveCell();
                liveCell.setLiveStatus(randomLiveStatus);
                liveCell.init();

                fieldArray[y][x] = liveCell;
                this.add(liveCell, x, y);
            }
        }

    }

    public void createFieldCross() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {

                LiveCell liveCell = new LiveCell();

                if (y == (fieldSizeY / 2) || x == fieldSizeX / 2) {
                    liveCell.setLiveStatus(true);
                } else {
                    liveCell.setLiveStatus(false);
                }

                liveCell.init();
                fieldArray[y][x] = liveCell;
                this.add(liveCell, x, y);
            }
        }
    }

    public void createFieldBorder() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                LiveCell liveCell = new LiveCell();

                if (x == 0 || x == (fieldSizeX - 1)) {
                    liveCell.setLiveStatus(true);
                } else if (y == 0 || y == fieldSizeY - 1) {
                    liveCell.setLiveStatus(true);
                } else {
                    liveCell.setLiveStatus(false);
                }

                liveCell.init();
                fieldArray[y][x] = liveCell;
                this.add(liveCell, x, y);
            }
        }
    }

    public void generateLifeGlider() {

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                LiveCell liveCell = new LiveCell();

                if ((y == 27 && x == 37) || (y == 28 && x == 37) || (y == 29 && x == 37)
                        || (y == 27 && x == 38) || (y == 28 && x == 39))  {
                    liveCell.setLiveStatus(true);
                } else {
                    liveCell.setLiveStatus(false);
                }

                liveCell.init();
                fieldArray[y][x] = liveCell;
                this.add(liveCell, x, y);
            }
        }
    }

    public Field createFieldByMatrix(LiveCell[][] matrix) {
        Field nextField = new Field(fieldSizeX, fieldSizeY);

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                LiveCell liveCell = matrix[y][x];
                nextField.setFieldItem(liveCell, y, x);
                nextField.add(liveCell, x, y);
            }
        }

        return nextField;
    }

    public void setFieldItem(LiveCell liveCell, int y, int x) {
        fieldArray[y][x] = liveCell;
    }

    public Field analyzeField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                int neighbourLiveStatusSum = 0;

                // Sum top and down neighbour cell
                for (int i = x - 1; i < x + 2; i++) {
                    if (! isOutOfBounds(y - 1, i)) {
                        neighbourLiveStatusSum += fieldArray[y - 1][i].getLiveStatus() ? 1 : 0;
                    }
                    if (! isOutOfBounds( y + 1, i)) {
                        neighbourLiveStatusSum += fieldArray[y + 1][i].getLiveStatus() ? 1 : 0;
                    }
                }

                // Sum lef and right neighbour cell
                if (! isOutOfBounds(y, x - 1)) {
                    neighbourLiveStatusSum += fieldArray[y][x - 1].getLiveStatus() ? 1 : 0;
                }
                if (! isOutOfBounds(y, x + 1)) {
                    neighbourLiveStatusSum += fieldArray[y][x + 1].getLiveStatus() ? 1 : 0;
                }

                System.out.println(neighbourLiveStatusSum);

                boolean nextLiveStatus = cellNextGenerationLiveStatus(fieldArray[y][x], neighbourLiveStatusSum);

                LiveCell nextLiveCell = new LiveCell();
                nextLiveCell.setLiveStatus(nextLiveStatus);
                nextLiveCell.init();

                nextFieldArray[y][x] = nextLiveCell;
            }
        }

        return createFieldByMatrix(nextFieldArray);
    }

    public boolean cellNextGenerationLiveStatus(LiveCell cell, int neighbourLiveStatusSum) {
        boolean currentLiveStatus = cell.getLiveStatus();
        if (currentLiveStatus) {
            if (neighbourLiveStatusSum == 2 || neighbourLiveStatusSum == 3) {
                return true;
            }
            return false;
        } else {
            if (neighbourLiveStatusSum == 3) {
                return true;
            }
            return false;
        }
    }

    public boolean isOutOfBounds(int y, int x) {
        if (x < 0 || x >= fieldSizeX ) {
            return true;
        }
        if (y < 0 || y >= fieldSizeY) {
            return true;
        }

        return false;
    }
}

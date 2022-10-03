package org.example;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Kvet extends Rastlina{
    public Kvet(Pane root, int x,int y){

        super(root,x,y);
    }

    @Override
    public void nextStage() {
        stage++;

        if(stage > 5){
            stage = 1;
        }

        gc.setFill(Color.WHITE);
        gc.clearRect(0,0,500,500);

        if(stage == 1) {

            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(2,22,48,9);
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(22,2,9,48);
            gc.setFill(Color.ORANGE);
            gc.fillOval(21,21,11,11);


        }
        else if(stage == 2) {
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(2,22,50,10);
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(22,2,10,50);

            gc.setFill(Color.ORANGE);
            gc.fillOval(21,21,13,13);
        }
        else if(stage == 3) {
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(2,22,53,12);
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(22,2,12,53);

            gc.setFill(Color.ORANGE);
            gc.fillOval(21,21,15,15);

        }
        else if(stage == 4) {
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(2,22,55,14);
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(22,2,14,55);

            gc.setFill(Color.ORANGE);
            gc.fillOval(21,21,16,16);

        }
        else if(stage == 5) {
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(2,22,57,16);
            gc.setFill(Color.DARKMAGENTA);
            gc.fillOval(22,2,16,57);

            gc.setFill(Color.ORANGE);
            gc.fillOval(21,21,18,18);


        }

    }
}

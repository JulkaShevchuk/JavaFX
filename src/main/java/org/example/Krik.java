package org.example;

import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Krik extends Rastlina {

    public Krik(Pane root, int x, int y){
        super (root,x,y);

    }

    @Override
    public void nextStage() {
        stage++;

        if(stage > 5){
            stage = 1;
        }

        gc.setFill(Color.WHITE);
        gc.clearRect(0,0,130,130);

        if(stage == 1) {

            gc.setFill(Color.DARKGREEN);
            gc.fillOval(35,15,30,30);
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(35,25,30,30);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(50,25,30,30);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(20,25,30,30);
        }
        else if(stage == 2) {
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(35,15,35,36);
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(35,25,35,35);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(50,25,35,36);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(20,25,35,36);

        }
        else if(stage == 3) {
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(35,15,40,36);
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(35,25,37,37);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(50,25,40,36);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(20,25,40,36);

        }
        else if(stage == 4) {
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(35,15,40,38);
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(35,25,41,41);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(50,25,42,38);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(20,25,42,38);

        }
        else if(stage == 5) {
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(35,15,44,38);
            gc.setFill(Color.DARKGREEN);
            gc.fillRect(35,25,41,41);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(50,25,44,40);
            gc.setFill(Color.DARKGREEN);
            gc.fillOval(20,25,44,40);


        }


    }
}

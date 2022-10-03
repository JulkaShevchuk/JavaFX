package org.example;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Strom extends Rastlina{
    public Strom(Pane root, int x,int y ) {

        super(root,x,y);
    }

    @Override
    public void nextStage(){
        stage++;

        if(stage > 5){
            stage = 1;
        }

        gc.setFill(Color.WHITE);
        gc.clearRect(0,0,130,130);

        if(stage == 1) {
            gc.setFill(Color.GREEN);
            gc.fillOval(50,0,35,50);
            gc.setFill(Color.BROWN);
            gc.fillRect(60,50,15,55);
        }
        else if(stage == 2) {
            gc.setFill(Color.BROWN);
            gc.fillRect(60,50,16,58);
            gc.setFill(Color.GREEN);
            gc.fillOval(48,0,42,58);


        }
        else if(stage == 3) {
            gc.setFill(Color.BROWN);
            gc.fillRect(60,50,18,58);
            gc.setFill(Color.GREEN);
            gc.fillOval(45,0,48,61);

        }
        else if(stage == 4) {
            gc.setFill(Color.BROWN);
            gc.fillRect(60,50,20,60);
            gc.setFill(Color.GREEN);
            gc.fillOval(42,0,53,64);

        }
        else if(stage == 5) {
            gc.setFill(Color.BROWN);
            gc.fillRect(60,50,23,66);
            gc.setFill(Color.GREEN);
            gc.fillOval(41,0,58,70);

        }


    }
}

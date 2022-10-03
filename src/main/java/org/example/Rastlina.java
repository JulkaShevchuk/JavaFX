package org.example;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public abstract class Rastlina extends Canvas {
    protected GraphicsContext gc;
    protected Pane root;

    protected Timeline timeline;
    protected int stage;

    public Rastlina(Pane root, int x,int y){
        super (130,130);
        setLayoutX(x);
        setLayoutY(y);

        gc = getGraphicsContext2D();
        this.root = root;

        stage = 0;

        KeyFrame keyframe = new KeyFrame(Duration.seconds(1), (ev)->nextStage());
        timeline = new Timeline(keyframe);
        timeline.setCycleCount(Animation.INDEFINITE);

        timeline.play();
    }

    public abstract void nextStage();



}

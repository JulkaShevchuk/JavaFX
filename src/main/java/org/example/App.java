package org.example;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();

        Button btn1= new Button("Tree");
        btn1.setOnMouseClicked((event)->{
            Strom strom = new Strom(pane,(int)(Math.random()*600),(int)(Math.random()*600));
            pane.getChildren().add(strom);
        });

        Button btn2= new Button("Flower");
        btn2.setLayoutY(25);
        btn2.setOnMouseClicked((event)->{
            Kvet kvet = new Kvet(pane,(int)(Math.random()*600),(int)(Math.random()*600));
            pane.getChildren().add(kvet);
        });


        Button btn3= new Button("Bush");
        btn3.setLayoutY(50);
        btn3.setOnMouseClicked((event)->{
            Krik krik = new Krik(pane,(int)(Math.random()*600),(int)(Math.random()*600));
            pane.getChildren().add(krik);
        });

        pane.getChildren().addAll(btn1,btn2,btn3);

        var scene = new Scene(pane, 700, 700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
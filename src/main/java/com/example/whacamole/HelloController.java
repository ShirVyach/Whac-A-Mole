package com.example.whacamole;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private Label Count;

    @FXML
    private Label Count1;

    @FXML
    private AnchorPane Hello;

    @FXML
    private Button Menu;

    @FXML
    private Button Play;

    @FXML
    private Button PlayAgain;
    @FXML
    private Label Record;

    @FXML
    private Label Record1;

    @FXML
    private AnchorPane Result;

    @FXML
    private Label Time;

    @FXML
    private AnchorPane game;

    @FXML
    private ImageView hole1;

    @FXML
    private ImageView hole2;

    @FXML
    private ImageView hole3;

    @FXML
    private ImageView hole4;

    @FXML
    private ImageView hole5;

    @FXML
    private ImageView hole6;

    @FXML
    private ImageView hole7;

    @FXML
    private ImageView hole8;

    @FXML
    void initialize() {

        Play.setOnAction(event -> {
            session();
        });
        PlayAgain.setOnAction(event -> {
            Result.setVisible(false);
            game.setVisible(false);
            session();
        });
        Menu.setOnAction(event -> {
            Result.setVisible(false);
            game.setVisible(false);
        });
    }
    Image fhole = new Image("file:/C:/Users/ShirVyach/Desktop/Whac-A-Mole/src/main/resources/images/fhole.png");
    Image thole = new Image("file:/C:/Users/ShirVyach/Desktop/Whac-A-Mole/src/main/resources/images/thole.png");
    @FXML
    void krtek(ImageView hole){
        Timeline timeline = new Timeline (
                new KeyFrame (
                        Duration.millis(500),
                        aue -> {hole.setImage(fhole);}));
        timeline.setCycleCount(1);
        timeline.play();
        hole.setImage(thole);
    }
    @FXML
    void kill(ImageView hole){
        if(hole.getImage()==thole){
            Count.setText("" + acc);
            acc++;
        }
    }
    Integer TimeOut = 30;
    Integer acc = 0;
    @FXML
    void session() {
        TimeOut = 30;
        acc = 0;
        game.setVisible(true);
        Timeline TimeSession = new Timeline (
                new KeyFrame (
                        Duration.millis(1000),
                        ae -> {
                            TimeOut--;
                            Time.setText("" + TimeOut);
                            Integer rnd = (int)Math.round(Math.random()*7);
                            switch (rnd){
                                case 0:
                                    krtek(hole1);
                                    break;
                                case 1:
                                    krtek(hole2);
                                    break;
                                case 2:
                                    krtek(hole3);
                                    break;
                                case 3:
                                    krtek(hole4);
                                    break;
                                case 4:
                                    krtek(hole5);
                                    break;
                                case 5:
                                    krtek(hole6);
                                    break;
                                case 6:
                                    krtek(hole7);
                                    break;
                                case 7:
                                    krtek(hole8);
                                    break;
                            }
                            if(TimeOut == 0){
                                String coun = Count1.getText().substring(0, 6);
                                Count1.setText(coun + "" + Count.getText());
                                if(Integer.parseInt(Record.getText().substring(16))<acc){
                                    String rec = Record.getText().substring(0, 16);
                                    Record.setText(rec + "" + Count.getText());
                                    Record1.setText(rec + "" + Count.getText());
                                }
                                Result.setVisible(true);
                            }
                        }
                )
        );
        TimeSession.setCycleCount(30);
        TimeSession.play();
        hole1.setOnMouseClicked(event -> {
            kill(hole1);
        });
        hole2.setOnMouseClicked(event -> {
            kill(hole2);
        });
        hole3.setOnMouseClicked(event -> {
            kill(hole3);
        });
        hole4.setOnMouseClicked(event -> {
            kill(hole4);
        });
        hole5.setOnMouseClicked(event -> {
            kill(hole5);
        });
        hole6.setOnMouseClicked(event -> {
            kill(hole6);
        });
        hole7.setOnMouseClicked(event -> {
            kill(hole7);
        });
        hole8.setOnMouseClicked(event -> {
            kill(hole8);
        });
    }

}


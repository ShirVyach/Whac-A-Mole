package com.example.whacamole;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent start = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(start, 600, 400);
        stage.setResizable(false);
        stage.setTitle("Whac A Mole!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
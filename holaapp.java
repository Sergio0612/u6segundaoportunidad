package com.example.unidad6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class holaapp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("hols-view.fxml"));
        Scene scene = new Scene(root.load(), 400, 600);
        String css = getClass().getResource("Style/app.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Sergio Peñaloza");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


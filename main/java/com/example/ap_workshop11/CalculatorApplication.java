package com.example.ap_workshop11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml")) ;
        primaryStage.setTitle("Calculator") ;
        primaryStage.setScene(new Scene(root)) ;
        primaryStage.show() ;
    }
    public static void main(String[] args) {
        launch(args) ;
    }
}
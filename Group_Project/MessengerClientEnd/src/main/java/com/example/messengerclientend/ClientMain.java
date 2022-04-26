package com.example.messengerclientend;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class ClientMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        primaryStage.setTitle("OTU CHAT APPLICATION - Client"); //title
        primaryStage.setScene(new Scene(root, 600, 400));//size
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL url = new File("src/main/resources/fxml/scan.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);

        stage.setTitle("Hello world Application");
//        stage.setWidth(700);
//        stage.setHeight(700);

//        Label helloWorldLabel = new Label("Hello world!");
//        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(root,980, 700);
        stage.setScene(primaryScene);

        stage.show();
    }

    public static void main(String[] args) {
        // Here you can work with args - command line parameters
        Application.launch(args);
    }
}
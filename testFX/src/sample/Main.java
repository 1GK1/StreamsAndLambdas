package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.xml.transform.Source;

public class Main extends Application implements EventHandler {
    Button button = new Button("buttton");


    @Override
    public void start(Stage primaryStage) throws Exception {

//        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 300, 300, button);
        BorderPane borderPane = new BorderPane(button);
        Scene scene = new Scene(borderPane);
        button.setText("New button");

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);

        button.setOnAction(this::handle);
        button.setOnAction(actionEvent -> button.setText("From lambda"));
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                button.setText("From anonymous class");
                primaryStage.close();
            }
        });

        primaryStage.setTitle("Hello World 1111");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        Object source = event.getSource();
        if(source==button && button.getText().equals("New button")) {
            button.setText("Change");
        } else
        button.setText("New button");
    }
}

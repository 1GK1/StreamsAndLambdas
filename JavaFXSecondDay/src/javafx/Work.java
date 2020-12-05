package javafx;//import javafx.scene.control.*;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

class Handle implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("EVENT!!!!");
    }
}

public class Work extends Application {
    Button buttonExit;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        buttonExit = new Button();
        buttonExit.setText("javafx.Test");
        buttonExit.setOnAction(actionEvent -> System.out.println("ddd"));
        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 10, 10, buttonExit);
        flowPane.setPadding(new Insets(20));
        flowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        System.out.println("!");
        stage.show();
    }
}

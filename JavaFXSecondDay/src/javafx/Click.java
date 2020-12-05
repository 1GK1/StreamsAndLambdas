package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

class Handler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("EVENT!!!!");

    }
}


public class Click extends Application {
    Button buttonAdd;
    Button buttonAdd2;
    Button buttonSub;
    Button crazyWay;
    Label labelCounter;
    int counter = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        buttonAdd = new Button("Add 1");
        buttonSub = new Button("Sub 1");
        buttonAdd2 = new Button("Add 2");
        crazyWay = new Button("Crazy...");

        labelCounter = new Label("0");
        buttonSub.setOnAction(e -> labelCounter.setText(String.valueOf(--counter)));
        buttonAdd.setOnAction(e -> buttonAddClick());



        Handler handler = new Handler();
        crazyWay.setOnAction(handler);

        buttonAdd2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                labelCounter.setText(String.valueOf(counter = counter + 2));
            }
        });



        FlowPane flowPane = new FlowPane(Orientation.HORIZONTAL, 10, 10, crazyWay, buttonAdd2, buttonAdd, buttonSub, labelCounter);
        flowPane.setPadding(new Insets(20));
        flowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);

        primaryStage.setTitle("COUNTER");
        primaryStage.setTitle("dd");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void buttonAddClick() {
        labelCounter.setText(String.valueOf(++counter));
    }

//    private void buttonSubClick() {
//        labelCounter.setText(String.valueOf(--counter));
//    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

}

package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class TestClass extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(new Button("Button"));
        Scene scene = new Scene(flowPane);
        stage.setScene(scene);
        stage.setTitle("SCENE");
        stage.show();
    }
}

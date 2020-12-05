package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ManagerFlowPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button button;

    @Override
    public void start(Stage stage) throws Exception {


        FlowPane flowPane = new FlowPane(1, 1);
        flowPane.setAlignment(Pos.CENTER);
        flowPane.setPadding(new Insets(5));

        for (int i = 0; i < 100; i++) {
            button = new Button();
            button.setText(String.valueOf(i));
            button.setPrefWidth(35);
            flowPane.getChildren().add(button);
        }


        Scene scene = new Scene(flowPane);
        scene.setOnMouseClicked(mouseEvent -> stageClicked(flowPane));
        stage.setScene(scene);

        stage.setTitle("100 buttons");
        stage.show();
    }

    int i = 0;

    private void stageClicked(FlowPane flowPane) {
        i++;
        if (i == 1) flowPane.setOrientation(Orientation.VERTICAL);
        else if (i == 2) flowPane.setOrientation(Orientation.HORIZONTAL);
        else if (i == 3) flowPane.setVgap(10);
        else if (i == 4) flowPane.setHgap(10);
        else if (i == 5) flowPane.setPadding(new Insets(10));
        else if (i == 6) flowPane.setAlignment(Pos.BOTTOM_RIGHT);
    }
}

package javafx;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
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

import java.awt.*;

import static javafx.scene.layout.BorderStrokeStyle.*;
import static javafx.scene.layout.VBox.setMargin;

public class HVBoxes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Button button1;
    Button button2;
    Button button3;
    Button button4;
//    Region region;

    @Override
    public void start(Stage stage) throws Exception {

        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");

//        region = new Region();


        HBox hBox = new HBox(20, button1, button2, button3, button4);
        hBox.setPrefSize(400, 100);
        hBox.resize(100,100);
        hBox.setAlignment(Pos.TOP_LEFT);
        hBox.setPadding(new Insets(20));


        button1.setPrefSize(40, 40);
//        setMargin(button1, new Insets(20));
//        setVgrow(button1, Priority.ALWAYS);
//        setHgrow(button1, Priority.ALWAYS);
        button2.setPrefSize(80, 80);
        button3.setPrefSize(30, 80);
        button4.setPrefSize(80, 30);

        hBox.setBorder(Border.EMPTY);

//        hBox.setBorder(
//                new Border(
//                        new BorderStroke(
//                                Color.RED,
//                                BorderStrokeStyle.SOLID,
//                                new BorderWidths(3))));


//        hBox.setBorder(new Border(new BorderStroke(Color.RED,
//                BorderStrokeStyle.SOLID,
//                CornerRadii.EMPTY,
//                BorderWidths.DEFAULT)));


        Scene scene = new Scene(hBox);
        stage.setScene(scene);

        stage.setTitle("Color, margins and so on...");
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

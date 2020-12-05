import javafx.application.Application;
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
import javafx.stage.Modality;
import javafx.stage.Stage;


public class TwoStages extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Stage stage1 = new Stage();
        Stage stage2 = new Stage();

        stage1.setTitle("First stage");
        stage2.setTitle("Second stage");

        stage1.setWidth(400);
        stage1.setHeight(200);
        stage1.setX(300);
        stage1.setY(300);
        stage1.show();

        stage2.setWidth(400);
        stage2.setHeight(200);
        stage2.setX(700);
        stage2.setY(300);
        stage2.initModality(Modality.WINDOW_MODAL);
        stage2.initOwner(stage1);

        stage2.show();

    }
}

package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestSB extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TestSB.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    @FXML
//    public void processNumbers(javafx.event.ActionEvent event){
//        System.out.println("We did it!");
//    }

    @FXML
    public void processNumbers(ActionEvent event){
        System.out.println("We did it!");
    }

//    public void processNumbers(javafx.event.ActionEvent actionEvent) {
//    }
}

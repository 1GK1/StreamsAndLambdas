//import javafx.application.Application;
//import javafx.application.Platform;
//import javafx.event.Event;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.layout.BorderPane;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Main extends Application implements EventHandler {
//    Button buttonExit = new Button("Exit");
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//
//    @Override
//    public void handle(Event event) {
//        if (event.getSource() == buttonExit) {
//            Platform.exit();
//        } else
//            System.out.println("Action unknown");
//    }
//
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        buttonExit = new Button();
//        BorderPane borderPane = new BorderPane();
////        buttonExit.add(primaryStage);
//        Scene scene = new Scene(borderPane, 300, 200);
//
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("JavaFX");
//        primaryStage.centerOnScreen();
//        primaryStage.show();
//
//    }
//}

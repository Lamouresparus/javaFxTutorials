package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Pane mypane = new Pane();
        Button button = new Button("Send...ohlala");
        mypane.getChildren().setAll(button);
        primaryStage.setTitle("My first java app");
        primaryStage.setScene(new Scene(mypane));
        button.setOnAction(e->
                System.out.println("lol"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

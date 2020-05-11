package Job;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) {

        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        try {
            root = FXMLLoader.load(loc);
        }catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
            Scene windowContents = new Scene(root);
            primaryStage.setScene(windowContents);
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

}

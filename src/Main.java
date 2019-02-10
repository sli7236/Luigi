import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loadUp.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("BAATEL SHIEP5");
        primaryStage.setScene(scene);
        primaryStage.show();

        //As soon as the game is loaded, the results page is set up and the table is filled out with the information in the table
    }


    public static void main(String[] args) {
        launch(args);
    }
}

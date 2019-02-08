import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.awt.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class sceneOne implements Initializable{
    @FXML
    private AnchorPane sceneOne;
    @FXML private TextField name;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void nextSceneTwo(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        sceneOne.getChildren().setAll(pane);
    }

    @FXML private void submit(ActionEvent event) throws IOException {
        String playerName = name.getText();
        //Files.write(Paths.get("results.csv"), playerName.getBytes(), StandardOpenOption.APPEND);
        System.out.println(playerName);
    }

}

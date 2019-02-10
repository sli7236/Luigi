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

import java.io.IOException;

public class loginScreen implements Initializable{
    @FXML private AnchorPane sceneTwo;
    @FXML private TextField name;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML private void submit(ActionEvent event) throws IOException {
        String playerName = name.getText();
        //Files.write(Paths.get("results.csv"), playerName.getBytes(), StandardOpenOption.APPEND);
        CSVReader.Data.setPlayerNameProperty(playerName);
        System.out.println(CSVReader.Data.playerNameProperty());

        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("game.fxml"));
        sceneTwo.getChildren().setAll(pane);
    }


}

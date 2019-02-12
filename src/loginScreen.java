import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ResourceBundle;

import java.io.IOException;

public class loginScreen implements Initializable{
    @FXML private AnchorPane sceneTwo;
    @FXML private TextField name;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML private void submit(ActionEvent event) throws IOException {
        String playerName = name.getText();
        FileWriter fr = new FileWriter("src/results.csv", true);
        BufferedWriter br = new BufferedWriter(fr);
        br.newLine();
        br.write(playerName + ",");
        br.close();
        fr.close();

        AnchorPane pane = FXMLLoader.load(this.getClass().getResource("game.fxml"));
        sceneTwo.getChildren().setAll(pane);
    }


}

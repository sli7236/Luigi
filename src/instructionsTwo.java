import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
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

public class instructionsTwo implements Initializable{
    @FXML private AnchorPane sceneFour;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void logInScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        sceneFour.getChildren().setAll(pane);
    }


}

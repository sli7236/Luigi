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

public class instructions implements Initializable{
    @FXML private AnchorPane sceneThree;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void instructionTwoScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("instructionsTwo.fxml"));
        sceneThree.getChildren().setAll(pane);
    }


}

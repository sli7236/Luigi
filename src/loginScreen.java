import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;

public class loginScreen implements Initializable{
    @FXML
    private AnchorPane sceneTwo;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void nextSceneThree(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("instructions.fxml"));
        sceneTwo.getChildren().setAll(pane);
    }

}

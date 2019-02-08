import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import java.io.IOException;

public class sceneOne implements Initializable{
    @FXML
    private AnchorPane sceneOne;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void nextSceneTwo(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        sceneOne.getChildren().setAll(pane);
    }

}

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import java.io.IOException;

public class loadUp implements Initializable{
    @FXML private AnchorPane sceneOne;

    @Override
    public void initialize(URL url,ResourceBundle rb){
    }

    @FXML
    private void nextGameScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loginScreen.fxml"));
        sceneOne.getChildren().setAll(pane);
    }

    @FXML
    private void nextInfoScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("instructions.fxml"));
        sceneOne.getChildren().setAll(pane);
    }

    @FXML
    private void nextScoreScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("results.fxml"));
        sceneOne.getChildren().setAll(pane);
    }


}

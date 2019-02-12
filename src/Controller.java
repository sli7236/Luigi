import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.util.List;

public class Controller {
    @FXML private AnchorPane gamePlay;
    private GameBattleShip battleship = new GameBattleShip();

    public void initialize() {
        battleship.generateEnemyShip();
    }
    @FXML public void init(ActionEvent event) throws IOException{
        Button buttonSrc = (Button) event.getSource();
        String nameOfButton = buttonSrc.getId();
        int row = Integer.parseInt(nameOfButton.substring(1,2));
        int column = Integer.parseInt(nameOfButton.substring(2,3));
        battleship.placeDownShip(row, column);
        battleship.displayBoards();
    }
    @FXML public void enemy(ActionEvent event) throws IOException {
        Button buttonSrc = (Button) event.getSource();
        String nameOfButton = buttonSrc.getId();
        int row = Integer.parseInt(nameOfButton.substring(1,2));
        int column = Integer.parseInt(nameOfButton.substring(2,3));
        battleship.attackEnemyBoard(row, column);
    }



}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
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
    @FXML private Button one;

   @FXML private Button two;
    @FXML private Button three;
    @FXML private Button four;
    @FXML private Button five;
    @FXML private Button six;
    @FXML private Button seven;
    @FXML private Button eight;
    @FXML private Button nine;
    @FXML private Button ten;
    @FXML private Button eleven;
    @FXML private Button twelve;
    @FXML private Button thirteen;
    @FXML private Button fourteen;
    @FXML private Button fifteen;
    @FXML private Button sixteen;
    @FXML private Button seventeen;
    @FXML private Button eighteen;
    @FXML private Button nineteen;
    @FXML private Button twenty;
    @FXML private Button twentyone;
    @FXML private Button twentytwo;
    @FXML private Button twentythree;
    @FXML private Button twentyfour;
    @FXML private Button twentyfive;
    @FXML private Button twentysix;
    @FXML private Button twentyseven;
    @FXML private Button twentyeight;
    @FXML private Button twentynine;
    @FXML private Button thirty;
    @FXML private Button thirtyone;
    @FXML private Button thirtytwo;
    @FXML private Button thirtythree;
    @FXML private Button thirtyfour;
    @FXML private Button thirtyfive;
    @FXML private Button thirtysix;
    @FXML private Button thirtyseven;
    @FXML private Button thirtyeight;
    @FXML private Button thirtynine;
    @FXML private Button fourty;
    @FXML private Button fourtyone;
    @FXML private Button fourtytwo;
    @FXML private Button fourtythree;
    @FXML private Button fourtyfour;
    @FXML private Button fourtyfive;
    @FXML private Button fourtysix;
    @FXML private Button fourtyseven;
    @FXML private Button fourtyeight;
    @FXML private Button fourtynine;
    @FXML private Button fifty;
    @FXML private Button fiftyone;
    @FXML private Button fiftytwo;
    @FXML private Button fiftythree;
    @FXML private Button fiftyfour;
    @FXML private Button fiftyfive;
    @FXML private Button fiftysix;
    @FXML private Button fiftyseven;
    @FXML private Button fiftyeight;
    @FXML private Button fiftynine;
    @FXML private Button sixty;
    @FXML private Button sixtyone;
    @FXML private Button sixtytwo;
    @FXML private Button sixtythree;
    @FXML private Button sixtyfour;
    @FXML private Button sixtyfive;
    @FXML private Button sixtysix;
    @FXML private Button sixtyseven;
    @FXML private Button sixtyeight;
    @FXML private Button sixtynine;
    @FXML private Button seventy;
    @FXML private Button sevetyone;
    @FXML private Button seventytwo;
    @FXML private Button seventythree;
    @FXML private Button seventyfour;
    @FXML private Button seventyeight;
    @FXML private Button seventynine;
    @FXML private Button eighty;
    @FXML private Button eightyone;
    @FXML private Button eightytwo;
    @FXML private Button eightythree;
    @FXML private Button eightyfour;
    @FXML private Button eightyfive;
    @FXML private Button eightysix;
    @FXML private Button eightyseven;
    @FXML private Button eightyeight;
    @FXML private Button eightynine;
    @FXML private Button P86;
    @FXML private Button P87;
    @FXML private Button P88;
    @FXML private Button P89;
    @FXML private Button P90;
    @FXML private Button P91;
    @FXML private Button P92;
    @FXML private Button P93;
    @FXML private Button P94;
    @FXML private Button P95;
    @FXML private Button P96;
    @FXML private Button P97;
    @FXML private Button P98;
    @FXML private Button P99;

    public void init(){
        GameBattleShip game = new GameBattleShip();
        game.generateEnemyShip();
        P00.game.placeDownShip(0,0);
    }



}

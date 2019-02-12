import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.List;

public class resultsFXML implements Initializable{
    @FXML private AnchorPane scoreScene;
    @FXML private AnchorPane tablePane;

    @FXML
    public void backLoadScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loadUp.fxml"));
        scoreScene.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url,ResourceBundle rb){
        tablePane.getStylesheets().add("tableCSS.css");
        List<CSVReader.Data> data = CSVReader.readCSVFile("src/results.csv");
        TableView table = new TableView();

        table.setEditable(true);

        TableColumn playerName = new TableColumn("Player Name");
        playerName.setCellValueFactory(new PropertyValueFactory("playerName"));
        TableColumn score = new TableColumn("Score");
        score.setCellValueFactory(new PropertyValueFactory("score"));
        TableColumn enemyShipHits = new TableColumn("# of Times Enemy Ships Were Hit");
        enemyShipHits.setCellValueFactory(new PropertyValueFactory("enemyShipHits"));
        TableColumn enemyShipsSunk = new TableColumn("Enemy Ships Sunk");
        enemyShipsSunk.setCellValueFactory(new PropertyValueFactory("enemyShipsSunk"));
        TableColumn playerShipHits = new TableColumn("# of Times Player Ships Were Hit");
        playerShipHits.setCellValueFactory(new PropertyValueFactory("playerShipHits"));
        TableColumn playerShipsSunk = new TableColumn("Player Ships Sunk");
        playerShipsSunk.setCellValueFactory(new PropertyValueFactory("playerShipsSunk"));


        ObservableList<CSVReader.Data> oListData = FXCollections.observableArrayList(data);
        System.out.println(oListData.get(0).toString());
        /**
         * The problem is that what ever the CSVReader is returning, it's doing something wrong.
         * ObservableList<CSVReader.Data> oListData = FXCollections.observableArrayList(data.get(0)); displays John on the table, despite being the third item in the data array list
         * I changed the index in the data.get() and each time it would only return john and nothing else
         * The table would only display the last line of the file
         *
         * **/


        table.getColumns().addAll(playerName, score, enemyShipHits, enemyShipsSunk, playerShipHits, playerShipsSunk);
        table.setItems(oListData);

        tablePane.setPadding(new Insets(30, 10, 20, 40));
        tablePane.getChildren().addAll(table);

    }




}

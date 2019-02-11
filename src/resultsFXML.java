import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
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

public class resultsFXML implements Initializable{
    @FXML private AnchorPane scoreScene;
    @FXML private TableView<CSVReader.Data> tableView;
    @FXML private TableColumn<CSVReader,StringProperty> nameColumn;
    @FXML private TableColumn<CSVReader, IntegerProperty> scoreColumn;
    @FXML private TableColumn<CSVReader,IntegerProperty> eHitColumn;
    @FXML private TableColumn<CSVReader, IntegerProperty> eSunkColumn;
    @FXML private TableColumn<CSVReader,IntegerProperty> pHitColumn;
    @FXML private TableColumn<CSVReader,IntegerProperty> pSunkColumn;



    @FXML
    public void backLoadScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loadUp.fxml"));
        scoreScene.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url,ResourceBundle rb){
        Scene scene = new Scene(new Group());
        nameColumn.setCellValueFactory(new PropertyValueFactory("playerName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory("score"));
        eHitColumn.setCellValueFactory(new PropertyValueFactory("eHit"));
        eSunkColumn.setCellValueFactory(new PropertyValueFactory("eSunk"));
        pHitColumn.setCellValueFactory(new PropertyValueFactory("pHit"));
        pSunkColumn.setCellValueFactory(new PropertyValueFactory("pSunk"));

        tableView.setItems(getPeople());

    }

    /**
     * This method will use an observable list(used with scene builder bc javafx is an ass and can't use array list)return data to fill the table with
     **/
    public ObservableList<CSVReader.Data> getPeople(){
        List<CSVReader.Data> data = CSVReader.readCSVFile("src/results.csv");
        ObservableList<CSVReader.Data> info = FXCollections.observableArrayList(data);
        return info;
    }


}

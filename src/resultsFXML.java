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
    @FXML private TableColumn<playInfo,String> nameColumn;
    @FXML private TableColumn<playInfo,Integer> scoreColumn;
    @FXML private TableColumn<playInfo,Integer> eHitColumn;
    @FXML private TableColumn<playInfo, Integer> eSunkColumn;
    @FXML private TableColumn<playInfo,Integer> pHitColumn;
    @FXML private TableColumn<playInfo,Integer> pSunkColumn;

    @FXML
    public void backLoadScene(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("loadUp.fxml"));
        scoreScene.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url,ResourceBundle rb){
        Scene scene = new Scene(new Group());
        nameColumn.setCellValueFactory(new PropertyValueFactory<playInfo,String>("playerName"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<playInfo,Integer>("score"));
        eHitColumn.setCellValueFactory(new PropertyValueFactory<playInfo,Integer>("eHit"));
        eSunkColumn.setCellValueFactory(new PropertyValueFactory<playInfo,Integer>("eSunk"));
        pHitColumn.setCellValueFactory(new PropertyValueFactory<playInfo,Integer>("pHit"));
        pSunkColumn.setCellValueFactory(new PropertyValueFactory<playInfo,Integer>("pSunk"));

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

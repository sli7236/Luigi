import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.List;
import static javafx.application.Application.launch;

public class Results extends Application{
    @Override
    public void start(Stage stage) {
        List<CSVReader.Data> data = CSVReader.readCSVFile("src/results.csv");
        TableView table = new TableView();
        Scene scene = new Scene(new Group());
        stage.setTitle("Results");
        stage.setWidth(750);
        stage.setHeight(750);

        final Label label = new Label("Results");

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
        table.setItems(oListData);
        table.getColumns().addAll(playerName, score, enemyShipHits, enemyShipsSunk, playerShipHits, playerShipsSunk);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);


        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

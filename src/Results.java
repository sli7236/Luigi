import javafx.application.Application;
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
        List<Data> data = CSVReader.readCSVFile("src/results.csv");
        TableView table = new TableView();
        Scene scene = new Scene(new Group());
        stage.setTitle("Results");
        stage.setWidth(750);
        stage.setHeight(750);

        final Label label = new Label("Results");

        table.setEditable(true);

        TableColumn playerName = new TableColumn("Player Name");
        TableColumn score = new TableColumn("Score");
        TableColumn enemyShipHits = new TableColumn("# of Times Enemy Ships Were Hit");
        TableColumn enemyShipsSunk = new TableColumn("Enemy Ships Sunk");
        TableColumn playerShipHits = new TableColumn("# of Times Enemy Ships Were Hit");
        TableColumn playerShipsSunk = new TableColumn("Player Ships Sunk");

        table.getColumns().addAll(playerName, score, enemyShipHits, enemyShipsSunk, playerShipHits, playerShipsSunk);

        /*for(int i = 0; i<data.size();i++){
            Data current = data.get(i);
            table.getColumns().addAll(new Data(current.getPlayerName(), current.getScore(), current.getEnemyShipHits(), current.getEnemyShipsSunk(), current.getPlayerShipHits(), current.getPlayerShipsSunk()));
        }*/

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);


        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();

        /*final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("School");

        final LineChart<String,Number> lineChart =
                new LineChart<String,Number>(xAxis,yAxis);

        lineChart.setTitle("SAT Results 2012");

        XYChart.Series series = new XYChart.Series();
        series.setName("SAT Math");



        for(int i = 0; i<data.size();i++){
            Data   current = data.get(i);
            series.getData().add(new XYChart.Data(current.getPlayerName(), current.getScore()));
        }


        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);*/

    }

    public static void main(String[] args) {
        launch(args);
    }
}

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 *
 * @author WINDOWS 8
 *
 */
public class CSVReader {

    public static void main(String... args) {
        List<CSVReader.Data> data = readCSVFile("src/results.csv");

        // let's print all the person read from CSV file
        //for (Data b : data) {
          //  System.out.println(b);
        //}
    }

    public static List<CSVReader.Data> readCSVFile(String fileName) {
        List<Data> dataSet = new ArrayList<>();
        ArrayList<String> otherDataSet = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {

                String[] attributes = line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                System.out.println(Arrays.toString(attributes));
                otherDataSet.add(Arrays.toString(attributes)); ///turns the data into string
                Data data = createData(attributes);
                dataSet.add(data);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println(otherDataSet);
        return dataSet;
    }

    private static Data createData(String[] metadata) {
        String playerName = metadata[0];
        int score = Integer.parseInt(metadata[1]);
        int enemyShipHits = Integer.parseInt(metadata[2]);
        int enemyShipsSunk = Integer.parseInt(metadata[3]);
        int playerShipHits = Integer.parseInt(metadata[4]);
        int playerShipsSunk = Integer.parseInt(metadata[5]);

        return new Data(playerName, score, enemyShipHits, enemyShipsSunk, playerShipHits, playerShipsSunk);
    }


    public static class Data {
        private StringProperty playerName2;
        private IntegerProperty score2;
        private IntegerProperty enemyShipHits2;
        private IntegerProperty enemyShipsSunk2;
        private IntegerProperty playerShipHits2;
        private IntegerProperty playerShipsSunk2;

        public Data(String playerName, int score, int enemyShipHits, int enemyShipsSunk, int playerShipHits, int playerShipsSunk) {
            this.playerName2 = new SimpleStringProperty(playerName);
            this.score2 = new SimpleIntegerProperty(score);
            this.enemyShipHits2 = new SimpleIntegerProperty(enemyShipHits);
            this.enemyShipsSunk2 = new SimpleIntegerProperty(enemyShipsSunk);
            this.playerShipHits2 = new SimpleIntegerProperty(playerShipHits);
            this.playerShipsSunk2 = new SimpleIntegerProperty(playerShipsSunk);
        }

        public StringProperty playerNameProperty() {
            return playerName2;
        }

        public IntegerProperty scoreProperty() {
            return score2;
        }

        public IntegerProperty enemyShipHitsProperty() {
            return enemyShipHits2;
        }

        public IntegerProperty enemyShipsSunkProperty() {
            return enemyShipsSunk2;
        }

        public IntegerProperty playerShipHitsProperty() {
            return playerShipHits2;
        }

        public IntegerProperty playerShipsSunkProperty() {
            return playerShipsSunk2;
        }



        public void setPlayerNameProperty(String playerName) {
            playerName2 = new SimpleStringProperty(playerName);
        }

        public void setScoreProperty(int score) {

            score2 = new SimpleIntegerProperty(score);
        }

        public void setEnemyShipHitsProperty(int enemyShipHits) {

            enemyShipHits2 = new SimpleIntegerProperty(enemyShipHits);
        }

        public void setEnemyShipsSunkProperty(int enemyShipsSunk) {

            enemyShipsSunk2 = new SimpleIntegerProperty(enemyShipsSunk);
        }

        public void setPlayerShipHitsProperty(int playerShipHits) {
            playerShipHits2 = new SimpleIntegerProperty(playerShipHits);
        }

        public void setPlayerShipsSunkProperty(int playerShipsSunk) {

            playerShipsSunk2 = new SimpleIntegerProperty(playerShipsSunk);
        }
    }

}
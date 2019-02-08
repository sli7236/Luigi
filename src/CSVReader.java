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
        List<Data> data = readCSVFile("results.csv");

        // let's print all the person read from CSV file
        for (Data b : data) {
            System.out.println(b);
        }
    }

    public static List<Data> readCSVFile(String fileName) {
        List<Data> dataSet = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
                System.out.println(Arrays.toString(attributes));

                Data data = createData(attributes);

                // adding book into ArrayList
                dataSet.add(data);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return dataSet;
    }

    private static Data createData(String[] metadata) {
        String playerName = metadata[0];
        int score = Integer.parseInt(metadata[1]);
        int enemyShipHits = Integer.parseInt(metadata[2]);
        int enemyShipsSunk = Integer.parseInt(metadata[3]);
        int playerShipHits = Integer.parseInt(metadata[4]);
        int playerShipsSunk = Integer.parseInt(metadata[5]);

        // create and return book of this metadata
        return new Data(playerName, score, enemyShipHits, enemyShipsSunk, playerShipHits, playerShipsSunk);
    }


    public static class Data {
        private static StringProperty playerName2;
        private static IntegerProperty score;
        private static IntegerProperty enemyShipHits;
        private static IntegerProperty enemyShipsSunk;
        private static IntegerProperty playerShipHits;
        private static IntegerProperty playerShipsSunk;

        private Data(String playerName, int score, int enemyShipHits, int enemyShipsSunk, int playerShipHits, int playerShipsSunk) {
            this.playerName2 = new SimpleStringProperty(playerName);
            this.score = new SimpleIntegerProperty(score);
            this.enemyShipHits = new SimpleIntegerProperty(enemyShipHits);
            this.enemyShipsSunk = new SimpleIntegerProperty(enemyShipsSunk);
            this.playerShipHits = new SimpleIntegerProperty(playerShipHits);
            this.playerShipsSunk = new SimpleIntegerProperty(playerShipsSunk);
        }

        public static StringProperty playerNameProperty() {
            return playerName2;
        }

        public static IntegerProperty scoreProperty() {
            return score;
        }

        public static IntegerProperty enemyShipHitsProperty() {
            return enemyShipHits;
        }

        public static IntegerProperty enemyShipsSunkProperty() {
            return enemyShipsSunk;
        }

        public static IntegerProperty playerShipHitsProperty() {
            return playerShipHits;
        }

        public static IntegerProperty playerShipsSunkProperty() {
            return playerShipsSunk;
        }



        public static void setPlayerNameProperty(String playerName) {
            playerName2 = new SimpleStringProperty(playerName);
        }

        public void setScoreProperty(int score) {

            this.score = new SimpleIntegerProperty(score);
        }

        public void setEnemyShipHitsProperty(int enemyShipHits) {

            this.enemyShipHits = new SimpleIntegerProperty(enemyShipHits);
        }

        public void setEnemyShipsSunkProperty(int enemyShipsSunk) {

            this.enemyShipsSunk = new SimpleIntegerProperty(enemyShipsSunk);
        }

        public void setPlayerShipHitsProperty(int playerShipHits) {
            this.playerShipHits = new SimpleIntegerProperty(playerShipHits);
        }

        public void setPlayerShipsSunkProperty(int playerShipsSunk) {

            this.playerShipsSunk = new SimpleIntegerProperty(playerShipsSunk);
        }
    }

}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Tester {

    public static void main(String[] args) throws IOException {
        GameBattleShip game = new GameBattleShip();
        game.generateEnemyShip();

        while (!game.ready()) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.equals("s")) {
                game.displayBoards();
            }

            else {
                game.placeDownShip(Integer.parseInt(input.split(",")[0]), Integer.parseInt(input.split(",")[1]));
            }
        }
        while (game.enemyShipsLeft() > 0 && game.playerShipsLeft() > 0) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            if (input.equals("s")) {
                game.displayBoards();
            }
            else {
                game.attackEnemyBoard(Integer.parseInt(input.split(",")[0]), Integer.parseInt(input.split(",")[1]));
            }
        }
        if (game.enemyShipsLeft() > 0) {
            System.err.println("EPIC LOSS");
        }
        else {

            System.out.println("EPIC WIN");
        }

        CSVReader.Data.setScoreProperty(100 - game.getEHits());
        CSVReader.Data.setEnemyShipHitsProperty(game.getEHits());
        CSVReader.Data.setPlayerShipHitsProperty(game.getPHits());
        CSVReader.Data.setEnemyShipsSunkProperty(game.enemyShipsLeft());
        CSVReader.Data.setPlayerShipsSunkProperty(game.playerShipsLeft());
        FileWriter fr = new FileWriter("src/results.csv", true);
        BufferedWriter br = new BufferedWriter(fr);
        br.newLine();
        br.write(CSVReader.Data.playerNameProperty().getValue() + "," + CSVReader.Data.scoreProperty().getValue() + "," + CSVReader.Data.enemyShipHitsProperty().getValue() + "," + CSVReader.Data.enemyShipsSunkProperty().getValue() + "," + CSVReader.Data.playerShipHitsProperty().getValue() + "," + CSVReader.Data.playerShipsSunkProperty().getValue());
        br.close();
        fr.close();

        FileWriter fw = new FileWriter("src/scoreboard.csv", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write(CSVReader.Data.playerNameProperty().getValue() + "," + CSVReader.Data.scoreProperty().getValue());
        bw.close();
        fw.close();
    }
}

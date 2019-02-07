import java.util.*;

public class Tester {

    public static void main(String[] args) {
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
    }
}

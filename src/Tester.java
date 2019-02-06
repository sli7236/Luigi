import java.util.*;

public class Tester {

    public static void main(String[] args) {
        GameBattleShip game = new GameBattleShip();

        while (true) {
            if (!game.ready()) {
                Scanner in = new Scanner(System.in);
                String input = in.nextLine();

                if (input.equals("s")) {
                    game.displayBoards();
                }
                else if (input.contains("hit")) {
                    String s = input.substring(3);
                    game.attackPlayerBoard(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[0]));
                }
                else {
                    game.placeDownShip(Integer.parseInt(input.split(",")[0]), Integer.parseInt(input.split(",")[1]));
                }
            }
        }
    }
}

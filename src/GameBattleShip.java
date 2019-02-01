import java.util.*;

public class GameBattleShip {
    private PlayerBoard playerBoard = new PlayerBoard(10, 10);
    private CPUBoard cpuBoard = new CPUBoard(10, 10);
    private int playerSelectedSpaces = 0;
    private Space selectedSpace;
    private Space secondSpace;

    public void placeDownShip(int lengthOfShip, int row, int column) {
        if (playerSelectedSpaces == 0) {
            playerBoard.selectSpace(row, column);
            selectedSpace = playerBoard.returnSpace(row, column);
            playerSelectedSpaces ++;
        }
        else if (playerSelectedSpaces == 1) {
            playerBoard.selectSpace(row, column);
            secondSpace = playerBoard.returnSpace(row, column);
        }


    }
}

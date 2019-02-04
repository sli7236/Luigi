import java.util.*;

public class GameBattleShip {
    private PlayerBoard playerBoard = new PlayerBoard(10, 10);
    private CPUBoard cpuBoard = new CPUBoard(10, 10);
    private int playerSelectedSpaces = 0;
    private Space selectedSpace;
    private Space secondSpace;

    /**
     * @param row row of selected space on player board
     * @param column column of space on player board
     */
    public void placeDownShip(int row, int column) {
        if (playerSelectedSpaces == 0) {
            playerBoard.selectSpace(row, column);
            selectedSpace = playerBoard.returnSpace(row, column);
            playerSelectedSpaces ++;
        }
        else if (playerSelectedSpaces == 1) {
            playerBoard.selectSpace(row, column);
            secondSpace = playerBoard.returnSpace(row, column);
            if (selectedSpace.equals(secondSpace)) {
                System.err.println("first space is the same as the second");
                selectedSpace.toggleSelect();
                playerSelectedSpaces = 0;
            }
            else if (!playerBoard.placeShips(selectedSpace, secondSpace)) {
                System.err.println("invalid placement: ");
                selectedSpace.toggleSelect();
                secondSpace.toggleSelect();
                playerSelectedSpaces = 0;
            }
            else {
                // Precondition: One of the rows/columns match, and only one
                if (playerBoard.returnNoOfShips() == 0) {
                    if (selectedSpace.compareColumn(secondSpace) == 0) {
                        if ()
                    }
                }
                else if (playerBoard.returnNoOfShips() == 1) {

                }
                else if (playerBoard.returnNoOfShips() == 2 || playerBoard.returnNoOfShips() == 3) {

                }
                else if (playerBoard.returnNoOfShips() == 4) {

                }
                else {
                    System.err.println("too many ships");
                }
            }
        }


    }
}

public class PlayerBoard extends BattleshipBoardTemplate {
    private Space[][] board;
    private int ships = 0;
    private boolean ready = false;

    public PlayerBoard(int length, int width) {
        board = new Space[length][width];
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = new Space(i, j);
            }
        }
    }

    public void selectSpace(int row, int column, boolean x) { // selecting a playerboard will place the ships down when the game is in build mode
        board[row][column].setSelect(x);
    }

    public boolean spaceIsSelected(int row, int column) {
        return board[row][column].isSelected();
    }

    /**
     * Assume that row1 == row2 ^^ column1 == column2
     *
     * @param space1 first space
     * @param space2 second space
     * @return if the placement of ships is valid (there are no ships in the way)
     */
    public boolean checkShipValidity(Space space1, Space space2) {
        int row1 = space1.returnRow(); int row2 = space2.returnRow();
        int column1 = space1.returnColumn(); int column2 = space2.returnColumn();
        if (row1 != row2) {
            if (row1 < row2) {
                for (int i = row1; i <= row2; i ++) {
                    if (board[i][column1].shipExists()) {
                        return false;
                    }
                }
            }
            else {
                for (int i = row2; i <= row1; i ++) {
                    if (board[i][column1].shipExists()) {
                        return false;
                    }
                }
            }
        }
        else if (column1 != column2) {
            if (column1 < column2) {
                for (int i = column1; i <= column2; i ++) {
                    if (board[row1][i].shipExists()) {
                        return false;
                    }
                }
            }
            else {
                for (int i = column2; i <= column1; i ++) {
                    if (board[row1][i].shipExists()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void placeShip(int row, int column) {
        board[row][column].placeShip();
    }

    public boolean hit(int row, int column) {
        board[row][column].hitSpot();
        return (board[row][column].shipExists());
    }

    public int returnNoOfShips() {
        return ships;
    }

    public void addShip() {
        ships ++;
        if (ships >= 5) {
            ready = true;
        }
    }

    public boolean areYouReadyKids() {
        return ready;
    }

    public boolean spotIsHit(int row, int column) {
        return board[row][column].returnHit();
    }

    public int shipsLeft() {
        int spaces = 0;
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                if (board[i][j].shipExists() && !board[i][j].returnHit()) {
                    spaces ++;
                }
            }
        }
        return spaces;
    }

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }


}

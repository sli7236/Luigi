public class PlayerBoard extends BattleshipBoardTemplate {
    private Space[][] board;
    private int ships = 0;

    public PlayerBoard(int length, int width) {
        board = new Space[length][width];
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = new Space(i, j);
            }
        }
    }

    public void selectSpace(int row, int column) { // selecting a playerboard will place the ships down when the game is in build mode
        board[row][column].toggleSelect();
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
    public boolean placeShips(Space space1, Space space2) {
        int row1 = space1.returnRow(); int row2 = space2.returnRow();
        int column1 = space1.returnColumn(); int column2 = space2.returnColumn();
        if (row1 != row2) {
            if (row1 < row2) {
                for (int i = row1; i <= row2; i ++) {
                    if (board[i][column1].shipExists()) {
                        return false;
                    }
                }
                for (int i = row1; i <= row2; i ++) {
                    board[i][column1].placeShip();
                }
            }
            else {
                for (int i = row2; i <= row1; i ++) {
                    if (board[i][column1].shipExists()) {
                        return false;
                    }
                }
                for (int i = row2; i <= row1; i ++) {
                    board[i][column1].placeShip();
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
                for (int i = column1; i <= column2; i ++) {
                    board[row1][i].placeShip();
                }
            }
            else {
                for (int i = column2; i <= column1; i ++) {
                    if (board[row1][i].shipExists()) {
                        return false;
                    }
                }
                for (int i = column2; i <= column1; i ++) {
                    board[row1][i].placeShip();
                }
            }
        }
        for (Space[] i : board) { // unselects all the spaces after the ship is made
            for (Space j : i) {
                if (j.isSelected()) {
                    j.toggleSelect();
                }
            }
        }
        ships ++;
        return true;
    }

    public boolean hit(int row, int column) {
        board[row][column].hitSpot();
        return (board[row][column].shipExists());
    }

    public int returnNoOfShips() {
        return ships;
    }

    public boolean spotIsHit(int row, int column) {
        return board[row][column].returnHit();
    }

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }


}
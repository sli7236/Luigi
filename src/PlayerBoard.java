public class PlayerBoard extends BattleshipBoardTemplate {
    private Space[][] board;

    public PlayerBoard(int length, int width) {
        board = new Space[length][width];
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = new Space();
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
     * @param row1 row coordinate of first boundary
     * @param column1 column coord of first bound
     * @param row2 row coord of second bound
     * @param column2 column coord of second bound
     * @return if the placement of ships is valid (there are no ships in the way)
     */
    public boolean placeShips(int row1, int column1, int row2, int column2) {
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
        return true;
    }

    public boolean hit(int row, int column) {
        board[row][column].hitSpot();
        return (board[row][column].shipExists());
    }

    public boolean spotIsHit(int row, int column) {
        return board[row][column].returnHit();
    }

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }


}

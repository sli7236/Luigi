import java.util.Random;

public class CPUBoard extends BattleshipBoardTemplate {
    private Space[][] board;

    public CPUBoard(int length, int width) {
        board = new Space[length][width];
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = new Space(i, j);
            }
        }
    }

    public void compShip(){
        for (int shipNum = 5; shipNum > 0; shipNum --) {
            boolean vertical = new Random().nextBoolean();
            int randRow = (int) (Math.random() * 9);
            int randCol = (int) (Math.random() * 9);
            int length;

            if (shipNum == 5) {
                length = 4;
            }
            else if (shipNum == 4) {
                length = 3;
            }
            else if (shipNum == 2 || shipNum == 3) {
                length = 2;
            }
            else {
                length = 1;
            }

            if (vertical) {
                while (randRow + length > 9 || !placeShip(randRow, randRow + length, randCol, randCol)) {
                    randRow = (int) (Math.random() * 9);
                }
            }
            else {
                while (randCol + length > 9 || !placeShip(randRow, randRow, randCol, randCol + length)) {
                    randCol = (int) (Math.random() * 9);
                }
            }
        }
    }

    public boolean placeShip(int row1, int row2, int column1, int column2){
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
        return true;
    }

    public boolean selectSpace(int row, int column) { // selecting a cpu board will shoot it
        return hit(row, column);
    }

    public boolean spaceIsSelected(int row, int column) {
        return board[row][column].isSelected();
    }

    public boolean hit(int row, int column) {
        board[row][column].hitSpot();
        return board[row][column].shipExists();
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
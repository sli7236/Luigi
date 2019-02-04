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

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }


}

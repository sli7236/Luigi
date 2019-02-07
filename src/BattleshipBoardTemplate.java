public abstract class BattleshipBoardTemplate {
    private Space[][] board = new Space[10][10];

    public abstract boolean hit(int row, int column);

    public abstract int shipsLeft();

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }
}

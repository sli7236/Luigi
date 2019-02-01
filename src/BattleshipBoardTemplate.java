public abstract class BattleshipBoardTemplate {
    private Space[][] board = new Space[10][10];

    public abstract void selectSpace(int row, int column);
    public abstract boolean hit(int row, int column);

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }
}

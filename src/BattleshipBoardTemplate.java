public abstract class BattleshipBoardTemplate {
    private Space[][] board = new Space[10][10];

    public abstract void selectSpace();
    public abstract void hit();

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }
}

public abstract class BattleshipBoardTemplate {
    private Space[][] board;

    public abstract void selectSpace();
    public abstract void hit();

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }
}

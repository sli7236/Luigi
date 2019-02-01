public abstract class BattleshipBoardTemplate {
    private Space[][] board = new Space[10][10];
    public BattleshipBoardTemplate() {
        for (Space[] i : board) {
            for (Space j : i) {
                j = new Space();
            }
        }
    }

    public abstract void selectSpace();
    public abstract void hit();

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }
}

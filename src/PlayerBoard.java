public class PlayerBoard extends BattleshipBoardTemplate {
    private Space[][] board = new Space[10][10];
    public PlayerBoard() {
        for (Space[] i : board) {
            for (Space j : i) {
                j = new Space();
            }
        }
    }

}

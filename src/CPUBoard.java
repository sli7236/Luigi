public class CPUBoard extends BattleshipBoardTemplate {
    private Space[][] board;

    public CPUBoard(int length, int width) {
        board = new Space[length][width];
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[i].length; j ++) {
                board[i][j] = new Space();
            }
        }
    }

    public void compShip(){
        //ship space 5, space 4, space 3, space 2, space 2
        int shipNum = 1; //shipNum 1 is the largest ship with 5 spaces
        for (int i = shipNum; i < 6; i++) {
            int randRow = (int) (Math.random() * 10);
            int randCol = (int) (Math.random() * 10);
            int direct = (int) (Math.random() * 2); //determines the direction of the ship that is being placed-- 1 is horizontal and 2 is vertical
            if (shipNum == 1){
                if(direct == 1){

                }
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
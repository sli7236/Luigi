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
        //ship space 5, space 4, space 3, space 2, space 2
        int shipNum = 1; //shipNum 1 is the largest ship with 5 spaces
        for (int i = shipNum; i < 6; i++) {
            int randRow = (int) (Math.random() * 10);
            int randCol = (int) (Math.random() * 10);
            int direct = (int) (Math.random() * 2); //determines the direction of the ship that is being placed-- 1 is horizontal and 2 is vertical
            if (i == 1){
                if(direct == 1){ //ship is horizontal
                    if(randCol + 4 > 10){
                        randCol= (int) (Math.random() * 10);
                    }
                    else{
                        int randCol2 = randCol+4;
                        placeShip(randRow, randRow,randCol, randCol2);
                    }
                }
                if(direct == 2){ //ship is vertical
                    if(randRow + 4 > 10){
                        randRow = (int) (Math.random() * 10);
                    }
                    else{
                        int randRow2 = randCol+4;
                        placeShip(randRow, randRow2,randCol, randCol);
                    }
                }
            }
            if (i == 2){//length 4
                if(direct == 1){ //ship is horizontal
                    if(randCol + 3 > 10){
                        randCol= (int) (Math.random() * 10);
                    }
                    else{
                        int randCol2 = randCol+3;
                        placeShip(randRow, randRow,randCol, randCol2);
                    }
                }
                if(direct == 2){ //ship is vertical
                    if(randRow + 3 > 10){
                        randRow = (int) (Math.random() * 10);
                    }
                    else{
                        int randRow2 = randCol+3;
                        placeShip(randRow, randRow2,randCol, randCol);
                    }
                }
            }
            if (i == 3){//length 3
                if(direct == 1){ //ship is horizontal
                    if(randCol + 2 > 10){
                        randCol= (int) (Math.random() * 10);
                    }
                    else{
                        int randCol2 = randCol+2;
                        placeShip(randRow, randRow,randCol, randCol2);
                    }
                }
                if(direct == 2){ //ship is vertical
                    if(randRow + 2 > 10){
                        randRow = (int) (Math.random() * 10);
                    }
                    else{
                        int randRow2 = randCol+2;
                        placeShip(randRow, randRow2,randCol, randCol);
                    }
                }
            }
            if (i == 4||i == 5){//length 2
                if(direct == 1){ //ship is horizontal
                    if(randCol + 1 > 10){
                        randCol= (int) (Math.random() * 10);
                    }
                    else{
                        int randCol2 = randCol+1;
                        placeShip(randRow, randRow,randCol, randCol2);
                    }
                }
                if(direct == 2){ //ship is vertical
                    if(randRow + 1 > 10){
                        randRow = (int) (Math.random() * 10);
                    }
                    else{
                        int randRow2 = randCol+1;
                        placeShip(randRow, randRow2,randCol, randCol);
                    }
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

    public Space returnSpace(int row, int column) {
        return board[row][column];
    }


}
import java.util.*;

public class GameBattleShip {
    private PlayerBoard playerBoard = new PlayerBoard(10, 10);
    private CPUBoard cpuBoard = new CPUBoard(10, 10);
    private int playerSelectedSpaces = 0;
    private Space selectedSpace;
    private Space secondSpace;

    /**
     * @param row row of selected space on player board
     * @param column column of space on player board
     */
    public void placeDownShip(int row, int column) {
        if (playerSelectedSpaces == 0) {
            playerBoard.selectSpace(row, column, true);
            selectedSpace = playerBoard.returnSpace(row, column);
            playerSelectedSpaces ++;
        }
        else if (playerSelectedSpaces == 1) {
            playerBoard.selectSpace(row, column, true);
            secondSpace = playerBoard.returnSpace(row, column);
            if (selectedSpace.equals(secondSpace)) {
                System.err.println("first space is the same as the second");
                selectedSpace.setSelect(false);
                playerSelectedSpaces = 0;
            }
            else if (!playerBoard.checkShipValidity(selectedSpace, secondSpace)) {
                System.err.println("invalid placement: ");
                selectedSpace.setSelect(false);
                secondSpace.setSelect(false);
                playerSelectedSpaces = 0;
            }
            else {
                // Precondition: One of the rows/columns match, and only one
                if (playerBoard.returnNoOfShips() == 0) {
                    if (selectedSpace.compareColumn(secondSpace) == 0) {
                        if (selectedSpace.compareRow(secondSpace) != 5) {
                            System.err.println("must put down ship length of 5");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnRow(), secondSpace.returnRow()); i < Math.max(selectedSpace.returnRow(), secondSpace.returnRow()); i ++) {
                                playerBoard.placeShip(i, selectedSpace.returnColumn());
                                System.out.println("placed ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else if (selectedSpace.compareRow(secondSpace) == 0) {
                        if (selectedSpace.compareColumn(secondSpace) != 5) {
                            System.err.println("must place down ship length of 5");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnColumn(), secondSpace.returnColumn()); i < Math.max(selectedSpace.returnColumn(), secondSpace.returnColumn()); i ++) {
                                playerBoard.placeShip(selectedSpace.returnRow(), i);
                                System.out.println("palced ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else {
                        System.err.println("something happened");
                    }
                }
                else if (playerBoard.returnNoOfShips() == 1) {
                    if (selectedSpace.compareColumn(secondSpace) == 0) {
                        if (selectedSpace.compareRow(secondSpace) != 4) {
                            System.err.println("must put down ship length of 4");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnRow(), secondSpace.returnRow()); i < Math.max(selectedSpace.returnRow(), secondSpace.returnRow()); i ++) {
                                playerBoard.placeShip(i, selectedSpace.returnColumn());
                                System.out.println("placed ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else if (selectedSpace.compareRow(secondSpace) == 0) {
                        if (selectedSpace.compareColumn(secondSpace) != 4) {
                            System.err.println("must place down ship length of 4");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnColumn(), secondSpace.returnColumn()); i < Math.max(selectedSpace.returnColumn(), secondSpace.returnColumn()); i ++) {
                                playerBoard.placeShip(selectedSpace.returnRow(), i);
                                System.out.println("palced ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else {
                        System.err.println("something happened");
                    }
                }
                else if (playerBoard.returnNoOfShips() == 2 || playerBoard.returnNoOfShips() == 3) {
                    if (selectedSpace.compareColumn(secondSpace) == 0) {
                        if (selectedSpace.compareRow(secondSpace) != 3) {
                            System.err.println("must put down ship length of 3");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnRow(), secondSpace.returnRow()); i < Math.max(selectedSpace.returnRow(), secondSpace.returnRow()); i ++) {
                                playerBoard.placeShip(i, selectedSpace.returnColumn());
                                System.out.println("placed ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else if (selectedSpace.compareRow(secondSpace) == 0) {
                        if (selectedSpace.compareColumn(secondSpace) != 3) {
                            System.err.println("must place down ship length of 3");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnColumn(), secondSpace.returnColumn()); i < Math.max(selectedSpace.returnColumn(), secondSpace.returnColumn()); i ++) {
                                playerBoard.placeShip(selectedSpace.returnRow(), i);
                                System.out.println("palced ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else {
                        System.err.println("something happened");
                    }
                }
                else if (playerBoard.returnNoOfShips() == 4) {
                    if (selectedSpace.compareColumn(secondSpace) == 0) {
                        if (selectedSpace.compareRow(secondSpace) != 2) {
                            System.err.println("must put down ship length of 2");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnRow(), secondSpace.returnRow()); i < Math.max(selectedSpace.returnRow(), secondSpace.returnRow()); i ++) {
                                playerBoard.placeShip(i, selectedSpace.returnColumn());
                                System.out.println("placed ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else if (selectedSpace.compareRow(secondSpace) == 0) {
                        if (selectedSpace.compareColumn(secondSpace) != 2) {
                            System.err.println("must place down ship length of 2");
                        }
                        else {
                            for (int i = Math.min(selectedSpace.returnColumn(), secondSpace.returnColumn()); i < Math.max(selectedSpace.returnColumn(), secondSpace.returnColumn()); i ++) {
                                playerBoard.placeShip(selectedSpace.returnRow(), i);
                                System.out.println("palced ship on (" + selectedSpace.returnRow() + ", " + i + ").");
                            }
                            playerBoard.addShip();
                            selectedSpace.setSelect(false);
                            secondSpace.setSelect(false);
                        }
                    }
                    else {
                        System.err.println("something happened");
                    }
                }
                else {
                    System.err.println("too many ships");
                }
            }
        }
    }

    public boolean attackEnemyBoard(int row, int column) {
        if (cpuBoard.hit(row, column)) {
            System.out.println("It's a hit!");
            return true;
        }
        return false;
    }
}

public class Space {
    private boolean shipOnSpot = false;
    private boolean hit = false;
    private boolean selected = false;
    private int row;
    private int column;

    public Space(int row, int column) {
        this.row = row; this.column = column;
    }

    public void placeShip() {
        shipOnSpot = true;
    }

    public boolean shipExists() {
        return shipOnSpot;
    }

    public void hitSpot() {
        hit = true;
    }

    public boolean returnHit() {
        return hit;
    }

    public void toggleSelect() {
        selected = !selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public int returnRow() {
        return row;
    }

    public boolean equals(Space other) {
        if (row == other.returnRow() && column == other.returnColumn()) {
            return true;
        }
        return false;
    }

    public int returnColumn() {
        return column;
    }

    public int compareRow(Space other) {
        return Math.abs(row - other.returnRow());
    }

    public int compareColumn(Space other) {
        return Math.abs(column - other.returnColumn());
    }
}

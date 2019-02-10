import javafx.beans.property.SimpleStringProperty;

public class playInfo {
    /**
     * @var ehit is the number of times the enemy ship is hit
     * @var eSunk is the number of enemy ships sunk
     * @var pHit is the number of times the player shit is hit
     * @var pSunk is the number of player ships sunk
     */

    private SimpleStringProperty playerName;
    private int score, eHit, eSunk,pHit, pSunk;

    public playInfo(String playerName, int score, int eHit, int eSunk, int pHit, int pSunk){
        this.playerName = new SimpleStringProperty(playerName);
        this.score = score;
        this.eHit = eHit;
        this.eSunk = eSunk;
        this.pHit = pHit;
        this.pSunk = pSunk;
    }

    public void setPlayerName(String playerName) {
        this.playerName.set(playerName);
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void seteHit(int eHit) {
        this.eHit = eHit;
    }

    public void seteSunk(int eSunk) {
        this.eSunk = eSunk;
    }

    public void setpHit(int pHit) {
        this.pHit = pHit;
    }

    public String getPlayerName() {
        return playerName.get();
    }

    public int getScore() {
        return score;
    }

    public int geteHit() {
        return eHit;
    }

    public int geteSunk() {
        return eSunk;
    }

    public int getpHit() {
        return pHit;
    }

    public int getpSunk() {
        return pSunk;
    }

    public void setpSunk(int pSunk) {
        this.pSunk = pSunk;
    }
}

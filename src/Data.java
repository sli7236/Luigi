class Data {
    private String playerName;
    private int score;
    private int enemyShipHits;
    private int enemyShipsSunk;
    private int playerShipHits;
    private int playerShipsSunk;

    public Data(String playerName, int score, int enemyShipHits, int enemyShipsSunk, int playerShipHits, int playerShipsSunk) {
        this.playerName = playerName;
        this.score = score;
        this.enemyShipHits = enemyShipHits;
        this.enemyShipsSunk = enemyShipsSunk;
        this.playerShipHits = playerShipHits;
        this.playerShipsSunk = playerShipsSunk;
    }


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getEnemyShipHits() {
        return enemyShipHits;
    }

    public void setEnemyShipHits(int enemyShipHits) {
        this.enemyShipHits = enemyShipHits;
    }

    public int getEnemyShipsSunk() {
        return enemyShipsSunk;
    }

    public void setEnemyShipsSunk(int enemyShipsSunk) {
        this.enemyShipsSunk = enemyShipsSunk;
    }

    public int getPlayerShipHits() {
        return playerShipHits;
    }

    public void setPlayerShipHits(int playerShipHits) {
        this.playerShipHits = playerShipHits;
    }

     public int getPlayerShipsSunk() {
        return playerShipsSunk;
    }

    public void setPlayerShipsSunk(int playerShipsSunk) {
        this.playerShipsSunk = playerShipsSunk;
    }


    @Override
    public String toString() {
        return "Player: " + playerName + "Score: " + score + "# of Times Enemy Ships Were Hit: " + enemyShipHits + "Enemy Ships Sunk: " + enemyShipsSunk + "# of Times Player Ships Were Hit: " + playerShipHits + "Player Ships Sunk: " + playerShipsSunk;
    }

}
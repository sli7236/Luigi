public class Space {
    private boolean shipOnSpot = false;
    private boolean hit = false;

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
}

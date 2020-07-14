package Race.Super;

public class Race {

    private int lifePoints;
    private int magicPoints;


    public Race(int lifePoints, int magicPoints) {
        this.lifePoints = lifePoints;
        this.magicPoints = magicPoints;
    }


    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    @Override
    public String toString() {
        return "Race{" +
                "lifePoints=" + lifePoints +
                ", magicPoints=" + magicPoints +
                '}';
    }
}

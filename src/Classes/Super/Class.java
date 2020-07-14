package Classes.Super;

public class Class{

    private int strength;
    private int intelligence;
    private int dexterity;
    private int faith;
    private int luck;
    private int lifePoints;
    private int magicPoints;

    public Class(int strength, int intelligence, int dexterity, int faith, int luck, int lifePoints, int magicPoints) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.faith = faith;
        this.luck = luck;
        this.lifePoints = lifePoints;
        this.magicPoints = magicPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getFaith() {
        return faith;
    }

    public void setFaith(int faith) {
        this.faith = faith;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
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
        return "Class{" +
                "strength=" + strength +
                ", intelligence=" + intelligence +
                ", dexterity=" + dexterity +
                ", faith=" + faith +
                ", luck=" + luck +
                ", lifePoints=" + lifePoints +
                ", magicPoints=" + magicPoints +
                '}';
    }
}

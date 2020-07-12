package ENUM;

public enum CLASS {

    MAGE(4, 7, 3, 3, 2, -2, +5),
    WARRIOR(7, 2, 4, 3, 2, +4 ,-3),
    BARD(5, 6, 5, 4, 3, -1 ,+2),
    ROGUE(5, 4, 7, 5, 0, +2,-1),
    KNIGHT(6, 4, 4, 3, 7, +3, +2);

    private int strength;
    private int intelligence;
    private int dexterity;
    private int luck;
    private int faith;
    private int lp;
    private int mp;

    CLASS(int strength, int intelligence, int dexterity, int luck, int faith, int lp, int mp) {
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.luck = luck;
        this.faith = faith;
        this.lp = lp;
        this.mp = mp;
    }
}

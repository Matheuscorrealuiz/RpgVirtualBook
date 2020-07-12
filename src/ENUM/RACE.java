package ENUM;

public enum RACE {

    HUMAN(1,25, 25),
    ELF(2,22, 28),
    HALF_ELF(3,23, 26),
    HIGH_ELF(4,23, 30),
    DWARF(5, 28, 22);

    private int index;
    private int LP;
    private int MP;

    RACE(int index, int LP, int MP) {
        this.index = index;
        this.LP = LP;
        this.MP = MP;
    }

    public void getRace(int index) {
        for (RACE race:
             values()) {
            if(index == race.index){
                System.out.println(race);
            }
        }
    }
}

package Character;

import Classes.Super.Class;
import Classes.Warrior;
import Race.Dwarf;
import Race.Super.Race;

public class Hero {

    private int age;
    private String name;
    private Race race;
    private Class profession;
    private int LP;
    private int MP;

    public Hero(int age, String name, Race race, Class profession, int LP, int MP) {
        this.age = age;
        this.name = name;
        this.race = race;
        this.profession = profession;
        this.LP = LP;
        this.MP = MP;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLP(int LP) {
        this.LP = LP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Class getProfession() {
        return profession;
    }

    public int getLP() {
        return LP;
    }

    public int getMP() {
        return MP;
    }

    public Hero returnHero(){
        return new Hero(
                22,
                "Jão",
                new Dwarf(), new Warrior(),
                getRace().getLifePoints() + getProfession().getLifePoints(),
                getRace().getMagicPoints() + getProfession().getMagicPoints()
        );
    }

    @Override
    public String toString() {
        return "Hero{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", race=" + race.toString() +
                ", profession=" + profession.toString() +
                ", LP=" + LP +
                ", MP=" + MP +
                '}';
    }
}

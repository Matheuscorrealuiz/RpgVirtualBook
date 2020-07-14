import Classes.Mage;
import Classes.Warrior;
import Race.Dwarf;
import Character.Hero;
import Race.Elf;

public class Test {

    public static void main(String[] args) {

        Hero hero = new Hero(22,"la", new Elf(), new Mage(), 23 , 44);

        System.out.println(hero.toString());
    }
}

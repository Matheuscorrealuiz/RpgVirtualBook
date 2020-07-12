package character;

import ENUM.CLASS;
import ENUM.RACE;

public class Hero {

	private int age;
	private String name;
	private RACE race;
	private CLASS profession;
	private int strength; //class
	private int intelligence; //class
	private int dexterity; //class
	private int luck; //class
	private int faith; //class
	private int LP; //race +- class
	private int MP; //class +- race

	public Hero(int age, String name, RACE race, CLASS profession) {
		this.age = age;
		this.name = name;
		this.race = race;
		this.profession = profession;
//		this.LP = setLP();
//		this.MP = setMP();
	}

//	public int setLP(RACE race, CLASS profession){
//
//	}
}

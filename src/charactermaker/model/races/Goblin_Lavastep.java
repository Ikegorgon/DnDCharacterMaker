package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Goblin_Lavastep extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Goblin_Lavastep() {
		super("Lavastep Goblin");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new LavastepGrit());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Goblin");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The Lavastep tribe is the most industrious of the\n" + 
				"goblin tribes, and possesses much hard-won knowledge\n" + 
				"of the geothermal activity in Akoum. More so\n" + 
				"than members of the other tribes, the Lavastep goblins\n" + 
				"build surprisingly effective equipment out of the crystal\n" + 
				"shards and veins of strange metals that occasionally\n" + 
				"boil up to the surface. The most warlike of their kind,\n" + 
				"Lavastep goblins frequently harass the kor, elves, and\n" + 
				"humans of Akoum");
		this.setBook("PSZ 16-17");
	}
	private int Age() {
		int age = 0;
		int min = 12;
		int max = 50;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 32;
		int add1 = rand.nextInt(4 + 1) + 1;
		int add2 = rand.nextInt(4 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 35;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

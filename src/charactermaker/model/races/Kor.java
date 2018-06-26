package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Kor extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Kor() {
		super("Kor");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new KorClimbing());
		feats.add(new Lucky());
		feats.add(new Brave());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Kor Sign Language");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Deeply reverent of the land and its sacred sites, the nomadic kor live a spare existence defined by their constant travels. Masters of ropes and hooks, they scale sheer cliffs and cross yawning chasms with such skill and agility that they sometimes seem almost to take flight.");
		this.setBook("PSZ 11");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 100;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 54;
		int add1 = rand.nextInt(10 + 1) + 1;
		int add2 = rand.nextInt(10 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 90;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

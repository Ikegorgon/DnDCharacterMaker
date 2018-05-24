package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Aasimar_Fallen extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Aasimar_Fallen() {
		super("Fallen Aasimar");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		ability.add(new Charisma());
		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new CelestialResistance());
		feats.add(new HealingHands());
		feats.add(new LightBearer());
		feats.add(new NecroticShroud());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Celestial");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("An aasimar who was touched by dark powers as a youth or who turns to evil in early adulthood can become one of the fallen-a group of aasimar whose inner light has been replaced by shadow.");
		this.setBook("Volo's 105");
	}
	private int Age() {
		int age = 0;
		int min = 20;
		int max = 160;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 61;
		int add1 = rand.nextInt(8 + 1) + 1;
		int add2 = rand.nextInt(8 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 100;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

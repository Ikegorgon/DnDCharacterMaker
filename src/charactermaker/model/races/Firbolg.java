package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Firbolg extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Firbolg() {
		super("Firbolg");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Wisdom());
		ability.add(new Wisdom());
		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
//		feats.add(new );
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		proficiency.add("Giant");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Firbolgs are a reclusive race of giant-kin who preferred to avoid contact with other sentient races. They were both the most intelligent and the most powerful of the giant-kin.");
	}
	private int Age() {
		int age = 0;
		int min = 30;
		int max = 500;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 70;
		int add1 = rand.nextInt(8 + 1) + 1;
		int add2 = rand.nextInt(8 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + "'" + inches + "\"";
		return height;
	}
	private String Weight() {
		String weight = "";
		Random rand = new Random();
		int base = 190;
		int add1 = rand.nextInt(6 + 1) + 1;
		int add2 = rand.nextInt(6 + 1) + 1;
		mod = mod * (add1 + add2);
		int total = base + mod;
		weight = total + "lbs";
		return weight;
	}
}

package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Naga extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Naga() {
		super("Naga");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new SpeedBurst());
		feats.add(new NaturalWeapons());
		feats.add(new PoisonImmunity());
		feats.add(new PoisonAffinity());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Naga");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Nagas are a race of semidivine serpent creatures in Hindu and Buddhist mythology. Female Nagas are called Nagis or Naginis. Usually depicted as human above the waist and snake below the waist, Nagas can also change shape to appear fully human or snake. Nagas and Nagis are known for their strength, supernatural wisdom, and good looks. When Nagis take human form, they can marry mortal men, and some Indian dynasties claim descent from them.");
		this.setBook("PSA");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 150;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 50;
		int add1 = rand.nextInt(6 + 1) + 1;
		int add2 = rand.nextInt(6 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 110;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

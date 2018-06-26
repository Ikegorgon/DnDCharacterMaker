package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Shifter_Cliffwalk extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Shifter_Cliffwalk() {
		super("Cliffwalk Shifter");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new KeenSmell());
		feats.add(new ShiftingNature());
		feats.add(new CliffwalkShifting());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Sylvan");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Shifters, also known as weretouched, look like humans for the most part. Most have features similar to the beastkin they're associated with, though they're very minor. However, once they have shifted into their half-lycanthrope form, they gain animal-like features that heavily alter their appearance. Shifters are typically physically fit and lithe, and tend to move around in a more animal-like fashion, crouching, springing, and leaping. They typically are wild and care little for personal appearance, allowing their hair and nails to grow out.");
		this.setBook("Ebr 2-3");
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
		int base = 110;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

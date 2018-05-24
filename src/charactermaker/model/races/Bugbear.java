package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Bugbear extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Bugbear() {
		super("Bugbear");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Dexterity());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new LongLimbed());
		feats.add(new PowerfulBuild());
		feats.add(new Sneaky());
		feats.add(new SurpriseAttack());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Goblin");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Bugbears resemble hairy, feral goblins standing seven feet tall. They take their name from their noses and claws, which are similar to those of bears. Their claws are not long and sharp enough to be used as weapons, so bugbears often armor and arm themselves with a variety of purloined gear. Most often, this gear is second-rate and in poor repair.");
		this.setBook("Volo's 119w");
	}
	private int Age() {
		int age = 0;
		int min = 16;
		int max = 80;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 72;
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
		int base = 230;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

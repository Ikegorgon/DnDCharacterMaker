package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Changeling extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Changeling() {
		super("Changeling");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Duplicity());
		feats.add(new Shapechanger());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("(Bonus Language)");
		proficiency.add("(Bonus Language)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Changelings are subtle shapeshifters capable of disguising their appearance. Their ability to adopt other creatures’ guises makes them consummate spies and criminals.");
		this.setBook("Ebr 1");
	}
	private int Age() {
		int age = 0;
		int min = 15;
		int max = 95;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 56;
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

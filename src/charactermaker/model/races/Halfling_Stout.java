package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Halfling_Stout extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Halfling_Stout() {
		super("Stout Halfling");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Lucky());
		feats.add(new Brave());
		feats.add(new Nimble());
		feats.add(new StoutResilience());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Halfling");
		proficiency.add("Poison");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("As a stout halfling, you're hardier than average and have some resistance to poison.");
		this.setBook("PHB 28");
	}
	private int Age() {
		int age = 0;
		int min = 20;
		int max = 150;
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
		int base = 30;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

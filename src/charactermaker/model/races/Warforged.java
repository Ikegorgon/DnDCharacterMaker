package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Warforged extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Warforged() {
		super("Warforged");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new CompositePlating());
		feats.add(new LivingConstruct());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("(Bonus Language)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The warforged were made as the ideal soldiers to serve in the devastating Last War. Although they are constructs, they have much in common with living creatures, including emotions and social bonds, and perhaps even souls.");
		this.setBook("Ebr 3");
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
		int base = 56;
		int add1 = rand.nextInt(12 + 1) + 1;
		int add2 = rand.nextInt(12 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 120;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

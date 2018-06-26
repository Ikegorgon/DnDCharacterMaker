package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Tortle extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Tortle() {
		super("Tortle");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Claws());
		feats.add(new HoldBreathe());
		feats.add(new TortleNaturalArmor());
		feats.add(new ShellDefense());
		feats.add(new SurvivalInstinct());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Aquan");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("What many tortles consider a simple life, others might call a life of adventure. Tortles are born near sandy coastlines, but as soon as they're able to walk on two legs, they become nomad survivalists eager to explore the wilderness, experience its many wonders, put their skills to the test, and make new acquaintances.");
		this.setBook("(Tortle)");
	}
	private int Age() {
		int age = 0;
		int min = 15;
		int max = 50;
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
		int base = 410;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

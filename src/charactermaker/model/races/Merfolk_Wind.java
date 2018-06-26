package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Merfolk_Wind extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Merfolk_Wind() {
		super("Emeria Merfolk (Wind)");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Amphibious());
		feats.add(new WindCreedManipulation());
		feats.add(new Cantrip());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Merfolk");
		proficiency.add("(Bonus Language)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Merfolk who followed Emeria’s creed seek wisdom\n" + 
				"and truth in the Wind Realm, exploring the mystical\n" + 
				"forces—rather than natural causes—behind historical\n" + 
				"events. They are evasive and intentionally enigmatic\n" + 
				"in their interactions with others, and are often described\n" + 
				"as manipulative and deceptive.");
		this.setBook("PSZ 13");
	}
	private int Age() {
		int age = 0;
		int min = 20;
		int max = 110;
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
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

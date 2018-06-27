package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Vedalken extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Vedalken() {
		super("Vedalken");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Intelligence());
		ability.add(new Wisdom());
		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new VedalkenCunning());
		feats.add(new AetherLore());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Vedalken");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Most vedalken care far more about invention\n" + 
				"and inquiry than about politics. They\n" + 
				"would rather unlock the hidden potential\n" + 
				"of aether-based devices than dwell on the\n" + 
				"question of how aether should be distributed\n" + 
				"to the Consulate’s citizens. For that\n" + 
				"reason, though vedalken are found both\n" + 
				"among the officials of the Consulate and\n" + 
				"among the renegades, their dedication to\n" + 
				"either cause often lacks the partisan fervor\n" + 
				"found in the members of other races");
		this.setBook("PSK");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 500;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 58;
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

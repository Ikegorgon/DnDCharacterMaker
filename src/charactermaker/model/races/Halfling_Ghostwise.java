package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Halfling_Ghostwise extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Halfling_Ghostwise() {
		super("Ghostwise Halfling");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Lucky());
		feats.add(new Brave());
		feats.add(new Nimble());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Halfling");
		proficiency.add("Silent Speech");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The ghostwise are easily the most uncommon of the three sub-races of halfling living in Faerûn. They are elusive and do not welcome strangers to their lands. Instead, they prefer to pursue a nomadic way of life within their adopted homeland, the Chon-dalwood, associating mainly with those of their own clan. Those who seek out the ghostwise most often fail to achieve their goal; the fortunate among them live to regret their intrusion into hin territory.");
		this.setBook("SCAG 110");
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

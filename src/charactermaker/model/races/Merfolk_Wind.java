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
//		super("");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
//		this.setSpeed();
		ability = new ArrayList<Skills>();
//		ability.add();
		feats = new ArrayList<RacialFeats>();
//		feats.add();
		proficiency = new ArrayList<String>();
//		proficiency.add();
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
//		this.setDescription("");
	}
	private int Age() {
		int age = 0;
//		int min = ;
//		int max = ;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
//		int base = ;
//		int add1 = rand.nextInt( + 1) + 1;
//		int add2 = rand.nextInt( + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + "'" + inches + "\"";
		return height;
	}
	private String Weight() {
		String weight = "";
		Random rand = new Random();
//		int base = ;
//		int add1 = rand.nextInt( + 1) + 1;
//		int add2 = rand.nextInt( + 1) + 1;
		mod = mod * (add1 + add2);
		int total = base + mod;
		weight = total + "lbs";
		return weight;
	}
}

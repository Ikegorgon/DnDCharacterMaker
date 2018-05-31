package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class AAA extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public AAA() {
//		super("");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
//		this.setSpeed();
		ability = new ArrayList<Skills>();
//		ability.add(new ());
		feats = new ArrayList<RacialFeats>();
//		feats.add(new ());
		proficiency = new ArrayList<String>();
//		proficiency.add("");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
//		this.setDescription("");
//		this.setBook("");
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
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
//		int base = ;
//		int total = base + (mod * );
		weight = total + " Pounds";
		return weight;
	}
}

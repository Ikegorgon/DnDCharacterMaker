package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Khenra extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Khenra() {
		super("Kenra");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(35);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		feats = new ArrayList<RacialFeats>();
		feats.add(new KhenraWeaponTraining());
		feats.add(new KhenraTwins());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Khenra");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Nearly every khenra is born a fraternal or identical twin, and a pair of khenra twins forms an extremely close emotional bond unknown to most other residents of Amonkhet. The death of one twin in training or the trials causes a tremendous shock to the survivor, who typically grows more aggressive and foolhardy in battle. The rare khenra who are born without twins are believed to have killed their siblings in the womb, and are thus viewed as natural-born initiates, sure to achieve a glorified death in the Trial of Zeal.");
		this.setBook("PSA");
	}
	private int Age() {
		int age = 0;
		int min = 14;
		int max = 60;
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
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Kobold extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Kobold() {
		super("Kobold");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
//		ability.add(new Strength());
//		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new GrovelCowerAndBe());
		feats.add(new PackTactics());
		feats.add(new SunlightSensitivity());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Draconic");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
//		this.setDescription("");
		this.setBook("Volo's 119");
	}
	private int Age() {
		int age = 0;
		int min = 6;
		int max = 115;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 30;
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
		int base = 25;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

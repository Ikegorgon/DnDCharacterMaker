package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Kenku extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Kenku() {
		super("Kenku");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new ExpertForgery());
		feats.add(new KenkuTraining());
		feats.add(new Mimicry());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Auran");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Although they evolved from avians, kenkus had no wings or capacity for flight. Instead, they had arms in place of wings and bird-like talons for hands and feet. They retained bird-like features, however, with black and beady eyes and a long dark-hued beak. Head and torso were covered with soft feathers, a dark russet-brown color, while their scrawny limbs were bare and scaled like a bird's.");
		this.setBook("Volo's 109");
	}
	private int Age() {
		int age = 0;
		int min = 12;
		int max = 60;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 54;
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
		int base = 86;
		int total = base + (mod * 2);
		weight = total + " Pounds";
		return weight;
	}
}

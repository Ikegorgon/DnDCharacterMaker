package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class HalfElf extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public HalfElf() {
		super("Half-Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FeyAncestry());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		proficiency.add("(+1 to an Ability)");
		proficiency.add("(+1 to an Ability)");
		proficiency.add("(Bonus Skill)");
		proficiency.add("(Bonus Skill)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Humans and elves sometimes wed, the elf attracted to the human's energy and the human to the elf's grace. These marriages end quickly as elves count years because a human's life is so brief, but they leave an enduring legacy - half-elf children.");
		this.setBook("PHB 38");
	}
	private int Age() {
		int age = 0;
		int min = 20;
		int max = 180;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 70;
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
		int base = 100;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Elf_Tajuru extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Elf_Tajuru() {
		super("Tajuru Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		ability.add(new Wisdom());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FeyAncestry());
		feats.add(new KeenSenses());
		feats.add(new SkillVersatility());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		proficiency.add("(Bonus Skill/Tool)");
		proficiency.add("(Bonus Skill/Tool)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The Tajuru nation is the largest of the three main elven\n" + 
				"nations, concentrated in Murasa and spread across other parts of Zendikar as hundreds of far-flung clans.\n" + 
				"Tajuru elves are the most open to people of other races,\n" + 
				"seeing their skills and perspectives as valuable new\n" + 
				"tools for survival. The Tajuru are also more open to\n" + 
				"new lifestyles, be it living in a mountaintop citadel or\n" + 
				"roaming grassy plains.");
		this.setBook("PSZ 18-19");
	}
	private int Age() {
		int age = 0;
		int min = 100;
		int max = 750;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 64;
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
		int total = base + (mod * 3);
		weight = total + " Pounds";
		return weight;
	}
}

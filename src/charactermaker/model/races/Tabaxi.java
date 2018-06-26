package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Tabaxi extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Tabaxi() {
		super("Tabaxi");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FelineAgility());
		feats.add(new CatsClaw());
		feats.add(new CatsTalent());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("(Bonus Language)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Hailing from a strange and distant land, wandering tabaxi are catlike humanoids driven by curiosity to collect interesting artifacts, gather tales and stories, and lay eyes on all the world's wonders. Ultimate travelers, the inquisitive tabaxi rarely stay in one place for long. Their innate nature pushes them to leave no secrets uncovered, no treasures or legends lost.");
		this.setBook("Volo's 113");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 100;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 60;
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
		int base = 95;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

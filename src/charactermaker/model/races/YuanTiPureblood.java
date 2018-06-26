package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class YuanTiPureblood extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public YuanTiPureblood() {
		super("Yuan-Ti Pureblood");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Intelligence());
		ability.add(new Charisma());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new InnateSpellcasting());
		feats.add(new MagicResistance());
		feats.add(new PoisonImmunity());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Abyssal");
		proficiency.add("Draconic");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The serpent creatures known as yuan-ti are all that remains of an ancient, decadent human empire. Ages ago their dark gods taught them profane, cannibalistic rituals to mix their flesh with that of snakes, producing a caste-based society of hybrids in which the most snakelike are the leaders and the most humanlike are spies and agents in foreign lands.");
		this.setBook("Volo's 120");
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

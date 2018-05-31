package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Goblin extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Goblin() {
		super("Goblin");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FuryOfTheSmall());
		feats.add(new NimbleEscape());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Goblin");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Goblins occupy an uneasy place in a dangerous world, and they react by lashing out at any creatures they believe they can bully. Cunning in battle and cruel in victory, goblins are fawning and servile in defeat, just as in their own society lower castes must scrape before those of greater status and as goblin tribes bow before other goblinoids.");
		this.setBook("Volo's 119");
	}
	private int Age() {
		int age = 0;
		int min = 8;
		int max = 60;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 35;
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
		int base = 40;
		int total = base + (mod * 2);
		weight = total + " Pounds";
		return weight;
	}
}

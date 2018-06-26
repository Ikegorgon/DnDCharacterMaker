package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Orc extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Orc() {
		super("Orc");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Constitution());
//		ability.add(new Intelligence());
//		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new Aggressive());
		feats.add(new Menacing());
		feats.add(new PowerfulBuild());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Ore");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Orcs were a race of humanoids that have been a threat to the civilized cultures of Toril, particularly Faerûn for as long as any can remember. This changed somewhat in the years preceding and immediately after the Spellplague, when a horde of mountain orcs under the command of King Obould Many-Arrows unified into a single kingdom, one that is remarkably civilized.");
		this.setBook("Volo's 120");
	}
	private int Age() {
		int age = 0;
		int min = 12;
		int max = 50;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 70;
		int add1 = rand.nextInt(12 + 1) + 1;
		int add2 = rand.nextInt(12 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 145;
		int total = base + (mod * 7);
		weight = total + " Pounds";
		return weight;
	}
}

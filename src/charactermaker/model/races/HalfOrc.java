package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class HalfOrc extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public HalfOrc() {
		super("Half-Orc");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Constitution());
		ability.add(new Intimidation());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new Menacing());
		feats.add(new RelentlessEndurance());
		feats.add(new SavageAttacks());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Ore");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Whether united under the leadership of a mighty warlock OI' having fought to a standstill after years of conflict, ore and human tribes sometimes form alliances, joining forces into a larger horde lo the terror of civilized lands nearby. When these alliances are sealed by marriages, half-ores are born. Some half-ores rise to become proud chiefs of ore tribes, their human blood giving them an edge over their full-blooded ore rivals. Some venture into the world lo prove their worth among humans and other more civilized races. Many of these become adventurers, achieving greatness for their mighty deeds and notoriety for their barbaric customs and savage fury.");
	}
	private int Age() {
		int age = 0;
		int min = 14;
		int max = 75;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 58;
		int add1 = rand.nextInt(10 + 1) + 1;
		int add2 = rand.nextInt(10 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + "'" + inches + "\"";
		return height;
	}
	private String Weight() {
		String weight = "";
		Random rand = new Random();
		int base = 140;
		int add1 = rand.nextInt(6 + 1) + 1;
		int add2 = rand.nextInt(6 + 1) + 1;
		mod = mod * (add1 + add2);
		int total = base + mod;
		weight = total + "lbs";
		return weight;
	}
}

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
		this.setDescription("Half-orcs' grayish pigmentation, sloping foreheads, jutting jaws, prominent teeth, and lowering builds make their orcish heritage plain for all to see. Half-ores stand between 6 and 7 feel tall and usually weigh between 180 and 250 pounds.");
		this.setBook("PHB 40");
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
		int base = 55;
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
		int base = 135;
		int total = base + (mod * 7);
		weight = total + " Pounds";
		return weight;
	}
}

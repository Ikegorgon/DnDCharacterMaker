package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Dragonborn extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Dragonborn() {
		super("Dragonborn");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new DraconicAncestry());
		feats.add(new BreathWeapon());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Draconic");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods OI' the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life.");
	}
	private int Age() {
		int age = 0;
		int min = 15;
		int max = 80;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 66;
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
		Random rand = new Random();
		int base = 175;
		int add1 = rand.nextInt(6 + 1) + 1;
		int add2 = rand.nextInt(6 + 1) + 1;
		mod = mod * (add1 + add2);
		int total = base + mod;
		weight = total + " Pounds";
		return weight;
	}
}

package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Triton extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Triton() {
		super("Triton");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Constitution());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new ControlAirAndWater());
		feats.add(new EmissaryOfTheSea());
		feats.add(new GuardianOfTheDepths());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Primordial");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Tritons guard the ocean depths, building small settlements beside deep trenches, portals to the elemental planes, and other dangerous spots far from the eyes of land-bound folk. Long-established guardians of the deep ocean floor, in recent years the noble tritons have become increasingly active in the world above.");
		this.setBook("Volo's 115");
	}
	private int Age() {
		int age = 0;
		int min = 15;
		int max = 200;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 48;
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
		int base = 100;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

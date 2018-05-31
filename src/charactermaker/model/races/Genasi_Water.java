package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Genasi_Water extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Genasi_Water() {
		super("Water Genasi");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new ReachToTheBlaze());
		feats.add(new FireResistance());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Primordial");
		proficiency.add("Acid");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The lapping of waves, the spray of sea foam on the wind,\n" + 
				"the ocean depths—all of these things call to your heart.\n" + 
				"You wander freely and take pride in your independence,\n" + 
				"though others might consider you selfish.\n" + 
				"Most water genasi look as if they just finished bathing,\n" + 
				"with beads of moisture collecting on their skin and hair.\n" + 
				"They smell of fresh rain and clean water. Blue or green\n" + 
				"skin is common, and most have somewhat overlarge\n" + 
				"eyes, blue-black in color. A water genasi’s hair might\n" + 
				"float freely, swaying and waving as if underwater. Some\n" + 
				"have voices with undertones reminiscent of whale song\n" + 
				"or trickling streams.\n" + 
				"");
		this.setBook("EE 9");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 120;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 54;
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
		int base = 110;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

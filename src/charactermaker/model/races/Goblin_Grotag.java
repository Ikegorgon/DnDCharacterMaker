package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Goblin_Grotag extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Goblin_Grotag() {
		super("Grotag Goblin");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new GrotagTamer());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Goblin");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Smaller and weaker than their cousins, and with larger\n" + 
				"hands and feet, goblins of the Grotag tribe attempt to\n" + 
				"live by their wits—though seldom with much success.\n" + 
				"When a Grotag goblin has the bright idea of trying to\n" + 
				"tame fleshpiercer mites, at least a few others will be\n" + 
				"willing to follow that goblin into a nest—usually to\n" + 
				"predictably horrible results. But though the Grotag\n" + 
				"seem to have a never-ending supply of bad ideas, and\n" + 
				"a horrible ratio of bad ideas to good, the Grotag likewise\n" + 
				"seem to have a never-ending supply of Grotag. ");
		this.setBook("PSZ 16-17");
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
		int base = 32;
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
		int base = 35;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

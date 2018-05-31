package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Genasi_Earth extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Genasi_Earth() {
		super("Earth Genasi");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
		feats.add(new EarthWalk());
		feats.add(new MergeWithStone());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Primordial");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("As an earth genasi, you are descended from the cruel\n" + 
				"and greedy dao, though you aren’t necessarily evil. You\n" + 
				"have inherited some measure of control over earth,\n" + 
				"reveling in superior strength and solid power. You tend\n" + 
				"to avoid rash decisions, pausing long enough to consider\n" + 
				"your options before taking action.\n" + 
				"Elemental earth manifests differently from one\n" + 
				"individual to the next. Some earth genasi always have\n" + 
				"bits of dust falling from their bodies and mud clinging\n" + 
				"to their clothes, never getting clean no matter how\n" + 
				"often they bathe. Others are as shiny and polished as\n" + 
				"gemstones, with skin tones of deep brown or black,\n" + 
				"eyes sparkling like agates. Earth genasi can also have\n" + 
				"smooth metallic flesh, dull iron skin spotted with rust,\n" + 
				"a pebbled and rough hide, or even a coating of tiny\n" + 
				"embedded crystals. The most arresting have fissures in\n" + 
				"their flesh, from which faint light shines.");
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

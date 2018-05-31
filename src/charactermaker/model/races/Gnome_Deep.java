package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Gnome_Deep extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Gnome_Deep() {
		super("Deep Gnome");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Intelligence());
		ability.add(new Intelligence());
		ability.add(new Dexterity());
		feats = new ArrayList<RacialFeats>();
		feats.add(new SuperiorDarkvision());
		feats.add(new GnomeCunning());
		feats.add(new StoneCamouflage());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Gnomish");
		proficiency.add("Undercommon");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Forest gnomes and rock gnomes are the gnomes most commonly encountered in the lands of the surface world. There is another subrace of gnomes rarely seen by any surface-dweller: deep gnomes, also known as svirfneblin. Guarded, and suspicious of outsiders, svirfneblin are cunning and taciturn, but can be just as kind-hearted, loyal, and compassionate as their surface cousins.");
		this.setBook("SCAG 115");
	}
	private int Age() {
		int age = 0;
		int min = 25;
		int max = 250;
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
		int base = 70;
		int total = base + (mod * 3);
		weight = total + " Pounds";
		return weight;
	}
}

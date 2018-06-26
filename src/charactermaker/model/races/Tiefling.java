package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Tiefling extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Tiefling() {
		super("Tiefling");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Intelligence());
		ability.add(new Charisma());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new HellishResistance());
		feats.add(new InfernalLegacy());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Infernal");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Tieflings were human-based planetouched, native outsiders that were infused with the touch of the fiendish planes, most often through descent from fiends—demons, Yugoloths, devils, evil deities, and others who had bred with humans.[7] Tieflings were known for their cunning and personal allure, which made them excellent deceivers as well as inspiring leaders when prejudices were laid aside.");
		this.setBook("PHB 42");
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
		int base = 110;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

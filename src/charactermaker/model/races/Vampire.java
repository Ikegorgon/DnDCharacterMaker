package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Vampire extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Vampire() {
		super("Vampire");
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
		feats.add(new VampiricResistance());
		feats.add(new BloodThirst());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Vampire");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Born into ancient servitude and bred to a life of decadent\n" + 
				"corruption, the vampires of Zendikar feed on the\n" + 
				"energy in the blood of living creatures—an energy that\n" + 
				"is particularly strong in times of terror and pain. To\n" + 
				"members of the other races, vampires are a fearsome\n" + 
				"mystery and the stuff of nightmares, hunting their prey\n" + 
				"like beasts or reclining on thrones made of skulls in\n" + 
				"their moss-draped cities.");
		this.setBook("PSZ 15");
	}
	private int Age() {
		int age = 0;
		int min = 100;
		int max = 1000;
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

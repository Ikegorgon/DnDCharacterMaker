package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Aetherborn extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Aetherborn() {
		super("Aetherborn");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new BornOfAether());
		feats.add(new Menacing());
		feats.add(new GiftOfTheAetherborn());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("(Bonus Language)");
		proficiency.add("(Bonus Language)");
		proficiency.add("(Bonus New Ability)");
		proficiency.add("(Bonus New Ability)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Aetherborn spontaneously came into being on Kaladesh as a byproduct of the aether refinement process. \"Families\" of Aetherborn lay territorial claim to areas where young Aetherborn have manifested and instruct them in the way of their kind. Their bodies are in constant flux, as the aether residue they're made of gradually dissolves and is reclaimed by the aethersphere. Thus, their lives are short. But rather than despair, they savor each fleeting moment, squeezing out every last drop of enjoyment. Traditionally, before an Aetherborn dies, they throw a party with mandatory attendance for their friends and associates. Aetherborn that lack such social connections usually hijack the party of another of their kind.");
		this.setBook("PSK");
	}
	private int Age() {
		int age = 0;
		int min = 1;
		int max = 10;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 50;
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
		int base = 80;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

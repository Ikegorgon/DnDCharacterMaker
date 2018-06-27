package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Gith_Zerai extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Gith_Zerai() {
		super("Githzerai");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Wisdom());
		ability.add(new Wisdom());
		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new MentalDiscipline());
		feats.add(new GithzeraiPsionics());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Gith");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Githzerai dwell in fortress-monasteries and cities in the chaotic plane of Limbo, islands made stable and real by the orderly thoughts and wills of their inhabitants. There, monks, ascetics, and others impose strict, regimented lifestyles on the inhabitants to maintain oases of calm in the howling seas of chaosstuff. Rarely, they establish monasteries on Prime Material worlds for their own purposes, and either individual or bands of githzerai sometimes perform the peculiar devotion of travelling the cosmos hunting illithids, swearing oaths not to return to their people until they have slain a mind flayer for every member of their company.");
		this.setBook("MTOF");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 100;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 60;
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

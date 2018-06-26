package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Minotaur extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Minotaur() {
		super("Minotaur");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
		feats.add(new ConquerorsVirtue());
		feats.add(new Horns());
		feats.add(new GoringRush());
		feats.add(new HammeringHorns());
		feats.add(new LabyrinthRecall());
		feats.add(new SeaReaver());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Minotaur in the world of Krynn, the setting of the Dragonlance saga, minotaurs live in an honor based society where strength determines power in both the gladiatorial arenas and in daily life. At home on both land and sea, the minotaurs of Krynn are ferocious sea raiders who rank as the ablest and most dangerous sailors in the world.");
		this.setBook("Water 1-3");
	}
	private int Age() {
		int age = 0;
		int min = 17;
		int max = 150;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 70;
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
		int base = 250;
		int total = base + (mod * 4);
		weight = total + " Pounds";
		return weight;
	}
}

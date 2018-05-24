package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Dwarf_Gray extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Dwarf_Gray() {
		super("Gray Dwarf (Duergar)");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Strength());
		feats = new ArrayList<RacialFeats>();
		feats.add(new SuperiorDarkvision());
		feats.add(new DwarvenResilience());
		feats.add(new DwarvenCombatTraining());
		feats.add(new Stonecunning());
		feats.add(new SunlightSensitivity());
		feats.add(new DuergarMagic());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Dwarvish");
		proficiency.add("Smith's Tools/Brewer's Supplies/Mason's Tools");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Dwarves are well liked and widely accepted, and are well known for their work ethic, whether they are a blacksmith, baker, or politician. Stereotypes tend to cast dwarves as being overly fond of both money and alcohol, though in truth most will put family and clan above all else. Most worship the Sovereign Host, especially Dol Arrah, Kol Korran, and Onatar. Hill dwarves and mountain dwarves appear with equal consistency across the entire race, though individual clans tend to lean one way or the other. Regardless of subrace, most dwarves hold grudge with orcs, especially the Jhorash'Tar clan, who fought the dwarves for control of the Ironroot mountains many thousands of years ago. The dwarves traveled there seeking to escape the harsh cold of their native lands, the Frostfell. Dragonmarked dwarves are of House Kundarak, which was once a clan like any other before it gained great influence thanks to the Mark of Warding. As a result, most of the economy rests in the hands of dwarves, because House Kundarak controls the banking system. Between their sheer economic strength and good reputation, they also exert a considerable political pressure on every nation in Khorvaire.");
	}
	private int Age() {
		int age = 0;
		int min = 50;
		int max = 350;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 42;
		int add1 = rand.nextInt(4 + 1) + 1;
		int add2 = rand.nextInt(4 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + "'" + inches + "\"";
		return height;
	}
	private String Weight() {
		String weight = "";
		Random rand = new Random();
		int base = 105;
		int add1 = rand.nextInt(6 + 1) + 1;
		int add2 = rand.nextInt(6 + 1) + 1;
		mod = mod * (add1 + add2);
		int total = base + mod;
		weight = total + "lbs";
		return weight;
	}
}

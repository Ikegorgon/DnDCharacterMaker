package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Gith_Yanki extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Gith_Yanki() {
		super("Githyanki");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new DecadentMastery());
		feats.add(new MartialProdigy());
		feats.add(new GithyankiPsionics());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Gith");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Githyanki live in a series of outposts and cities within the Astral Plane. From there, they ride out in their otherworldly vessels and upon their red dragon steeds to pillage material planes, taking back slaves, precious goods, and other plunder to their home ports. Because mortal creatures don't naturally age in the Astral Plane, githyanki raise their young in \"creches\" anchored in various Prime Material Planes, where they are trained as warriors, mages, psions, weapon and armorsmiths, food producers, and other useful professions according to demonstrated aptitudes. Such training is cruel, but usually not to the point of actually risking the children's lives. Once a githyanki has slain an illithid, it is considered to have \"come of age,\" and is welcomed into society as an adult. Such a slaying is often a communal effort, or the result of allying with other creatures to accomplish the task.");
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

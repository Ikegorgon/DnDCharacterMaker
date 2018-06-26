package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Kender extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Kender() {
		super("Kender");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Curious());
		feats.add(new Fearless());
		feats.add(new KenderPockets());
		feats.add(new Nimbleness());
		feats.add(new Taunt());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Kenderspeak");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Despite their small stature, Kender love to be the center of attention. Unless actively sneaking, (a skill most Kender excel at) they are loud. They move loudly, they speak loudly...at length...about whatever strikes their fancy. Standing about 3 feet tall, Kender are anything but intimidating.  They are inclined to be thin, weighing between 30 and 40 pounds.");
		this.setBook("Playtest: Races 11");
	}
	private int Age() {
		int age = 0;
		int min = 15;
		int max = 100;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 30;
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
		int base = 23;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

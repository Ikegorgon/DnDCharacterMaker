package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Lizardfolk extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Lizardfolk() {
		super("Lizardfolk");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Bite());
		feats.add(new CunningArtisan());
		feats.add(new HoldBreathe());
		feats.add(new HuntersLore());
		feats.add(new NaturalArmor());
		feats.add(new HungryJaws());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Draconic");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Only a fool looks at the lizardfolk and sees nothing more than scaly humanoids. Their physical shape notwithstanding, lizardfolk have more in common with iguanas or dragons than they do with humans, dwarves, or elves. Lizardfolk possess an alien and inscrutable mindset, their desires and thoughts driven by a different set of basic principles than those of warm-blooded creatures. Their dismal swamp homes might lie hundreds of miles from the nearest human settlement, but the gap between their way of thinking and that of the smooth-skins is far greater. Despite their alien outlook, some lizardfolk make an effort to understand and, in their own manner, befriend people of other races. Such lizardfolk make faithful and skilled allies.");
		this.setBook("Volo's 111");
	}
	private int Age() {
		int age = 0;
		int min = 14;
		int max = 60;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 54;
		int add1 = rand.nextInt(12 + 1) + 1;
		int add2 = rand.nextInt(12 + 1) + 1;
		mod = add1 + add2;
		int total = base + mod;
		int feet = ((int) total / 12);
		int inches =  total - (((int) total / 12) * 12);
		height = feet + " Foot " + inches + " Inch";
		return height;
	}
	private String Weight() {
		String weight = "";
		int base = 150;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

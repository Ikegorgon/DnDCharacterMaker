package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Centaur extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Centaur() {
		super("Centaur");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(40);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Charge());
		feats.add(new Hooves());
		feats.add(new EquineBuild());
		feats.add(new Survivor());
		feats.add(new HybridNature());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Sylvan");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Centaurs were a strong and proud race. Although they typically strove to find peace and balance with nature, they could act with violence when the need arose. Despite this desire for balance, centaurs had to eat a lot to fuel their large bodies and were known to overindulge, especially with wine and ale. A drunken centaur was much more prone to aggressive and violent behavior.");
		this.setBook("UA");
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
		int base = 74;
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
		int base = 1450;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

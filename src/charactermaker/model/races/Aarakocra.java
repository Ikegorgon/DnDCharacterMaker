package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Aarakocra extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Aarakocra() {
		super("Aarakocra");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Flight());
		feats.add(new Talons());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Aarakocra");
		proficiency.add("Auran");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Aarakocra resemble humanoid birds. The average specimen stands about five feet tall and has a wingspan of twenty feet. Halfway along the edge of each wing is a hand with three human-sized fingers and an opposable thumb. An elongated fourth finger extends the length of the wing and locks in place during flight. The hands cannot grasp while flying, but are nearly as useful as human hands when an aarakocra is perched and its wings folded back. Their powerful legs end in four sharp talons that can unlock and fold back to reveal another pair of functional hands. These humanoids have hollow, fragile bones. Their faces combine the features of both parrots and eagles. They have gray-black beaks and black eyes. Plumage color varies, but males generally have red, orange, and yellow coloration, while females tend towards brown and gray.");
		this.setBook("EE 4");
	}
	private int Age() {
		int age = 0;
		int min = 3;
		int max = 30;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 48;
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
		int base = 80;
		int total = base + (mod * 2);
		weight = total + " Pounds";
		return weight;
	}
}

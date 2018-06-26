package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Aven_Hawk extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Aven_Hawk() {
		super("Hawk-Headed Aven");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Wisdom());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Hawkeyed());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Aven");
		proficiency.add("Flight Speed of 30 Feet");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Aven are regal humanoids with impeccable posture, a stern expression and moral code, beautiful feathered bodies, and impressive wings. They are slim and toned to assist in their flight, and most stand over 6 feet. Their wingspan, stretching almost one and a half times their height, easily holds aloft their light bodies even when they are clad in armor. Their arms end in clawed versions of the dextrous hands of humans, but their heads are very akin to those of raptors - eagles, hawks, falcons, and owls.");
		this.setBook("PSA");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 90;
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

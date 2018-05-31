package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Gnome_Rock extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Gnome_Rock() {
		super("Rock Gnome");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(25);
		ability = new ArrayList<Skills>();
		ability.add(new Intelligence());
		ability.add(new Intelligence());
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new GnomeCunning());
		feats.add(new ArtificersLore());
		feats.add(new Tinker());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Gnomish");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Rock gnomes are naturally inventive and quite hardy for such a small creature. Also known as tinker gnomes, they are well known for their contraptions, ranging from revolutionary to eccentric.");
		this.setBook("PHB 37");
	}
	private int Age() {
		int age = 0;
		int min = 40;
		int max = 450;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 35;
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
		int base = 35;
		int total = base + (mod * 1);
		weight = total + " Pounds";
		return weight;
	}
}

package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Elf_Drow extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Elf_Drow() {
		super("Drow Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new SuperiorDarkvision());
		feats.add(new FeyAncestry());
		feats.add(new KeenSenses());
		feats.add(new Trance());
		feats.add(new SunlightSensitivity());
		feats.add(new DrowMagic());
		feats.add(new DrowWeaponTraining());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		proficiency.add("Perception");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Descendants of an earlier, dark-skinned race of elf, the Drow were banished from the surface for following the goddess Lolth down her path of evil and corruption.");
		this.setBook("PHB 24");
	}
	private int Age() {
		int age = 0;
		int min = 100;
		int max = 750;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 64;
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
		int base = 100;
		int total = base + (mod * 3);
		weight = total + " Pounds";
		return weight;
	}
}

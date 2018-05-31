package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Elf_Wood extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Elf_Wood() {
		super("Wood Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(35);
		ability = new ArrayList<Skills>();
		ability.add(new Dexterity());
		ability.add(new Dexterity());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FeyAncestry());
		feats.add(new KeenSenses());
		feats.add(new Trance());
		feats.add(new ElfWeaponTraining());
		feats.add(new MaskOfTheWild());
		feats.add(new FleetOfFoot());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("As a wood elf, you have keen senses and intuition, and your fleet feet carry you quickly and stealthily through your native forests.");
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

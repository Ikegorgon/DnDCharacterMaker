package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Elf_MulDaya extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Elf_MulDaya() {
		super("Mul Daya Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Wisdom());
		ability.add(new Wisdom());
		feats = new ArrayList<RacialFeats>();
		feats.add(new SuperiorDarkvision());
		feats.add(new FeyAncestry());
		feats.add(new KeenSenses());
		feats.add(new ElfWeaponTraining());
		feats.add(new SunlightSensitivity());
		feats.add(new MulDayaMagic());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Elves of the Mul Daya nation of Bala Ged are set apart\n" + 
				"from other elves by their relationship with the spirits of\n" + 
				"their elven ancestors. To the Mul Daya, the spirit world\n" + 
				"and the mortal realm are different only in terms of their\n" + 
				"tangibility. Death and the spirits of the dead are as much\n" + 
				"a part of the lives of the Mul Daya as is the natural\n" + 
				"world. This is not a macabre sentiment to the elves; they\n" + 
				"simply view it as the truest sense of the natural order.\n" + 
				"Mul Daya elves can often be recognized by their\n" + 
				"face painting and tattooing. Many Mul Daya decorate\n" + 
				"their skins with an enwrapping vine motif, and make\n" + 
				"use of poisons and acids collected at great cost from\n" + 
				"strange creatures and plants in the depths of Kazandu");
		this.setBook("PSZ 18-19");
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

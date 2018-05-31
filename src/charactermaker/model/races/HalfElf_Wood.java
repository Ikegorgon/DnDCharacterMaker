package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class HalfElf_Wood extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public HalfElf_Wood() {
		super("Wood Half-Elf");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Charisma());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new FeyAncestry());
		feats.add(new ElfWeaponTraining());
		feats.add(new FleetOfFoot());
		feats.add(new MaskOfTheWild());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Elvish");
		proficiency.add("(+1 to an Ability)");
		proficiency.add("(+1 to an Ability)");
		proficiency.add("(Choose one out of Elf Weapon Training, Fleet of Foot, and Mask of the Wild)");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("Common half-elves blend human and elven features, influenced by the subrace of their elven parent and the ethnicity of their human parent. Moon half-elves have pale skin tinged bluish around the ears and chin, framing their lower faces. Sun half-elves have bronzed skin, and hair of gold. Wild half-elves have brown skin. Wood half-elves have coppery skin tinged with green highlights.");
		this.setBook("SCAG 116");
	}
	private int Age() {
		int age = 0;
		int min = 20;
		int max = 180;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 70;
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
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

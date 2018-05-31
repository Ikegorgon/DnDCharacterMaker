package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Genasi_Fire extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Genasi_Fire() {
		super("Fire Genasi");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Intelligence());
		feats = new ArrayList<RacialFeats>();
		feats.add(new Darkvision());
		feats.add(new ReachToTheBlaze());
		feats.add(new FireResistance());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Primordial");
		proficiency.add("Fire");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("As a fire genasi, you have inherited the volatile mood\n" + 
				"and keen mind of the efreet. You tend toward impatience\n" + 
				"and making snap judgments. Rather than hide your\n" + 
				"distinctive appearance, you exult in it.\n" + 
				"Nearly all fire genasi are feverishly hot as if burning\n" + 
				"inside, an impression reinforced by flaming red, coalblack,\n" + 
				"or ash-gray skin tones. The more human-looking\n" + 
				"have fiery red hair that writhes under extreme emotion,\n" + 
				"while more exotic specimens sport actual flames\n" + 
				"dancing on their heads. Fire genasi voices might sound like crackling flames, and their eyes flare when angered.\n" + 
				"Some are accompanied by the faint scent of brimstone.");
		this.setBook("EE 9");
	}
	private int Age() {
		int age = 0;
		int min = 18;
		int max = 120;
		Random rand = new Random();
		age = rand.nextInt(max - min) + min;
		return age;
	}
	private String Height() {
		String height = "";
		Random rand = new Random();
		int base = 54;
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
		int base = 110;
		int total = base + (mod * 6);
		weight = total + " Pounds";
		return weight;
	}
}

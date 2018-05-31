package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Genasi_Air extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Genasi_Air() {
		super("Air Genasi");
		this.setAge(Age());
		this.setHeight(Height());
		this.setWeight(Weight());
		this.setSpeed(30);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		ability.add(new Constitution());
		ability.add(new Dexterity());
		feats = new ArrayList<RacialFeats>();
		feats.add(new UnbendingBreath());
		feats.add(new MingleWithTheWind());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Primordial");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("As an air genasi, you are descended from the djinn. As\n" + 
				"changeable as the weather, your moods shift from calm\n" + 
				"to wild and violent with little warning, but these storms\n" + 
				"rarely last long.\n" + 
				"Air genasi typically have light blue skin, hair, and eyes.\n" + 
				"A faint but constant breeze accompanies them, tousling\n" + 
				"the hair and stirring the clothing. Some air genasi\n" + 
				"speak with breathy voices, marked by a faint echo. A few\n" + 
				"display odd patterns in their flesh or grow crystals from\n" + 
				"their scalps.");
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

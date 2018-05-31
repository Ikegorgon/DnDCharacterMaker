package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Hobgoblin extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Hobgoblin() {
		super("Hobgoblin");
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
		feats.add(new MartialTraining());
		feats.add(new SavingFace());
		proficiency = new ArrayList<String>();
		proficiency.add("Common");
		proficiency.add("Goblin");
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("War is the lifeblood of hobgoblins. Its glories are the dreams that inspire them. Its horrors don't feature in their nightmares. Cowardice is more terrible to hobgoblins than dying, for they carry their living acts into the afterlife. A hero in death becomes a hero eternal. Young hobgoblins start soldiering when they can walk and heed the mustering call as soon as they can wield their weapons capably. Every legion in the hobgoblins' entire society forever stands prepared for war.");
		this.setBook("Volo's 119");
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
		int base = 50;
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
		int base = 155;
		int total = base + (mod * 5);
		weight = total + " Pounds";
		return weight;
	}
}

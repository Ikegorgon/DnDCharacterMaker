package charactermaker.model.features.feats.classfeat;

public class FavoredEnemy extends ClassFeats{
	public FavoredEnemy() {
		super("Favored Enemy", "Ranger", "-");
		this.setDescription("Beginning at 1st level, you have significant experience studying, tracking, hunting, and even talking to a certain type of enemy.\n" + 
				"\n" + 
				"Choose a type of favored enemy: aberrations, beasts, celestials, constructs, dragons, elementals, fey, fiends, giants, monstrosities, oozes, plants, or undead. Alternatively, you can select two races of humanoid (such as gnolls and orcs) as favored enemies.\n" + 
				"\n" + 
				"You have advantage on Wisdom (Survival) checks to track your favored enemies, as well as on Intelligence checks to recall information about them.\n" + 
				"\n" + 
				"When you gain this feature, you also learn one language of your choice that is spoken by your favored enemies, if they speak one at all.\n" + 
				"\n" + 
				"You choose one additional favored enemy, as well as an associated language, at 6th and 14th level. As you gain levels, your choices should reflect the types of monsters you have encountered on your adventures.");
	}
}

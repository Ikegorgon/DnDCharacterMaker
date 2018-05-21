package charactermaker.model.features.feats.classfeat;

public class KnowYourEnemy extends ClassFeats{
	public KnowYourEnemy() {
		super("Know Your Enemy", "Fighter", "Level 7, Battle Master");
		this.setDescription("Starting at 7th level, if you spend at least 1 minute observing or interacting with another creature outside combat, you can learn certain information about its capabilities compared to your own. The DM tells you if the creature is your equal, superior, or inferior in regard to two of the following characteristics of your choice:\n" + 
				"\n" + 
				"Strength score\n" + 
				"Dexterity score\n" + 
				"Constitution score\n" + 
				"Armor Class\n" + 
				"Current hit points\n" + 
				"Total class levels (if any)\n" + 
				"Fighter class levels (if any)");
	}
}

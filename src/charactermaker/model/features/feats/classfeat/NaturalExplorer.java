package charactermaker.model.features.feats.classfeat;

public class NaturalExplorer extends ClassFeats{
	public NaturalExplorer() {
		super("Natural Explorer", "Ranger", "-");
		this.setDescription("You are particularly familiar with one type of natural environment and are adept at traveling and surviving in such regions. Choose one type of favored terrain: arctic, coast, desert, forest, grassland, mountain, or swamp. When you make an Intelligence or Wisdom check related to your favored terrain, your proficiency bonus is doubled if you are using a skill that you're proficient in.\n" + 
				"\n" + 
				"While traveling for an hour or more in your favored terrain, you gain the following benefits:\n" + 
				"\n" + 
				"Difficult terrain doesn't slow your group's travel.\n" + 
				"Your group can't become lost except by magical means.\n" + 
				"Even when you are engaged in another activity while traveling (such as foraging, navigating, or tracking), you remain alert to danger.\n" + 
				"If you are traveling alone, you can move stealthily at a normal pace.\n" + 
				"When you forage, you find twice as much food as you normally would.\n" + 
				"While tracking other creatures, you also learn their exact number, their sizes, and how long ago they passed through the area.\n" + 
				"You choose additional favored terrain types at 6th and 10th level.");
	}
}

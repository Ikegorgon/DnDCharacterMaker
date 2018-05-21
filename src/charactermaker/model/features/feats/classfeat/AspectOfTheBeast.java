package charactermaker.model.features.feats.classfeat;

public class AspectOfTheBeast extends ClassFeats{
	public AspectOfTheBeast() {
		super("Aspect of the Beast", "Barbarian", "Level 6, Path of the Totem Warrior");
		this.setDescription("At 6th level. you gain a magical benefit based on the totem animal of your choice. You can choose the same animal you selected at 3rd level or a different one. \n" + 
				"Bear. You gain the might of a bear. Your carrying capacity (including maximum load and maximum lift) is doubled, and you have advantage on Strength checks made to push, pull. lift, or break objects. \n" + 
				"Eagle. You gain the eyesight of an eagle. You can see up to 1 mile away with no difficulty, able to discern even fine details as though looking at something no more than 100 feet away from you. Additionally, dim light doesn't impose disadvantage on your Wisdom (Perception) checks. \n" + 
				"Wolf. You gain the hunting sensibilities of a wolf. You can track other creatures while traveling at a fast pace, and you can move stealthily while traveling at a normal pace (see chapter 8 for rules on travel pace).");
	}
}

package charactermaker.model.features.feats.racialfeat;

public class WildhuntShifting extends RacialFeats{
	public WildhuntShifting() {
		super("Wildhunt Shifting", "Wildhunt Shifter");
		this.setDescription("You have honed your tracking and stalking senses, allowing you to track by scent. You gain the following benefits:\n" + 
				"\n" + 
				"Add double you proficiency bonus to the Survival skill in regards to tracking creatures you have already seen ir smelled.\n" + 
				"Gain proficiency in the Wisdom (Perception) skill.\n" + 
				"At level 10, you can use Blindsight with a 40ft range for one round. You may use this ability again after a long rest.");
	}
}

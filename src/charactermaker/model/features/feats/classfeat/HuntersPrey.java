package charactermaker.model.features.feats.classfeat;

public class HuntersPrey extends ClassFeats{
	public HuntersPrey() {
		super("Hunter's Prey", "Ranger", "Level 3, Hunter");
		this.setDescription("At 3rd level, you gain one of the following features of your choice.\n" + 
				"\n" + 
				"Colossus Slayer. Your tenacity can wear down the most potent foes. When you hit a creature with a weapon attack, the creature takes an extra 1d8 damage if it's below its hit point maximum. You can deal this extra damage only once per turn.\n" + 
				"\n" + 
				"Giant Killer. When a Large or larger creature within 5 feet of you hits or misses you with an attack, you can use your reaction to attack that creature immediately after its attack, provided that you can see the creature.\n" + 
				"\n" + 
				"Horde Breaker. Once on each of your turns when you make a weapon attack, you can make another attack with the same weapon against a different creature that is within 5 feet of the original target and within range of your weapon.");
	}
}

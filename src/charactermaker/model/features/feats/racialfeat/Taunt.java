package charactermaker.model.features.feats.racialfeat;

public class Taunt extends RacialFeats{
	public Taunt() {
		super("Taunt", "Kender");
		this.setDescription("You have a remarkable ability to get under someone's skin. As an action, you may choose one creature who can hear and understand you. Make a Charisma (Performance) check, resisted by the target's Wisdom (Insight) check. \n" + 
				"\n" + 
				"If you win, the target must use its next action to attack only you. If you are outside of its attack range, it must charge at you and may only dash until it reaches you or its turn ends. The target attacks you with disadvantage.\n" + 
				"\n" + 
				"If the target wins the contest, it is immune to your Taunt for 24 hours.");
	}
}

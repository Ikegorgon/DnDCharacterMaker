package charactermaker.model.features.feats.general;

public class Sentinel extends GeneralFeats {
	public Sentinel() {
		super("Sentinel", "-");
		this.setDescription("You have mastered techniques to take advantage of every drop in any enemy's guard, gaining the following benefits: \n" + 
				"When you hit a creature with an opportunity attack, the creature's speed becomes 0 for the rest of\n" + 
				"the turn. \n" + 
				"Creatures within 5 feel of you provoke opportunity attacks from you even if they lake the Disengage action before leaving your reach.\n" + 
				"When a creature within 5 feet of you makes an attack against a target other than you (and that target doesn't have this feat), you can use your reaction to make a melee weapon attack against the attacking creature. \n" + 
				"");
	}
}

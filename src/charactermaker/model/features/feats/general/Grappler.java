package charactermaker.model.features.feats.general;

public class Grappler extends GeneralFeats{
	public Grappler() {
		super("Grappler", "Strength 13 or higher");
		this.setDescription("You've developed the skills necessary to hold your own in close-quarters grappling. You gain the following benefits: \n" + 
				"You have advantage on attack rolls against a creature you are grappling.\n" + 
				"You can use your action to try to pin a creature grappled by you. To do so, make another grapple check. lf you succeed, you and the creature are both restrained until the grapple ends. \n" + 
				"Creatures that are one size larger than you don't automatically succeed on checks to escape your grapple.\n" + 
				"");
	}
}

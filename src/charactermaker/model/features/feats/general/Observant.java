package charactermaker.model.features.feats.general;

public class Observant extends GeneralFeats {
	public Observant() {
		super("Observant", "-");
		this.setDescription("Quick to notice details of your environment, you gain the following benefits: \n" + 
				"Increase your Intelligence or Wisdom score by 1, to a maximum of 20.\n" + 
				"If you can see a creature's mouth while it is speaking\n" + 
				"a language you understand, you can interpret what it's saying by reading its lips. \n" + 
				"You have a +5 bonus to your passive Wisdom (Perception) and passive Intelligence (Investigation) scores.");
	}
}

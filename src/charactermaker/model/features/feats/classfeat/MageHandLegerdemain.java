package charactermaker.model.features.feats.classfeat;

public class MageHandLegerdemain extends ClassFeats{
	public MageHandLegerdemain() {
		super("Mage Hand Legerdemain", "Rogue", "Level 3, Arcane Trickster");
		this.setDescription("Starting at 3rd level, when you cast mage hand, you can make the spectral hand invisible, and you can perform the following additional tasks with it:\n" + 
				"\n" + 
				"You can stow one object the hand is holding in a container worn or carried by another creature.\n" + 
				"You can retrieve an object in a container worn or carried by another creature.\n" + 
				"You can use thieves’ tools to pick locks and disarm traps at range.\n" + 
				"You can perform one of these tasks without being noticed by a creature if you succeed on a Dexterity (Sleight of Hand) check contested by the creature’s Wisdom (Perception) check.\n" + 
				"\n" + 
				"In addition, you can use the bonus action granted by your Cunning Action to control the hand.");
	}
}

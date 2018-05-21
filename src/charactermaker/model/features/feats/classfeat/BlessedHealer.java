package charactermaker.model.features.feats.classfeat;

public class BlessedHealer extends ClassFeats{
	public BlessedHealer() {
		super("Blessed Healer", "Cleric", "Level 6, Life Domain");
		this.setDescription("Beginning at 6th level, the healing spells you cast on others heal you as well. When you cast a spell of 1st level or higher that restores hit points to a creature other than you, you regain hit points equal to 2 + the spell's level.");
	}
}

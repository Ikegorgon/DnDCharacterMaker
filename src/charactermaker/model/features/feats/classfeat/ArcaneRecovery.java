package charactermaker.model.features.feats.classfeat;

public class ArcaneRecovery extends ClassFeats{
	public ArcaneRecovery() {
		super("Arcane Recovery", "Wizard", "-");
		this.setDescription("You have learned to regain some of your magical energy by studying your spellbook. Once per day when you finish a short rest, you can choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your wizard level (rounded up), and none of the slots can be 6th level or higher.\n" + 
				"\n" + 
				"For example, if you're a 4th-level wizard, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level spell slot or two 1st-level spell slots.");
	}
}

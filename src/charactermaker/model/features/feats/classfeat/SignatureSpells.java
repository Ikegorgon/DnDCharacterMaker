package charactermaker.model.features.feats.classfeat;

public class SignatureSpells extends ClassFeats{
	public SignatureSpells() {
		super("Signature Spells", "Wizard", "Level 20");
		this.setDescription("When you reach 20th level, you gain mastery over two powerful spells and can cast them with little effort. Choose two 3rd-level wizard spells in your spellbook as your signature spells. You always have these spells prepared, they don't count against the number of spells you have prepared, and you can cast each of them once at 3rd level without expending a spell slot. When you do so, you can't do so again until you finish a short or long rest.\n" + 
				"\n" + 
				"If you want to cast either spell at a higher level, you must expend a spell slot as normal.");
	}
}

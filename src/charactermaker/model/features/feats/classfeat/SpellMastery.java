package charactermaker.model.features.feats.classfeat;

public class SpellMastery extends ClassFeats{
	public SpellMastery() {
		super("Spell Mastery", "Wizard", "Level 18");
		this.setDescription("At 18th level, you have achieved such mastery over certain spells that you can cast them at will. Choose a 1st-level wizard spell and a 2nd-level wizard spell that are in your spellbook. You can cast those spells at their lowest level without expending a spell slot when you have them prepared. If you want to cast either spell at a higher level, you must expend a spell slot as normal.\n" + 
				"\n" + 
				"By spending 8 hours in study, you can exchange one or both of the spells you chose for different spells of the same levels.");
	}
}

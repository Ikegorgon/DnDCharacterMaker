package charactermaker.model.features.feats.classfeat;

public class SpellResistance extends ClassFeats{
	public SpellResistance() {
		super("Spell Resistance", "Wizard", "Level 14, School of Abjuration");
		this.setDescription("Starting at 14th level, you have advantage on saving throws against spells.\n" + 
				"\n" + 
				"Furthermore, you have +1 resistance to damage from spells. This feature can not increase your resistance above 1.");
	}
}

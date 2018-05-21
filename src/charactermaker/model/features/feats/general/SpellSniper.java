package charactermaker.model.features.feats.general;

public class SpellSniper extends GeneralFeats {
	public SpellSniper() {
		super("Spell Sniper", "The ability to cast at least one spell");
		this.setDescription("You have learned techniques to enhance your attacks with certain kinds of spells, gaining the following benefits: \n" + 
				"When you cast a spell that requires you to make an attack roll, the spell's range is doubled.\n" + 
				"Your ranged spell attacks ignore half cover and three-quarters cover. \n" + 
				"You learn one cantrip that requires an attack roll. Choose the cantrip from the bard, cleric, druid, sorcerer, warlock, or wizard spell list. Your spellcasting ability for this cantrip depends on the spell list you chose from: Charisma for bard, sorcerer, or warlock; Wisdom for cleric or druid; or Intelligence for wizard.");
	}
}

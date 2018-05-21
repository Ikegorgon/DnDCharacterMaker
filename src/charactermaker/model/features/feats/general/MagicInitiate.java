package charactermaker.model.features.feats.general;

public class MagicInitiate extends GeneralFeats {
	public MagicInitiate() {
		super("Magic Initiate", "-");
		this.setDescription("Choose a class: bard, cleric, druid, sorcerer, warlock, or wizard. You learn two cantrips of your choice from that class's spell list. \n" + 
				"In addition, choose one 1st-level spell from that same list. You learn that spell and can cast it at its lowest level. Once you cast it, you must finish a long rest before you can cast it again. \n" + 
				"Your spellcasting ability for these spells depends on the class you chose: Charisma for bard,\n" + 
				"sorcerer, or warlock: Wisdom for cleric or druid: or Intelligence for wizard. \n" + 
				"");
	}
}

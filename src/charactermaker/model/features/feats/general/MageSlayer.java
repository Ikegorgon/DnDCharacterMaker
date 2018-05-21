package charactermaker.model.features.feats.general;

public class MageSlayer extends GeneralFeats {
	public MageSlayer() {
		super("Mage Slayer", "-");
		this.setDescription("You have practiced techniques useful in melee combat against spellcasters, gaining the following benefits: \n" + 
				"When a creature within 5 feet of you casts a spell, you can use your reaction to make a melee weapon attack against that creature.\n" + 
				"When you damage a creature that is concentrating on a spell, that creature has disadvantage on the saving throw it makes to maintain its concentration. \n" + 
				"You have advantage on saving throws against spells cast by creatures within 5 feet of you.\n" + 
				"");
	}
}

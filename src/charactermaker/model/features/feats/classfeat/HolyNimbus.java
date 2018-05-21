package charactermaker.model.features.feats.classfeat;

public class HolyNimbus extends ClassFeats{
	public HolyNimbus() {
		super("Holy Nimbus", "Paladin", "Level 20, Oath of Devotion");
		this.setDescription("At 20th level, as an action, you can emanate an aura of sunlight. For 1 minute, bright light shines from you in a 30-foot radius, and dim light shines 30 feet beyond that.\n" + 
				"Whenever an enemy creature starts its turn in the bright light, the creature takes 10 radiant damage.\n" + 
				"In addition, for the duration, you have advantage on saving throws against spells cast by fiends or undead.\n" + 
				"Once you use this feature, you can't use it again until you finish a long rest.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class SpellBombardment extends ClassFeats{
	public SpellBombardment() {
		super("Spell Bombardment", "Sorcerer", "Level 18, Wild Magic");
		this.setDescription("Beginning at 18th level, the harmful energy of your\n" + 
				"spells intensifies. When you roll damage for a spell and roll the highest number possible on any of the dice, choose one of those dice, roll it again and add that roll to the damage. You can use the feature only once per turn.");
	}
}

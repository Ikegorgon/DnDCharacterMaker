package charactermaker.model.features.feats.classfeat;

public class UndeadThralls extends ClassFeats{
	public UndeadThralls() {
		super("Undead Thralls", "Wizard", "Level 6, School of Necromancy");
		this.setDescription("At 6th level, you add the animate dead spell to your spellbook if it is not there already. When you cast animate dead, you can target one additional corpse or pile of bones, creating another zombie or skeleton, as appropriate.\n" + 
				"\n" + 
				"Whenever you create an undead using a necromancy spell, it has additional benefits:\n" + 
				"\n" + 
				"The creature’s hit point maximum is increased by an amount equal to your wizard level.\n" + 
				"The creature adds your proficiency bonus to its weapon damage rolls.");
	}
}

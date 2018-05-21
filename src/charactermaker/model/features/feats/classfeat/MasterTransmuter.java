package charactermaker.model.features.feats.classfeat;

public class MasterTransmuter extends ClassFeats{
	public MasterTransmuter() {
		super("Master Transmuter", "Wizard", "Level 14, School of Transmution");
		this.setDescription("Starting at 14th level, you can use your action to consume the reserve of transmutation magic stored within your transmuter's stone in a single burst. When you do so, choose one of the following effects. Your transmuter's stone is destroyed and can't be remade until you finish a long rest."
				+ "Major Transformation\n" + 
				"\n" + 
				"You can transmute one nonmagical object—no larger than a 2-metre cube—into another nonmagical object of similar size and mass and of equal or lesser value. You must spend 10 minutes handling the object to transform it.\n" + 
				"\n" + 
				"Panacea\n" + 
				"\n" + 
				"You remove all curses, diseases, and poisons affecting a creature that you touch with the transmuter's stone. The creature also regains all its hit points.\n" + 
				"\n" + 
				"Restore Life\n" + 
				"\n" + 
				"You cast the raise dead spell on a creature you touch with the transmuter's stone, without expending a spell slot or needing to have the spell in your spellbook.\n" + 
				"\n" + 
				"Restore Youth\n" + 
				"\n" + 
				"You touch the transmuter's stone to a willing creature, and that creature's apparent age is reduced by 3d10 years, to a minimum of 13 years. This effect doesn't extend the creature's lifespan.");
	}
}

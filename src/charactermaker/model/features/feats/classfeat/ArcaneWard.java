package charactermaker.model.features.feats.classfeat;

public class ArcaneWard extends ClassFeats{
	public ArcaneWard() {
		super("Arcane Ward", "Wizard", "Level 2, School of Abjuration");
		this.setDescription("Starting at 2nd level, you can weave magic around yourself for protection. When you cast an abjuration spell of 1st level or higher, you can simultaneously use a strand of the spell's magic to create a magical ward on yourself that lasts until you finish a long rest. The ward has hit points equal to twice your wizard level + your Intelligence modifier. Whenever you take damage, the ward takes the damage instead. If this damage reduces the ward to 0 hit points, you take any remaining damage.\n" + 
				"\n" + 
				"While the ward has 0 hit points, it can't absorb damage, but its magic remains. Whenever you cast an abjuration spell of 1st level or higher, the ward regains a number of hit points equal to twice the level of the spell.\n" + 
				"\n" + 
				"Once you create the ward, you can't create it again until you finish a long rest.");
	}
}

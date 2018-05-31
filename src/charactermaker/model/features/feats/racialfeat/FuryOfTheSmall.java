package charactermaker.model.features.feats.racialfeat;

public class FuryOfTheSmall extends RacialFeats{
	public FuryOfTheSmall() {
		super("Fury of the Small", "Goblin");
		this.setDescription("When you damage a creature with an attack or a spell and the creature's size is larger than yours, you can cause the attack or spell to deal extra damage to the creature. The extra damage equals your level. Once you use this trait, you can't use it again until you finish a short or long rest.");
	}
}

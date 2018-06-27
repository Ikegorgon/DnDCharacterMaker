package charactermaker.model.features.feats.racialfeat;

public class Charge extends RacialFeats{
	public Charge() {
		super("Charge", "Centaur");
		this.setDescription("If you move at least 20 feet straight toward a target and then hit it with a melee weapon attack on the same turn, roll the weapon's damage dice twice and add them together. Once you use this ability, you can't use it again until you finish a short or long rest.");
	}
}

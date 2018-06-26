package charactermaker.model.features.feats.racialfeat;

public class BloodThirst extends RacialFeats{
	public BloodThirst() {
		super("Blood Thirst", "Vampire");
		this.setDescription("You can drain blood and life energy\n" + 
				"from a willing creature, or one that is grappled by\n" + 
				"you, incapacitated, or restrained. Make a melee attack\n" + 
				"against the target. If you hit, you deal 1 piercing damage\n" + 
				"and 1d6 necrotic damage. The target’s hit point\n" + 
				"maximum is reduced by an amount equal to the necrotic\n" + 
				"damage taken, and you regain hit points equal to\n" + 
				"that amount. The reduction lasts until the target finishes\n" + 
				"a long rest. The target dies if this effect reduces its\n" + 
				"hit point maximum to 0. A humanoid killed in this way\n" + 
				"becomes a null (see “A Zendikar Bestiary”).");
	}
}

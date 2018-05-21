package charactermaker.model.features.feats.racialfeat;

public class SavageAttacks extends RacialFeats{
	public SavageAttacks() {
		super("Savage Attacks", "Half-Orc");
		this.setDescription("When you score a critical hit with\n" + 
				"a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
	}
}

package charactermaker.model.features.feats.racialfeat;

public class BreathWeapon extends RacialFeats{
	public BreathWeapon() {
		super("Breath Weapon", "Dragonborn");
		this.setDescription("You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape. and damage type of the exhalation. \n" + 
				"When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save. and half as much damage on a successful one. The damage increases to 3d6 at 6th level. 4d6 at 11th level, and 5d6 at 16th level. \n" + 
				"After you use your breath weapon, you can't use it again until you complete a short or long rest.");
	}
}

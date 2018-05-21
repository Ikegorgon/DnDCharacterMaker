package charactermaker.model.features.feats.classfeat;

public class SneakAttack extends ClassFeats{
	public SneakAttack() {
		super("Sneak Attack", "Rogue", "-");
		this.setDescription("Beginning at 1st level, you know how to strike subtly and exploit a foe's distraction. Once per turn, you can deal an extra 1d6 damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon.\n" + 
				"\n" + 
				"You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn't incapacitated, and you don't have disadvantage on the attack roll.\n" + 
				"\n" + 
				"The amount of the extra damage increases as you gain levels in this class, as shown in the Sneak Attack column of the Rogue table.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class WeaponBond extends ClassFeats{
	public WeaponBond() {
		super("Weapon Bond", "Fighter", "Level 3, Eldritch Knight");
		this.setDescription("At 3rd level, you learn a ritual that creates a magical bond between yourself and one weapon. You perform the ritual over the course of 1 hour, which can be done during a short rest. The weapon must be within your reach throughout the ritual, at the conclusion of which you touch the weapon and forge the bond.\n" + 
				"\n" + 
				"Once you have bonded a weapon to yourself, you can’t be disarmed of that weapon unless you are incapacitated. If it is on the same plane of existence, you can summon that weapon as a bonus action on your turn, causing it to teleport instantly to your hand.\n" + 
				"\n" + 
				"You can have up to two bonded weapons, but can summon only one at a time with your bonus action. If you attempt to bond with a third weapon, you must break the bond with one of the other two.");
	}
}

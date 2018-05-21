package charactermaker.model.features.feats.classfeat;

public class CD_SacredWeapon extends ClassFeats{
	public CD_SacredWeapon() {
		super("Channel Divinity: Sacred Weapon", "Paladin", "Level 3, Oath of Devotion");
		this.setDescription("As an action, you can imbue one weapon that you are holding with positive energy, using your Channel Divinity. For 1 minute, you add your Charisma modifier to attack rolls made with that weapon (with a minimum bonus of +1). The weapon also emits bright light in a 20-foot radius and dim light 20 feet beyond that. If the weapon is not already magical, it becomes magical for the duration.\n" + 
				"You can end this effect on your turn as part of any other action. If you are no longer holding or carrying this weapon, or if you fall unconscious, this effect ends.");
	}
}

package charactermaker.model.features.feats.general;

public class Skulker extends GeneralFeats {
	public Skulker() {
		super("Skuler", "Dexterity 13 or higher");
		this.setDescription("You are expert at slinking through shadows. You gain the following benefits: \n" + 
				"You can try to hide when you are lightly obscured\n" + 
				"from the creature from which you are hiding.\n" + 
				"When you are hidden from a creature and miss it with a ranged weapon attack, making the attack doesn't reveal your position. \n" + 
				"Dim light doesn't impose disadvantage on your Wisdom (Perception) checks relying on sight. \n" + 
				"");
	}
}

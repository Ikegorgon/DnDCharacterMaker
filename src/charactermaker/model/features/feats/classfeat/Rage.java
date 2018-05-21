package charactermaker.model.features.feats.classfeat;

public class Rage extends ClassFeats{
	public Rage() {
		super("Rage", "Barbarian", "-");
		this.setDescription("In battle, you fight with primal ferocity. On your turn, you can enter a rage as a bonus action.\n" + 
				"\n" + 
				"While raging, you gain the following benefits if you aren't wearing heavy armor:\n" + 
				"\n" + 
				"You have advantage on Strength checks and Strength saving throws.\n" + 
				"When you make a melee weapon attack using Strength, you gain a bonus to the damage roll that increases as you gain levels as a barbarian, as shown in the Rage Damage column of the Barbarian table.\n" + 
				"You have resistance to bludgeoning, piercing, and slashing damage.\n" + 
				"If you are able to cast spells, you can't cast them or concentrate on them while raging.\n" + 
				"\n" + 
				"Your rage lasts for 1 minute. It ends early if you are knocked unconscious or if your turn ends and you haven't attacked a hostile creature since your last turn or taken damage since then. You can also end your rage on your turn as a bonus action.\n" + 
				"\n" + 
				"Once you have raged the number of times shown for your barbarian level in the Rages column of the Barbarian table, you must finish a long rest before you can rage again.");
	}
}

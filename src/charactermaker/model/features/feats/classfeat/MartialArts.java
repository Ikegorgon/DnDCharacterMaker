package charactermaker.model.features.feats.classfeat;

public class MartialArts extends ClassFeats{
	public MartialArts() {
		super("Martial Arts", "Monk", "-");
		this.setDescription("At 1st level, your practice of martial arts gives you mastery of combat styles that use unarmed strikes and monk weapons, which are shortswords and any simple melee weapons that don't have the two-handed or heavy property.\n" + 
				"\n" + 
				"You gain the following benefits while you are unarmed or wielding only monk weapons and you aren't wearing armor or wielding a shield:\n" + 
				"\n" + 
				"You can use Dexterity instead of Strength for the attack and damage rolls of your unarmed strikes and monk weapons.\n" + 
				"You can roll a d4 in place of the normal damage of your unarmed strike or monk weapon. This die changes as you gain monk levels, as shown in the Martial Arts column of the Monk table.\n" + 
				"When you use the Attack action with an unarmed strike or a monk weapon on your turn, you can make one unarmed strike as a bonus action. For example, if you take the Attack action and attack with a quarterstaff, you can also make an unarmed strike as a bonus action, assuming you haven't already taken a bonus action this turn.\n" + 
				"Certain monasteries use specialized forms of the monk weapons. For example, you might use a club that is two lengths of wood connected by a short chain (called a nunchaku) or a sickle with a shorter, straighter blade (called a kama). Whatever name you use for a monk weapon, you can use the game statistics provided for the weapon.");
	}
}

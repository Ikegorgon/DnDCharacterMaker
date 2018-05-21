package charactermaker.model.features.feats.classfeat;

public class FightingStyle extends ClassFeats{
	public FightingStyle() {
		super("Fighting Style", "Fighter, Paladin, Ranger", "Level 2 (Level 1 Fighter)");
		this.setDescription("You adopt a particular style of fighting as your specialty. Choose one of the following options. You can't take a Fighting Style option more than once, even if you later get to choose again.\n" + 
				"\n" + 
				"Archery\n" + 
				"You gain a +2 bonus to attack rolls you make with ranged weapons.\n" + 
				"\n" + 
				"Defense\n" + 
				"While you are wearing armor, you gain a +1 bonus to AC.\n" + 
				"\n" + 
				"Dueling\n" + 
				"When you are wielding a melee weapon in one hand and no other weapons, you gain a +2 bonus to damage rolls with that weapon.\n" + 
				"\n" + 
				"Great Weapon Fighting\n" + 
				"When you roll a 1 or 2 on a damage die for an attack you make with a melee weapon that you are wielding with two hands, you can reroll the die and must use the new roll, even if the new roll is a 1 or a 2. The weapon must have the two-handed or versatile property for you to gain this benefit.\n" + 
				"\n" + 
				"Protection\n" + 
				"When a creature you can see attacks a target other than you that is within 5 feet of you, you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.\n" + 
				"\n" + 
				"Two-Weapon Fighting\n" + 
				"When you engage in two-weapon fighting, you can add your ability modifier to the damage of the second attack.");
	}
}

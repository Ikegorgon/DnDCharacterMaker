package charactermaker.model.features.feats.classfeat;

public class CombatSuperiority extends ClassFeats{
	public CombatSuperiority() {
		super("Combat Superiority", "Fighter", "Level 3, Battle Master");
		this.setDescription("When you choose this archetype at 3rd level, you learn maneuvers that are fueled by special dice called superiority dice.\n" + 
				"\n" + 
				"Maneuvers. You learn three maneuvers of your choice, which are detailed under “Maneuvers” below. Many maneuvers enhance an attack in some way. You can use only one maneuver per attack.\n" + 
				"\n" + 
				"You learn two additional maneuvers of your choice at 7th, 10th, and 15th level. Each time you learn new maneuvers, you can also replace one maneuver you know with a different one.\n" + 
				"\n" + 
				"Superiority Dice. You have four superiority dice, which are d8s. A superiority die is expended when you use it. You regain all of your expended superiority dice when you finish a short or long rest.\n" + 
				"\n" + 
				"You gain another superiority die at 7th level and one more at 15th level.\n" + 
				"\n" + 
				"Saving Throws. Some of your maneuvers require your target to make a saving throw to resist the maneuver’s effects. The saving throw DC is calculated as follows:\n" + 
				"\n" + 
				"Maneuver save DC = 8 + your proficiency bonus + your Strength or Dexterity modifier (your choice)");
	}
}

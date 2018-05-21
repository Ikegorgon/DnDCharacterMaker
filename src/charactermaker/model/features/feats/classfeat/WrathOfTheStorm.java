package charactermaker.model.features.feats.classfeat;

public class WrathOfTheStorm extends ClassFeats{
	public WrathOfTheStorm() {
		super("Wrath of the Storm", "Cleric", "Tempest Domain");
		this.setDescription("Also at 1st level, you can thunderously rebuke attackers. When a creature within 5 feet of you that you can see hits you with an attack, you can use your reaction to cause the creature to make a Dexterity saving throw. The creature takes 2d8 lightning or thunder damage (your choice) on a failed saving throw, and half as much damage on a successful one.\n" + 
				"\n" + 
				"You can use this feature a number of times equal to your Wisdom modifier (a minimum of once). You regain all expended uses when you finish a long rest.");
	}
}

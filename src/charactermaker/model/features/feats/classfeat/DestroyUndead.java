package charactermaker.model.features.feats.classfeat;

public class DestroyUndead extends ClassFeats{
	public DestroyUndead() {
		super("Destroy Undead", "Cleric", "Level 5");
		this.setDescription("Starting at 5th level, when an undead fails its saving throw against your Turn Undead feature, the creature is instantly destroyed if its challenge rating is at or below a certain threshold, as shown in the Destroy Undead table.\n" + 
				"\n" + 
				"Destroy Undead\n" + 
				"Cleric Level	Destroys Undead of CR . . .\n" + 
				"5th		1/2 or lower\n" + 
				"8th		1 or lower\n" + 
				"11th	2 or lower\n" + 
				"14th	3 or lower\n" + 
				"17th	4 or lower");
	}
}

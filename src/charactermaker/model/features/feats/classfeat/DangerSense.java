package charactermaker.model.features.feats.classfeat;

public class DangerSense extends ClassFeats{
	public DangerSense() {
		super("Danger Sense", "Barbarian", "Level 2");
		this.setDescription("At 2nd level, you gain an uncanny sense of when things nearby aren't as they should be, giving you an edge when you dodge away from danger.\n" + 
				"\n" + 
				"You have advantage on Dexterity saving throws against effects that you can see, such as traps and spells. To gain this benefit, you can't be blinded, deafened, or incapacitated.");
	}
}

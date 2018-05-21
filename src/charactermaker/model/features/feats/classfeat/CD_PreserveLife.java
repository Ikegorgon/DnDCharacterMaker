package charactermaker.model.features.feats.classfeat;

public class CD_PreserveLife extends ClassFeats{
	public CD_PreserveLife() {
		super("Channel Divinity: Preserve Life", "Cleric", "Level 2, Life Domain");
		this.setDescription("Starting at 2nd level, you can use your Channel Divinity to heal the badly injured.\n" + 
				"\n" + 
				"As an action, you present your holy symbol and evoke healing energy that can restore a number of hit points equal to five times your cleric level. Choose any creatures within 30 feet of you, and divide those hit points among them. This feature can restore a creature to no more than half of its hit point maximum. You can't use this feature on an undead or a construct.");
	}
}

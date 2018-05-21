package charactermaker.model.features.feats.classfeat;

public class CD_RadianceOfTheDawn extends ClassFeats{
	public CD_RadianceOfTheDawn() {
		super("Channel Divinity: Radiance of the Dawn", "Cleric", "Level 2, Light Domain");
		this.setDescription("Starting at 2nd level, you can use your Channel Divinity to harness sunlight, banishing darkness and dealing radiant damage to your foes.\n" + 
				"\n" + 
				"As an action, you present your holy symbol, and any magical darkness within 30 feet of you is dispelled. Additionally, each hostile creature within 30 feet of you must make a Constitution saving throw. A creature takes radiant damage equal to 2d10 + your cleric level on a failed saving throw, and half as much damage on a successful one. A creature that has total cover from you is not affected.");
	}
}

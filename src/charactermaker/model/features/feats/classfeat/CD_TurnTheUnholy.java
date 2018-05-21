package charactermaker.model.features.feats.classfeat;

public class CD_TurnTheUnholy extends ClassFeats{
	public CD_TurnTheUnholy() {
		super("Channel Divinity: Turn the Unholy", "Paladin", "Level 3, Oath of Devotion");
		this.setDescription("As an action, you present your holy symbol and speak a prayer censuring fiends and undead, using your Channel Divinity. Each fiend or undead that can see or hear you within 30 feet of you must make a Wisdom saving throw. If the creature fails its saving throw, it is turned for 1 minute or until it takes damage.\n" + 
				"A turned creature must spend its turns trying to move as far away from you as it can, and it can't willingly move to a space within 30 feet of you. It also can't take reactions. For its action, it can use only the Dash action or try to escape from an effect that prevents it from moving. If there's nowhere to move, the creature can use the Dodge action.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class CD_TurnTheFaithless extends ClassFeats{
	public CD_TurnTheFaithless() {
		super("Channel Divinity: Turn the Faithless", "Paladin", "Level 3, Oath of Devotion");
		this.setDescription("You can use your Channel Divinity to utter ancient words that are painful for fey and fiends to hear. As an action, you present your holy symbol, and each fey or fiend within 30 feet of you that can hear you must make a Wisdom saving throw. On a failed save, the creature is turned for 1 minute or until it takes damage. \n" + 
				"A turned creature must spend its turns trying to move as far away from you as it can, and it can't willingly\n" + 
				"move to a space within 30 feet of you. It also can't take reactions. For its action, it can use only the Dash action or try to escape from an effect that prevents it from moving. If there's nowhere to move, the creature can use the Dodge action. \n" + 
				"If the creature's true form is concealed by an illusion, shapeshifting, or other effect, that form is revealed while it is turned.");
	}
}

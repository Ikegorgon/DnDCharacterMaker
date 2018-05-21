package charactermaker.model.features.feats.classfeat;

public class CD_ReadThoughts extends ClassFeats{
	public CD_ReadThoughts() {
		super("Channel Divinity: Read Thoughts", "Cleric", "Level 6, Knowledge Domain");
		this.setDescription("At 6th level, you can use your Channel Divinity to read a creature’s thoughts. You can then use your access to the creature’s mind to command it.\n" + 
				"\n" + 
				"As an action, choose one creature that you can see within 60 feet of you. That creature must make a Wisdom saving throw. If the creature succeeds on the saving throw, you can’t use this feature on it again until you finish a long rest.\n" + 
				"\n" + 
				"If the creature fails its save, you can read its surface thoughts (those foremost in its mind, reflecting its current emotions and what it is actively thinking about) when it is within 60 feet of you. This effect lasts for 1 minute.\n" + 
				"\n" + 
				"During that time, you can use your action to end this effect and cast the suggestion spell on the creature without expending a spell slot. The target automatically fails its saving throw against the spell.");
	}
}

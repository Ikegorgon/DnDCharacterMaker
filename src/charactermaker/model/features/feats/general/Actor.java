package charactermaker.model.features.feats.general;

public class Actor extends GeneralFeats{
	public Actor() {
		super("Actor", "-");
		this.setDescription("Skilled at mimicry and dramatics, you gain the following benefits: \n" + 
				"Increase your Charisma score by 1, to a maximum of 20. You have advantage on Charisma (Deception) and Charisma (Performance) checks when trying to pass yourself off as a different person. \n" + 
				"You can mimic the speech of another person or the sounds made by other creatures. You must have heard the person speaking. or heard the creature make the sound, for at least 1 minute. A successful Wisdom (Insight) check contested by your Charisma (Deception) check allows a listener to determine that the effect is faked. \n" + 
				"");
	}
}

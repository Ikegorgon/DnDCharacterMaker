package charactermaker.model.features.feats.classfeat;

public class Ki extends ClassFeats{
	public Ki() {
		super("Ki", "Monk", "Level 2");
		this.setDescription("Starting at 2nd level, your training allows you to harness the mystic energy of ki. Your access to this energy is represented by a number of ki points. Your monk level determines the number of points you have, as shown in the Ki Points column of the Monk table.\n" + 
				"\n" + 
				"You can spend these points to fuel various ki features. You start knowing three such features: Flurry of Blows, Patient Defense, and Step of the Wind. You learn more ki features as you gain levels in this class.\n" + 
				"\n" + 
				"When you spend a ki point, it is unavailable until you finish a short or long rest, at the end of which you draw all of your expended ki back into yourself. You must spend at least 30 minutes of the rest meditating to regain your ki points.\n" + 
				"\n" + 
				"Some of your ki features require your target to make a saving throw to resist the feature's effects. The saving throw DC is calculated as follows:\n" + 
				"\n" + 
				"Ki save DC = 8 + your proficiency bonus + your Wisdom modifier");
	}
}

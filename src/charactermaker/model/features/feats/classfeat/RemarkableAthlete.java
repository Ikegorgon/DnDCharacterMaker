package charactermaker.model.features.feats.classfeat;

public class RemarkableAthlete extends ClassFeats{
	public RemarkableAthlete() {
		super("Remarkable Athlete", "Fighter", "Level 7, Champion");
		this.setDescription("Starting at 7th level, you can add half your proficiency bonus (round up) to any Strength, Dexterity, or Constitution check you make that doesn't already use your proficiency bonus.\n" + 
				"\n" + 
				"In addition, when you make a running long jump, the distance you can cover increases by a number of feet equal to your Strength modifier.\n" + 
				"\n" + 
				"");
	}
}

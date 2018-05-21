package charactermaker.model.features.feats.classfeat;

public class CleansingTouch extends ClassFeats{
	public CleansingTouch() {
		super("Cleansing Touch", "Paladin", "Level 14");
		this.setDescription("Beginning at 14th level, you can use your action to end one spell on yourself or on one willing creature that you touch.\n" + 
				"\n" + 
				"You can use this feature a number of times equal to your Charisma modifier (a minimum of once). You regain expended uses when you finish a long rest.");
	}
}

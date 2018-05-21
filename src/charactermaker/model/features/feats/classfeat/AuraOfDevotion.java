package charactermaker.model.features.feats.classfeat;

public class AuraOfDevotion extends ClassFeats{
	public AuraOfDevotion() {
		super("Aura of Devotion", "Paladin", "Level 7, Oath of Devotion");
		this.setDescription("Starting at 7th level, you and friendly creatures within 10 feet of you can't be charmed while you are conscious.\n" + 
				"At 18th level, the range of this aura increases to 30 feet.");
	}
}

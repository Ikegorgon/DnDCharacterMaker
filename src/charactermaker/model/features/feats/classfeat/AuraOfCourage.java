package charactermaker.model.features.feats.classfeat;

public class AuraOfCourage extends ClassFeats{
	public AuraOfCourage() {
		super("Aura of Courage", "Paladin", "Level 10");
		this.setDescription("Starting at 10th level, you and friendly creatures within 10 feet of you can't be frightened while you are conscious.\n" + 
				"\n" + 
				"At 18th level, the range of this aura increases to 30 feet.");
	}
}

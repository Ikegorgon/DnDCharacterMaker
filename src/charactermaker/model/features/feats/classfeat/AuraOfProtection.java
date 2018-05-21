package charactermaker.model.features.feats.classfeat;

public class AuraOfProtection extends ClassFeats{
	public AuraOfProtection() {
		super("Aura of Protection", "Paladin", "Level 6");
		this.setDescription("Starting at 6th level, whenever you or a friendly creature within 10 feet of you must make a saving throw, the creature gains a bonus to the saving throw equal to your Charisma modifier (with a minimum bonus of +1). You must be conscious to grant this bonus.\n" + 
				"\n" + 
				"At 18th level, the range of this aura increases to 30 feet.\n" + 
				"\n" + 
				"");
	}
}

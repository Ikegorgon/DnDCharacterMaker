package charactermaker.model.features.feats.classfeat;

public class BrutalCritical extends ClassFeats{
	public BrutalCritical() {
		super("Brutal Critical", "Barbarian", "Level 9");
		this.setDescription("Beginning at 9th level, you can roll one additional weapon damage die when determining the extra damage for a critical hit with a melee attack.\n" + 
				"\n" + 
				"This increases to two additional dice at 13th level and three additional dice at 17th level.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class Expertise extends ClassFeats{
	public Expertise() {
		super("Expertise", "Bard, Rogue", "Level 3 (Bard), Level 1 (Rogue)");
		this.setDescription("At 3rd level, choose two of your skill proficiencies. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies.\n" + 
				"\n" + 
				"At 10th level, you can choose another two skill proficiencies to gain this benefit.");
	}
}

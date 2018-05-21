package charactermaker.model.features.feats.classfeat;

public class Survivor extends ClassFeats{
	public Survivor() {
		super("Survivor", "Fighter", "Level 18, Champion");
		this.setDescription("At 18th level, you attain the pinnacle of resilience in battle. At the start of each of your turns, you regain hit points equal to 5 + your Constitution modifier if you have no more than half of your hit points left. You don't gain this benefit if you have 0 hit points.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class MagicalSecrets extends ClassFeats{
	public MagicalSecrets() {
		super("Magical Secrets", "Bard", "Level 10");
		this.setDescription("By 10th level, you have plundered magical knowledge from a wide spectrum of disciplines. Choose two spells from any class, including this one. A spell you choose must be of a level you can cast, as shown on the Bard table, or a cantrip.\n" + 
				"\n" + 
				"The chosen spells count as bard spells for you and are included in the number in the Spells Known column of the Bard table.\n" + 
				"\n" + 
				"You learn two additional spells from any class at 14th level and again at 18th level.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class DiamondSoul extends ClassFeats{
	public DiamondSoul() {
		super("Diamond Soul", "Monk", "Level 14");
		this.setDescription("Beginning at 14th level, your mastery of ki grants you proficiency in all saving throws.\n" + 
				"\n" + 
				"Additionally, whenever you make a saving throw and fail, you can spend 1 ki point to reroll it and take the second result.");
	}
}

package charactermaker.model.features.feats.general;

public class Resilient extends GeneralFeats {
	public Resilient() {
		super("Resilient", "-");
		this.setDescription("Choose one ability score. You gain the following benefits: \n" + 
				"Increase the chosen ability score by 1, to a maximum of20.\n" + 
				"You gain proficiency in saving throws using the chosen ability.\n" + 
				"");
	}
}

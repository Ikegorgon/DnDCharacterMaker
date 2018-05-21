package charactermaker.model.features.feats.general;

public class Durable extends GeneralFeats {
	public Durable() {
		super("Durable", "-");
		this.setDescription("Hardy and resilient, you gain the following benefits: \n" + 
				"Increase your Constitution score by I, to a maximum of 20. \n" + 
				"When you roll a Hit Die to regain hit points, the minimum number of hit points you regain from the roll equals twice your Constitution modifier (minimum of 2).\n" + 
				"");
	}
}

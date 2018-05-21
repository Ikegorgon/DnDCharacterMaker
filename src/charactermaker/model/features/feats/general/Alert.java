package charactermaker.model.features.feats.general;

public class Alert extends GeneralFeats {
	public Alert() {
		super("Alert", "-");
		this.setDescription("Always on the lookout for danger, you gain the following benefits: \n" + 
				"You gain a +5 bonus to initiative.\n" + 
				"You can't be surprised while you are conscious. Other creatures don't gain advantage on attack rolls against you as a result of being hidden from you. ");
	}
}

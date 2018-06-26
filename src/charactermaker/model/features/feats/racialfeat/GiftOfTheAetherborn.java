package charactermaker.model.features.feats.racialfeat;

public class GiftOfTheAetherborn extends RacialFeats{
	public GiftOfTheAetherborn() {
		super("Gift of the Aetherborn", "Aetherborn");
		this.setDescription("At the DM’s option, an aetherborn character can research methods of achieving a dark “gift.” The process is similar to inventing and manufacturing a rare magic item. But rather than aether, the process requires a variety of rare unguents and unusual ingredients that make up the cost of researching and undergoing the transformation.\n" + 
				"\n" + 
				"An aetherborn with this gift gains the Drain Life ability: a natural attack that deals 1d6 necrotic damage and restores the same number of hit points to the aetherborn. However, if the aetherborn goes for 7 days without dealing this damage, their hit point maximum is reduced by 1d6 per week. This reduction can’t be removed until the aetherborn has used their Drain Life ability and completed a long rest.");
	}
}

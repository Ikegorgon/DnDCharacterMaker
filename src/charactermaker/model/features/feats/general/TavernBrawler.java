package charactermaker.model.features.feats.general;

public class TavernBrawler extends GeneralFeats {
	public TavernBrawler() {
		super("Tavern Brawler", "-");
		this.setDescription("Accustomed to rough-and-tumble fighting using whatever weapons happen to be at hand, you gain the following benefits: \n" + 
				"Increase your Strength or Constitution score by 1, to a maximum of 20.\n" + 
				"You are proficient with improvised weapons and unarmed strikes. \n" + 
				"Your unarmed strike uses a d4 for damage.\n" + 
				"When you hit a creature with an unarmed strike or an improvised weapon on your turn, you can use a bonus action to attempt to grapple the target. \n" + 
				"");
	}
}

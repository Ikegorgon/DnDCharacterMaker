package charactermaker.model.features.feats.backgroundfeat;

public class MilitaryRank extends BackgroundFeats{
	public MilitaryRank() {
		super("Military Rank", "Soldier");
		this.setDescription("You have a military rank from your career as a soldier. Soldiers loyal to your former military organization\n" + 
				"still recognize your authority and influence, and they defer to you if they are of a lower rank. You can invoke your rank to exert influence over other soldiers and requisition simple equipment or horses for temporary use. You can also usually gain access to friendly military encampments and fortresses where your\n" + 
				"rank is recognized.");
	}
}

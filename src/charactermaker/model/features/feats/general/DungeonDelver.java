package charactermaker.model.features.feats.general;

public class DungeonDelver extends GeneralFeats {
	public DungeonDelver() {
		super("Dungeon Delver", "-");
		this.setDescription("Alert to the hidden traps and secret doors found in many dungeons, you gain the following benefits: \n" + 
				"You have advantage on Wisdom (Perception) and Intelligence (Investigation) checks made to detect the presence of secret doors,\n" + 
				"You have advantage on saving throws made to avoid or resist traps. \n" + 
				"You have resistance to the damage dealt by traps. You can search for traps while traveling at a normal pace, instead of only at a slow pace.\n" + 
				"");
	}
}

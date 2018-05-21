package charactermaker.model.features.feats.general;

public class MediumArmorMaster extends GeneralFeats {
	public MediumArmorMaster() {
		super("Medium Armor Master", "Proficiency with medium armor");
		this.setDescription("You have practiced moving in medium armor to gain the following benefits: \n" + 
				"Wearing medium armor doesn't impose disadvantage on your Dexterity (Stealth) checks.\n" + 
				"When you wear medium armor, you can add 3, rather than 2, to your AC if you have a Dexterity of 16 or higher. \n" + 
				"");
	}
}

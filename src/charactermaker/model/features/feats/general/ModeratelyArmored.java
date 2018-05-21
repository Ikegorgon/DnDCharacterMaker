package charactermaker.model.features.feats.general;

public class ModeratelyArmored extends GeneralFeats {
	public ModeratelyArmored() {
		super("Moderately Armored", "Proficiency with light armor");
		this.setDescription("You have trained to master the use of medium armor and shields, gaining the following benefits: \n" + 
				"Increase your Strength or Dexterity score by 1, to a maximum of 20.\n" + 
				"You gain proficiency with medium armor and shields.\n" + 
				"");
	}
}

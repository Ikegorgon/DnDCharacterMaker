package charactermaker.model.features.feats.general;

public class WeaponMaster extends GeneralFeats {
	public WeaponMaster() {
		super("Weapon Master", "-");
		this.setDescription("You have practiced extensively with a variety of weapons, gaining the following benefits: \n" + 
				"Increase your Strength or Dexterity score by 1, lo a maximum of 20.\n" + 
				"You gain proficiency with four weapons of your choice.\n" + 
				"");
	}
}

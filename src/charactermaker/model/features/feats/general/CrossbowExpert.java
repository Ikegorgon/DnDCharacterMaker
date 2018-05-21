package charactermaker.model.features.feats.general;

public class CrossbowExpert extends GeneralFeats {
	public CrossbowExpert() {
		super("Crossbow Expert", "-");
		this.setDescription("Thanks to extensive practice with the crossbow, you gain the following benefits:\n" + 
				"Vou ignore the loading quality of crossbows with which you are proficient.\n" + 
				"Being within 5 feet of a hostile creature doesn't\n" + 
				"impose disadvantage on your ranged attack rolls. When you use the Attack action and attack with a one- handed weapon, you can use a bonus action to attack with a loaded hand crossbow you are holding.");
	}
}

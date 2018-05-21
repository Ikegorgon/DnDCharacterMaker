package charactermaker.model.features.feats.general;

public class HeavyArmorMaster extends GeneralFeats {
	public HeavyArmorMaster() {
		super("Heavy Armor Master", "Proficiency with heavy armor");
		this.setDescription("You can use your armor to deflect strikes that would kill others. You gain the following benefits: \n" + 
				"Increase your Strength score by 1, to a maximum of 20. While you are wearing heavy armor, bludgeoning. piercing, and slashing damage that you take from non- magical weapons is reduced by 3. \n" + 
				"");
	}
}

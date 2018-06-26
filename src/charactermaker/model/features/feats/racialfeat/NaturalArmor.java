package charactermaker.model.features.feats.racialfeat;

public class NaturalArmor extends RacialFeats{
	public NaturalArmor() {
		super("Natural Armor", "Lizardfolk");
		this.setDescription("You have tough, scaly skin. When you aren't wearing armor, your AC is 13 + your Dexterity modifier. You can use your natural armor to determine your AC if the armor you wear would leave you with a lower AC. A shield's benefits apply as normal while you use your natural armor.");
	}
}

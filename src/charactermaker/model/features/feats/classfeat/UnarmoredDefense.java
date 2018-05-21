package charactermaker.model.features.feats.classfeat;

public class UnarmoredDefense extends ClassFeats{
	public UnarmoredDefense() {
		super("Unarmored Defense", "Barbarian, Monk", "-");
		this.setDescription("While you are not wearing any armor, your Armor Class equals 10 + your Dexterity modifier + your Constitution modifier. You can use a shield and still gain this benefit.");
	}
}

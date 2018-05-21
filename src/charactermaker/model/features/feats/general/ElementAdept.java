package charactermaker.model.features.feats.general;

public class ElementAdept extends GeneralFeats {
	public ElementAdept() {
		super("Element Adept", "The ability to cast at least one spell");
		this.setDescription("When you gain this feat, choose one of the following damage types: acid, cold, fire, lightning, or thunder. \n" + 
				"Spells you cast ignore resistance to damage of the chosen type. In addition, when you roll damage for a spell you cast that deals damage of that type, you can treat any 1 on a damage die as a 2. \n" + 
				"You can select this feat multiple times. Each time you do so, you must choose a different damage type. \n" + 
				"");
	}
}

package charactermaker.model.features.feats.classfeat;

public class DivineIntervention extends ClassFeats{
	public DivineIntervention() {
		super("Divine Intervention", "Cleric", "Level 10");
		this.setDescription("Beginning at 10th level, you can call on your deity to intervene on your behalf when your need is great.\n" + 
				"\n" + 
				"Imploring your deity's aid requires you to use your action. Describe the assistance you seek, and roll percentile dice. If you roll a number equal to or lower than your cleric level, your deity intervenes. The GM chooses the nature of the intervention; the effect of any cleric spell or cleric domain spell would be appropriate.\n" + 
				"\n" + 
				"If your deity intervenes, you can't use this feature again for 7 days. Otherwise, you can use it again after you finish a long rest.\n" + 
				"\n" + 
				"At 20th level, your call for intervention succeeds automatically, no roll required.");
	}
}

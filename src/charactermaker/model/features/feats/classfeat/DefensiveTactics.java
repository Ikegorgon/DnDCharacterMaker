package charactermaker.model.features.feats.classfeat;

public class DefensiveTactics extends ClassFeats{
	public DefensiveTactics() {
		super("Defensive Tatics", "Ranger", "Level 7, Hunter");
		this.setDescription("At 7th level, you gain one of the following features of your choice.\n" + 
				"\n" + 
				"Escape the Horde. Opportunity attacks against you are made with disadvantage.\n" + 
				"\n" + 
				"Multiattack Defense. When a creature hits you with an attack, you gain a +4 bonus to AC against all subsequent attacks made by that creature for the rest of the turn.\n" + 
				"\n" + 
				"Steel Will. You have advantage on saving throws against being frightened.");
	}
}

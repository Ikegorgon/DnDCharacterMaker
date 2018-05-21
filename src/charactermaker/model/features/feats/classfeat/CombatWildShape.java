package charactermaker.model.features.feats.classfeat;

public class CombatWildShape extends ClassFeats{
	public CombatWildShape() {
		super("Combat Wild Shape", "Druid", "Level 2, Circle of the Moon");
		this.setDescription("At 2nd level, you gain the ability to use Wild Shape on your turn as a bonus action, rather than an action.\n" + 
				"\n" + 
				"Additionally, when you are transformed by Wild Shape, you can use a bonus action to expend one spell slot to regain 1d8 hit points per level of the spell slot expended.");
	}
}

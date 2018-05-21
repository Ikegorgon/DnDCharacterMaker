package charactermaker.model.features.feats.classfeat;

public class DivineSmite extends ClassFeats{
	public DivineSmite() {
		super("Divine Smite", "Paladin", "Level 2");
		this.setDescription("Starting at 2nd level, when you hit a creature with a melee weapon attack, you can expend one spell slot to deal radiant damage to the target, in addition to the weapon's damage. The extra damage is 2d8 for a 1st-level spell slot, plus 1d8 for each spell level higher than 1st, to a maximum of 5d8. The damage increases by 1d8 if the target is an undead or a fiend.");
	}
}

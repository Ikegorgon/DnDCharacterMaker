package charactermaker.model.features.feats.classfeat;

public class Shapechanger extends ClassFeats{
	public Shapechanger() {
		super("Shapechanger", "Wizard", "Level 10, School of Transmutation");
		this.setDescription("At 10th level, you add the polymorph spell to your spellbook, if it is not there already. You can cast polymorph without expending a spell slot. When you do so, you can target only yourself and transform into a beast whose challenge rating is 1 or lower.\n" + 
				"\n" + 
				"Once you cast polymorph in this way, you can't do so again until you finish a short or long rest, though you can still cast it normally using an available spell slot.");
	}
}

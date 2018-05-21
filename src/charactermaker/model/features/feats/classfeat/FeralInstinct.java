package charactermaker.model.features.feats.classfeat;

public class FeralInstinct extends ClassFeats{
	public FeralInstinct() {
		super("Feral Instinct", "Barbarian", "Level 7");
		this.setDescription("By 7th level, your instincts are so honed that you have advantage on initiative rolls.\n" + 
				"\n" + 
				"Additionally, if you are surprised at the beginning of combat and aren't incapacitated, you can act normally on your first turn, but only if you enter your rage before doing anything else on that turn.");
	}
}

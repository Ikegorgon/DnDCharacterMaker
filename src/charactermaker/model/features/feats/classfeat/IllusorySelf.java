package charactermaker.model.features.feats.classfeat;

public class IllusorySelf extends ClassFeats{
	public IllusorySelf() {
		super("Illusory Self", "Wizard", "Level 10, School of Illusion");
		this.setDescription("Beginning at 10th level, you can create an illusory duplicate of yourself as an instant, almost instinctual reaction to danger. When a creature makes an attack roll against you, you can use your reaction to interpose the illusory duplicate between the attacker and yourself. The attack automatically misses you, then the illusion dissipates.\n" + 
				"\n" + 
				"Once you use this feature, you can't use it again until you finish a short or long rest.");
	}
}

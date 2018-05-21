package charactermaker.model.features.feats.classfeat;

public class BenignTransposition extends ClassFeats{
	public BenignTransposition() {
		super("Benign Transposition", "Wizard", "Level 6, School of Conjuration");
		this.setDescription("Starting at 6th level, you can use your full action to teleport up to 10 metres to an unoccupied space that you can see. Alternatively, you can choose a space within range that is occupied by a Small or Medium creature. If that creature is willing, you both teleport, swapping places.\n" + 
				"\n" + 
				"Once you use this feature, you can't use it again until you finish a long rest or you cast a conjuration spell of 1st level or higher.");
	}
}

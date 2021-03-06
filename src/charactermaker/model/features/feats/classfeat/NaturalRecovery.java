package charactermaker.model.features.feats.classfeat;

public class NaturalRecovery extends ClassFeats{
	public NaturalRecovery() {
		super("Natural Recovery", "Druid", "Level 2, Circle of the Land");
		this.setDescription("Starting at 2nd level, you can regain some of your magical energy by sitting in meditation and communing with nature. During a short rest, you choose expended spell slots to recover. The spell slots can have a combined level that is equal to or less than half your druid level (rounded up), and none of the slots can be 6th level or higher. You can't use this feature again until you finish a long rest.\n" + 
				"\n" + 
				"For example, when you are a 4th-level druid, you can recover up to two levels worth of spell slots. You can recover either a 2nd-level slot or two 1st-level slots.");
	}
}

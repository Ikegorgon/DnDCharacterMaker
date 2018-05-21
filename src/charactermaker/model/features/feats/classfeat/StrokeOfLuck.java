package charactermaker.model.features.feats.classfeat;

public class StrokeOfLuck extends ClassFeats{
	public StrokeOfLuck() {
		super("Stroke of Luck", "Rogue", "Level 20");
		this.setDescription("At 20th level, you have an uncanny knack for succeeding when you need to. If your attack misses a target within range, you can turn the miss into a hit. Alternatively, if you fail an ability check, you can treat the d20 roll as a 20.\n" + 
				"\n" + 
				"Once you use this feature, you can't use it again until you finish a short or long rest.");
	}
}

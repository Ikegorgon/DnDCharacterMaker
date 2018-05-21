package charactermaker.model.features.feats.classfeat;

public class FeyPresence extends ClassFeats{
	public FeyPresence() {
		super("Fey Presence", "Warlock", "Level 1, The Archfey");
		this.setDescription("Starting at 1st level, your patron bestows upon you the ability to project the beguiling and fearsome presence of the fey. As an action, you can cause each creature in a 10-foot cube originating from you to make a Wisdom saving throw against your warlock spell save DC. The\n" + 
				"creatures that fail their saving throws are all charmed or frightened by you (your choice) until the end of your next turn.\n" + 
				"\n" + 
				"Once you use this feature, you can't use it again until you finish a short or long rest.");
	}
}

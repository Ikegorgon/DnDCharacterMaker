package charactermaker.model.features.feats.classfeat;

public class DarkDelirium extends ClassFeats{
	public DarkDelirium() {
		super("Dark Delirium", "Warlock", "Level 14, The Archfey");
		this.setDescription("Starting at 14th level, you can plunge a creature into an illusory realm. As an action, choose a creature that you can see within 60 feet of YOU.It must make a Wisdom saving throw against your warlock spell save DC. On a failed save, it is charmed or frightened by you\n" + 
				"(your choice) for 1 minute or until your concentration is broken (as if you are concentrating on a spell). This effect ends early if the creature takes any damage. Until this illusion ends, the creature thinks it is lost in a misty realm, the appearance of which you choose.\n" + 
				"The creature can see and hear only itself, you, and the illusion. You must finish a short or long rest before you can use this feature again.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class BeguilingDefenses extends ClassFeats{
	public BeguilingDefenses() {
		super("Beguiling Defenses", "Warlock", "The Archfey");
		this.setDescription("Beginning at 10th level, your patron teaches you how to turn the mind-affecting magic of your enemies against them. You are immune to being charmed, and when another creature attempts to charm you, you can use your reaction to attempt to turn the charm back on\n" + 
				"that creature. The creature must succeed on a Wisdom saving throw against your warlock spell save DC or be charmed by you for 1 minute or until the creature takes any damage.");
	}
}

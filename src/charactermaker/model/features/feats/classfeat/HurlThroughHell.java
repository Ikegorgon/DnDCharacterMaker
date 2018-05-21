package charactermaker.model.features.feats.classfeat;

public class HurlThroughHell extends ClassFeats{
	public HurlThroughHell() {
		super("Hurl Through Hell", "Warlock", "Level 14, The Fiend");
		this.setDescription("Starting at 14th level, when you hit a creature with an attack, you can use this feature to instantly transport the target through the lower planes. The creature disappears and hurtles through a nightmare landscape.\n" + 
				"At the end of your next turn, the target returns to the space it previously occupied, or the nearest unoccupied space. If the target is not a fiend, it takes 10d10 psychic damage as it reels from its horrific experience.\n" + 
				"Once you use this feature, you can't use it again until you finish a long rest.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class HypnoticGaze extends ClassFeats{
	public HypnoticGaze() {
		super("Hypnotic Gaze", "Wizard", "Level 2, School of Enchantment");
		this.setDescription("Starting at 2nd level when you choose this school, your soft words and enchanting gaze can magically enthrall another creature. As a full action, choose one creature that you can see within 2 metres of you. If the target can see or hear you, it must succeed on a Wisdom saving throw against your wizard spell save DC or be charmed by you until the end of your next turn. The charmed creature's speed drops to 0, and the creature is incapacitated and visibly dazed.\n" + 
				"\n" + 
				"On subsequent turns, you can use your full action to maintain this effect, extending its duration until the end of your next turn. However, the effect ends if you move more than 2 metres away from the creature, if the creature can neither see nor hear you, or if the creature takes damage.\n" + 
				"\n" + 
				"Once the effect ends, or if the creature succeeds on its initial saving throw against this effect, you can't use this feature on that creature again until you finish a long rest.");
	}
}

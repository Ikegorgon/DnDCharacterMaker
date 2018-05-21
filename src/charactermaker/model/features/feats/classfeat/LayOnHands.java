package charactermaker.model.features.feats.classfeat;

public class LayOnHands extends ClassFeats{
	public LayOnHands() {
		super("Lay on Hands", "Paladin", "-");
		this.setDescription("Your blessed touch can heal wounds. You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level × 5.\n" + 
				"\n" + 
				"As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool.\n" + 
				"\n" + 
				"Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one.\n" + 
				"\n" + 
				"This feature has no effect on undead and constructs.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class Overchannel extends ClassFeats{
	public Overchannel() {
		super("Overchannel", "Wizard", "Level 14, School of Evocation");
		this.setDescription("Starting at 14th level, you can increase the power of your simpler spells. When you cast a wizard spell of 1st through 5th level that deals damage, you can deal maximum damage with that spell.\n" + 
				"\n" + 
				"The first time you do so, you suffer no adverse effect. If you use this feature again before you finish a long rest, you take 2d12 necrotic damage for each level of the spell, immediately after you cast it. Each time you use this feature again before finishing a long rest, the necrotic damage per spell level increases by 1d12. This damage ignores resistance and immunity.");
	}
}

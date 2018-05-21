package charactermaker.model.features.feats.classfeat;

public class QuiveringPalm extends ClassFeats{
	public QuiveringPalm() {
		super("Quivering Palm", "Monk", "Level 17, Way of the Open Hand");
		this.setDescription("At 17th level, you gain the ability to set up lethal vibrations in someone's body. When you hit a creature with an unarmed strike, you can spend 3 ki points to start these imperceptible vibrations, which last for a number of days equal to your monk level. The vibrations are harmless unless you use your action to end them. To do so, you and the target must be on the same plane of existence. When you use this action, the creature must make a Constitution saving throw. If it fails, it is reduced to 0 hit points. If it succeeds, it takes 10d10 necrotic damage.\n" + 
				"You can have only one creature under the effect of this feature at a time. You can choose to end the vibrations harmlessly without using an action.");
	}
}

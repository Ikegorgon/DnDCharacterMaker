package charactermaker.model.features.feats.racialfeat;

public class RelentlessNature extends RacialFeats{
	public RelentlessNature() {
		super("Relentless Nature", "Revenant");
		this.setDescription("You gain the following benefits so long as your goal is incomplete.\n" + 
				"If you are below half your hit point maximum at the start of your turn, you regain 1 hit point.\n" + 
				"If you die, you return to life 24 hours after death. If your body is destroyed, you reform within 1 mile of the place of your death at a spot determined by the DM. If your equipment was also destroyed, you do not regain it.\n" + 
				"You know the distance and direction between you and any creature involved in your goal, such as a person you seek vengeance against or someone you pledged to defend. This awareness fails if the creature is on another plane of existence.");
	}
}

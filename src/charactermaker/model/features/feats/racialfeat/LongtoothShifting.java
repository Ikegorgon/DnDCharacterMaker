package charactermaker.model.features.feats.racialfeat;

public class LongtoothShifting extends RacialFeats{
	public LongtoothShifting() {
		super("Longtooth Shifting", "Longtooth Shifter");
		this.setDescription("While shifting, you regenerate hit points at the start of your turns equal to your Proficiency Bonus. In addition, you grow long fangs which allow you to use your bite as a light melee weapon which deals 1d6 piercing damage. You also add 1d4 to the damage of the first Strength-based attack that you perform after shifting.\n" + 
				"At 5th level, if your bite attacks hit a creature that is your size or smaller, that creature is grappled.");
	}
}

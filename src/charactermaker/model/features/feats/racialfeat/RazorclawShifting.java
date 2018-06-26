package charactermaker.model.features.feats.racialfeat;

public class RazorclawShifting extends RacialFeats{
	public RazorclawShifting() {
		super("Razorclaw Shifting", "Razorclaw Shifter");
		this.setDescription("When you shift, your speed increases to 35 feet.\n" + 
				"\n" + 
				"You also have advantage on Dexterity saving throws while on this state, as long as you are not wearing heavy armor.\n" + 
				"In addition, you grow a pair of claws which can function as light, finesse, melee weapons which deal 1d6 slashing damage.\n" + 
				"At 5th level, you can now make an attack with your claws as a bonus action while in your shift state.");
	}
}

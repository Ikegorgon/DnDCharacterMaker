package charactermaker.model.features.feats.general;

public class DefensiveDuelist extends GeneralFeats {
	public DefensiveDuelist() {
		super("Defensive Duelist", "Dexterity 13 or higher");
		this.setDescription("When you are wielding a finesse weapon with which you are proficient and another creature hits you with\n" + 
				"a melee attack, you can use your reaction to add your proficiency bonus to your AC for that attack, potentially causing the attack to miss you.\n" + 
				"");
	}
}

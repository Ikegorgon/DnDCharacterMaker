package charactermaker.model.features.feats.general;

public class Charger extends GeneralFeats {
	public Charger() {
		super("Charger", "-");
		this.setDescription("When you use your action to Dash, you can use a bonus action to make one melee weapon attack or to shove a creature. \n" + 
				"If you move at least 10 feet in a straight tine immediately before taking this bonus action, you either gain a +5 bonus to the attack's damage roll (if you chose to make a melee attack and hit) or push the target up\n" + 
				"to 10 feet away from you (if you chose to shove and\n" + 
				"you succeed).\n" + 
				"");
	}
}

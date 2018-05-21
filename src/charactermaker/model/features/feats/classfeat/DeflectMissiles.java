package charactermaker.model.features.feats.classfeat;

public class DeflectMissiles extends ClassFeats{
	public DeflectMissiles() {
		super("Deflect Missiles", "Monk", "Level 3");
		this.setDescription("Starting at 3rd level, you can use your reaction to deflect or catch the missile when you are hit by a ranged weapon attack. When you do so, the damage you take from the attack is reduced by 1d10 + your Dexterity modifier + your monk level.\n" + 
				"\n" + 
				"If you reduce the damage to 0, you can catch the missile if it is small enough for you to hold in one hand and you have at least one hand free. If you catch a missile in this way, you can spend 1 ki point to make a ranged attack with the weapon or piece of ammunition you just caught, as part of the same reaction. You make this attack with proficiency, regardless of your weapon proficiencies, and the missile counts as a monk weapon for the attack, which has a normal range of 20 feet and a long range of 60 feet.");
	}
}

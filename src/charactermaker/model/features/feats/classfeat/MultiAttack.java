package charactermaker.model.features.feats.classfeat;

public class MultiAttack extends ClassFeats{
	public MultiAttack() {
		super("Multi Attack", "Ranger", "Level 11, Hunter");
		this.setDescription("At 11th level, you gain one of the following features of your choice.\n" + 
				"\n" + 
				"Volley. You can use your action to make a ranged attack against any number of creatures within 10 feet of a point you can see within your weapon's range. You must have ammunition for each target, as normal, and you make a separate attack roll for each target.\n" + 
				"\n" + 
				"Whirlwind Attack. You can use your action to make a melee attack against any number of creatures within 5 feet of you, with a separate attack roll for each target.");
	}
}

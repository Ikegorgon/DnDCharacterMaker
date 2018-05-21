package charactermaker.model.features.feats.classfeat;

public class SuperiorHuntersDefense extends ClassFeats{
	public SuperiorHuntersDefense() {
		super("Superior Hunter's Defense", "Ranger", "Level 15, Hunter");
		this.setDescription("At 15th level, you gain one of the following features of your choice.\n" + 
				"\n" + 
				"Evasion. When you are subjected to an effect, such as a red dragon's fiery breath or a lightning bolt spell, that allows you to make a Dexterity saving throw to take only half damage, you instead take no damage if you succeed on the saving throw, and only half damage if you fail.\n" + 
				"\n" + 
				"Stand Against the Tide. When a hostile creature misses you with a melee attack, you can use your reaction to force that creature to repeat the same attack against another creature (other than itself) of your choice.\n" + 
				"\n" + 
				"Uncanny Dodge. When an attacker that you can see hits you with an attack, you can use your reaction to halve the attack's damage against you.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class ED_WaterWhip extends ClassFeats{
	public ED_WaterWhip() {
		super("Elemental Disciplines: Water Whip", "Monk", "Level 3, Way of the Four Elements");
		this.setDescription("You can spend 2 ki points as a bonus action to create a whip of water that shoves and pulls\n" + 
				"a creature to unbalance it. A creature that you can see that is within 30 feet of you must make a Dexterity saving throw. On a failed save, the creature takes 3d10 bludgeoning damage, plus an extra 1d10 bludgeoning damage for each additional ki point you spend, and you can either knock it prone or pull it up to 25 feet closer to you. On a successful save, the creature takes half as much damage, and you don't pull it or knock it prone.");
	}
}

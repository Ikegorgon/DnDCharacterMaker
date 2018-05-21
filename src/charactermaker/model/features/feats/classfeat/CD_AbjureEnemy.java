package charactermaker.model.features.feats.classfeat;

public class CD_AbjureEnemy extends ClassFeats{
	public CD_AbjureEnemy() {
		super("Channel Divinity: Abjure Enemy", "Paladin", "Level 3, Oath of Vengeance");
		this.setDescription("As an action, you present your holy symbol and speak a prayer of denunciation, using your Channel Divinity. Choose one creature within 60 feet of you that you can see. That creature must make a Wisdom saving throw, unless it is immune to being frightened. Fiends and undead have disadvantage on this saving throw. \n" + 
				"On a failed save, the creature is frightened for I minute or until It takes any damage. While frightened, the creature's speed is 0, and It can't benefit from any bonus to its speed. \n" + 
				"On a successful save, the creature’s speed is halved for I minute or until the creature takes any damage.");
	}
}

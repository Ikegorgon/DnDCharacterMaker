package charactermaker.model.features.feats.classfeat;

public class OpenHandTechnique extends ClassFeats{
	public OpenHandTechnique() {
		super("Open Hand Technique", "Monk", "Level 3, Way of the Open Hand");
		this.setDescription("Starting when you choose this tradition at 3rd level, you can manipulate your enemy's ki when you harness your own. Whenever you hit a creature with one of the attacks granted by your Flurry of Blows, you can impose one of the following effects on that target:\n" + 
				"\n" + 
				"It must succeed on a Dexterity saving throw or be knocked prone.\n" + 
				"It must make a Strength saving throw. If it fails, you can push it up to 15 feet away from you.\n" + 
				"It can't take reactions until the end of your next turn.");
	}
}

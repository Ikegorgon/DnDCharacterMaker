package charactermaker.model.features.feats.classfeat;

public class CreateThrall extends ClassFeats{
	public CreateThrall() {
		super("Create Thrall", "Warlock", "Level 14, The Great Old One");
		this.setDescription("At 14th level, you gain the ability to infect a humanoid's mind with the alien magic of your patron. You can use your action to touch an incapacitated humanoid. That creature is then charmed by you until a remove curse spell is cast on it, the charmed condition is removed\n" + 
				"from it, or you use this feature again. You can communicate telepathically with the charmed creature as long as the two of you are on the same plane existence.");
	}
}

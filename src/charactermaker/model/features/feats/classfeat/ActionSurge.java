package charactermaker.model.features.feats.classfeat;

public class ActionSurge extends ClassFeats{
	public ActionSurge() {
		super("Action Surge","Fighter", "Level 2");
		this.setDescription("Starting at 2nd level, you can push yourself beyond your normal limits for a moment. On your turn, you can take one additional action on top of your regular action and a possible bonus action.\n" + 
				"\n" + 
				"Once you use this feature, you must finish a short or long rest before you can use it again. Starting at 17th level, you can use it twice before a rest, but only once on the same turn.");
	}
}

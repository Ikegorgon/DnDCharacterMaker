package charactermaker.model.features.feats.classfeat;

public class SecondWind extends ClassFeats{
	public SecondWind() {
		super("Second Wind", "Fighter", "-");
		this.setDescription("You have a limited well of stamina that you can draw on to protect yourself from harm. On your turn, you can use a bonus action to regain hit points equal to 1d10 + your fighter level. Once you use this feature, you must finish a short or long rest before you can use it again.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class Protection extends ClassFeats{
	public Protection() {
		super("Protection", "Fighter", "-");
		this.setDescription("When a creature you can see attacks a target other than you that is within 5 feet of you,you can use your reaction to impose disadvantage on the attack roll. You must be wielding a shield.");
	}
}

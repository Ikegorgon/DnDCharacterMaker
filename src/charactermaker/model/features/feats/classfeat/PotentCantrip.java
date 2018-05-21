package charactermaker.model.features.feats.classfeat;

public class PotentCantrip extends ClassFeats{
	public PotentCantrip() {
		super("Potent Cantrip", "Wizard", "Level 6, School of Evocation");
		this.setDescription("Starting at 6th level, your damaging cantrips affect even creatures that avoid the brunt of the effect. When a creature succeeds on a saving throw against your cantrip, the creature takes half the cantrip's damage (if any) but suffers no additional effect from the cantrip.");
	}
}

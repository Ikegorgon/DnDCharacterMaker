package charactermaker.model.features.feats.classfeat;

public class TheThirdEye extends ClassFeats{
	public TheThirdEye() {
		super("The Third Eye", "Wizard", "Level 10, School of Divination");
		this.setDescription("Starting at 10th level, you can use your action to increase your powers of perception. When you do so, choose one of the following benefits, which lasts until you are incapacitated or you take a short or long rest. You can't use the feature again until you finish a rest.\n" + 
				"\n" + 
				"Darkvision. You gain darkvision out to a range of 60 feet, as described in chapter 8.\n" + 
				"Ethereal Sight. You can see into the Ethereal Plane within 60 feet of you.\n" + 
				"Greater Comprehension. You can read any language.\n" + 
				"See Invisibility. You can see invisible creatures and objects within 10 feet of you that are within line of sight.");
	}
}

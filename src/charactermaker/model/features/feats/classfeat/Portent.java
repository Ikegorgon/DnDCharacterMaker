package charactermaker.model.features.feats.classfeat;

public class Portent extends ClassFeats{
	public Portent() {
		super("Portent", "Wizard", "Level 2, School of Divination");
		this.setDescription("Starting at 2nd level when you choose this school, glimpses of the future begin to press in on your awareness. When you finish a long rest, roll two d20s and record the numbers rolled. You can replace any attack roll, saving throw, or ability check made by you or a creature that you can see with one of these foretelling rolls. You must choose to do so before the roll, and you can replace a roll in this way only once per turn\n" + 
				"Each foretelling roll can be used only once. When you finish a long rest, you lose any unused foretelling rolls.");
	}
}

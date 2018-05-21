package charactermaker.model.features.feats.general;

public class Athlete extends GeneralFeats {
	public Athlete() {
		super("Athlete", "-");
		this.setDescription("You have undergone extensive physical training to gain the following benefits: \n" + 
				"Increase your Strength or Dexterity score by 1, to a maximum of 20.\n" + 
				"When you are prone, standing up uses only 5 feet of your movement. Climbing doesn't halve your speed.\n" + 
				"You can make a running long jump or a running high jump after moving only 5 feet on foot, rather than 10 feet.");
	}
}

package charactermaker.model.features.feats.general;

public class Mobile extends GeneralFeats {
	public Mobile() {
		super("Mobile", "-");
		this.setDescription("You are exceptionally speedy and agile. You gain the following benefits: \n" + 
				"• Your speed increases by 10 feet. \n" + 
				"When you use the Dash action, difficult terrain doesn't cost you extra movement on that turn.\n" + 
				"When you make a melee attack against a creature, you don't provoke opportunity attacks from that creature for the rest of the turn, whether you hit or not.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class ThievesCant extends ClassFeats{
	public ThievesCant() {
		super("Thieves' Cant", "Rogue", "-");
		this.setDescription("During your rogue training you learned thieves' cant, a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves' cant understands such messages. It takes four times longer to convey such a message than it does to speak the same idea plainly.\n" + 
				"\n" + 
				"In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves' guild, whether loot is nearby, or whether the people in an area are easy marks or will provide a safe house for thieves on the run.");
	}
}

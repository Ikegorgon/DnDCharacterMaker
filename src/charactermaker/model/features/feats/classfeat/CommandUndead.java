package charactermaker.model.features.feats.classfeat;

public class CommandUndead extends ClassFeats{
	public CommandUndead() {
		super("Command Undead", "Wizard", "Level 14, School of Necromancy");
		this.setDescription("Starting at 14th level, you can use magic to bring undead under your control, even those created by other wizards. As an action, you can choose one undead that you can see within 60 feet of you. That creature must make a Charisma saving throw against your wizard spell save DC. If it succeeds, you can’t use this feature on it again. If it fails, it becomes friendly to you and obeys your commands until you use this feature again.\n" + 
				"\n" + 
				"Intelligent undead are harder to control in this way. If the target has an Intelligence of 8 or higher, it has advantage on the saving throw. If it fails the saving throw and has an Intelligence of 12 or higher, it can repeat the saving throw at the end of every hour until it succeeds and breaks free.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class RelentlessRage extends ClassFeats{
	public RelentlessRage() {
		super("Relentless Rage", "Barbarian", "Level 11");
		this.setDescription("Starting at 11th level, your rage can keep you fighting despite grievous wounds. If you drop to 0 hit points while you're raging and don't die outright, you can make a DC 10 Constitution saving throw. If you succeed, you drop to 1 hit point instead.\n" + 
				"\n" + 
				"Each time you use this feature after the first, the DC increases by 5. When you finish a short or long rest, the DC resets to 10.");
	}
}

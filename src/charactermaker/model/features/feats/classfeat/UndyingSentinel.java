package charactermaker.model.features.feats.classfeat;

public class UndyingSentinel extends ClassFeats{
	public UndyingSentinel() {
		super("Undying Sentinel", "Paladin", "Level 15, Oath of the Ancient");
		this.setDescription("Starting at 15th level, when you are reduced to 0 hit points and are not killed outright, you can choose to drop to 1 hit point instead. Once you use this ability, you can't use it again until you finish a long rest. \n" + 
				"Additionally, you suffer none of the drawbacks of old age, and you can't be aged magically.");
	}
}

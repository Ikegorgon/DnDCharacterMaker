package charactermaker.model.features.feats.classfeat;

public class SacredOath extends ClassFeats{
	public SacredOath() {
		super("Sacred Oath", "Paladin", "Level 3");
		this.setDescription("When you reach 3rd level, you swear the oath that binds you as a paladin forever. Up to this time you have been in a preparatory stage, committed to the path but not yet sworn to it. Now you choose an oath, such as the Oath of Devotion.\n" + 
				"\n" + 
				"Your choice grants you features at 3rd level and again at 7th, 15th, and 20th level. Those features include oath spells and the Channel Divinity feature.\n" + 
				"\n" + 
				"Oath Spells\n" + 
				"Each oath has a list of associated spells. You gain access to these spells at the levels specified in the oath description. Once you gain access to an oath spell, you always have it prepared. Oath spells don't count against the number of spells you can prepare each day.\n" + 
				"\n" + 
				"If you gain an oath spell that doesn't appear on the paladin spell list, the spell is nonetheless a paladin spell for you.\n" + 
				"\n" + 
				"Channel Divinity\n" + 
				"Your oath allows you to channel divine energy to fuel magical effects. Each Channel Divinity option provided by your oath explains how to use it.\n" + 
				"\n" + 
				"When you use your Channel Divinity, you choose which option to use. You must then finish a short or long rest to use your Channel Divinity again.\n" + 
				"\n" + 
				"Some Channel Divinity effects require saving throws. When you use such an effect from this class, the DC equals your paladin spell save DC.");
	}
}

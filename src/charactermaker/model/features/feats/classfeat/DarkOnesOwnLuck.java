package charactermaker.model.features.feats.classfeat;

public class DarkOnesOwnLuck extends ClassFeats{
	public DarkOnesOwnLuck() {
		super("Dark Ones Own Luck", "Warlock", "Level 6, The Fiend");
		this.setDescription("Starting at 6th level, you can call on your patron to alter fate in your favor. When you make an ability check or a saving throw, you can use this feature to add a d10 to your roll. You can do so after seeing the initial roll but before any of the roll's effects occur.\n" + 
				"Once you use this feature, you can't use it again until you finish a short or long rest.");
	}
}

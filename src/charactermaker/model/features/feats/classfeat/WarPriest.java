package charactermaker.model.features.feats.classfeat;

public class WarPriest extends ClassFeats{
	public WarPriest() {
		super("War Priest", "Cleric", "War Domain");
		this.setDescription("From 1st level, your god delivers bolts of inspiration to you while you are engaged in battle. When you use the Attack action, you can make one weapon attack as a bonus action.\n" + 
				"\n" + 
				"You can use this feature a number of times equal to your Wisdom modifier (a minimum of once). You regain all expended uses when you finish a long rest.");
	}
}

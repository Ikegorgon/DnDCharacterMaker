package charactermaker.model.features.feats.racialfeat;

public class KenderPockets extends RacialFeats{
	public KenderPockets() {
		super("Kender Pockets", "Kender");
		this.setDescription("Kender constantly pick things up and put them in their pockets, pouches, and bags, often immediately forgetting that they have done so. If you find yourself in need of a piece of nonmagical equipment, there is a 25 percent chance you have it.\n" + 
				"\n" + 
				"Roll a d4. If you roll a 4, you find the item in your pocket, pack, or pouch. If you roll anything else, you don’t have such an item on you, and you can’t search again for the same item until you’ve spent at least one day in a dungeon, village, town, or city. Rummaging through your pouches, pack, and pockets in this way takes 1 minute.");
	}
}

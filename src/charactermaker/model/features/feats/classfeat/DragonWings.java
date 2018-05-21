package charactermaker.model.features.feats.classfeat;

public class DragonWings extends ClassFeats{
	public DragonWings() {
		super("Dragon Wings", "Sorcerer", "Level 14, Draconic Ancestry");
		this.setDescription("At 14th level, you gain the ability to sprout a pair of dragon wings from your back, gaining a flying speed equal to your current speed. You can create these wings as a bonus action on your turn. They last until you dismiss them as a bonus action on your turn.\n" + 
				"\n" + 
				"You can't manifest your wings while wearing armor unless the armor is made to accommodate them, and clothing not made to accommodate your wings might be destroyed when you manifest them.");
	}
}

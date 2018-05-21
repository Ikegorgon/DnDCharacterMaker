package charactermaker.model.features.feats.classfeat;

public class CombatInspiration extends ClassFeats{
	public CombatInspiration() {
		super("Combat Inspiration", "Bard", "Level 3, College of Valor");
		this.setDescription("Also at 3rd level, you learn to inspire others in battle. A creature that has a Bardic Inspiration die from you can roll that die and add the number rolled to a weapon damage roll it just made. Alternatively, when an attack roll is made against the creature, it can use its reaction to roll the Bardic Inspiration die and add the number rolled to its AC against that attack, after seeing the roll but before knowing whether it hits or misses.");
	}
}

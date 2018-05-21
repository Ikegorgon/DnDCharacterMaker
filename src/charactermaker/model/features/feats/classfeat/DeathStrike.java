package charactermaker.model.features.feats.classfeat;

public class DeathStrike extends ClassFeats{
	public DeathStrike() {
		super("Death Strike", "Rogue", "Level 17, Assassin");
		this.setDescription("Starting at 17th level, you become a master of instant death. When you attack and hit a creature that is surprised, it must make a Constitution saving throw (DC 8 + your Dexterity modifier + your proficiency bonus). On a failed save, double the damage of your attack against the creature.");
	}
}

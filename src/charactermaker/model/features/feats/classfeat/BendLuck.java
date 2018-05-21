package charactermaker.model.features.feats.classfeat;

public class BendLuck extends ClassFeats{
	public BendLuck() {
		super("Bend Luck", "Sorcerer", "Level 6, Wild Magic");
		this.setDescription("Starting at 6th level, you have the ability to twist fate using your wild magic. When another creature you can see makes an attack roll, an ability check, or a saving throw, you can use your reaction and spend 2 sorcery points to roll 1d4 and apply the number rolled as a bonus or penalty (your choice) to the creature's roll. You can do so after the creature rolls but before any effects of the roll occur.");
	}
}

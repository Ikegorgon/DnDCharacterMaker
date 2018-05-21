package charactermaker.model.features.feats.classfeat;

public class AvengingAngel extends ClassFeats{
	public AvengingAngel() {
		super("Avenging Angel", "Paladin", "Level 20, Oath of Vengeance");
		this.setDescription("At 20th level, you can assume the form of an angelic avenger. Using your action, you undergo a transformation. For I hour, you gain the following benefits: \n" + 
				"Wings sprout from your back and grant you a flying speed of 60 feet. You emanate an aura of menace in a 30-foot radius. The first time any enemy creature enters the aura or starts its turn there during a battle, the creature must succeed on a Wisdom saving throw or become frightened of you for 1 minute or until it takes any damage. Attack rolls against the frightened creature have advantage. \n" + 
				"Once you use this feature, you can't use it again until you finish a long rest.");
	}
}

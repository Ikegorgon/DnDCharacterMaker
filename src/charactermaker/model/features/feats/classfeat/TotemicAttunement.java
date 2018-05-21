package charactermaker.model.features.feats.classfeat;

public class TotemicAttunement extends ClassFeats{
	public TotemicAttunement() {
		super("Totemic Attunement", "Barbarian", "Level 14, Path of the Totem Warrior");
		this.setDescription("At 14th level, you gain a magical benefit based on a totem animal of your choice. You can choose the same animal you selected previously or a different one. \n" + 
				"Bear. While you're raging. any creature within 5 feet of you that's hostile to you has disadvantage on attack rolls against targets other than you or another character with this feature. An enemy is immune to this effect if it can't see or hear you or if it can’t be frightened. \n" + 
				"Eagle. While raging. you have a flying speed equal to your current walking speed. This benefit works only in short bursts; you fall if you end your turn in the air and nothing else is holding you aloft. \n" + 
				"Wolf. While you're raging, you can use a bonus action on your turn to knock a Large or smaller creature prone when you hit it with melee weapon attack.");
	}
}

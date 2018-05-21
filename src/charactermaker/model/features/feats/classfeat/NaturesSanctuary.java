package charactermaker.model.features.feats.classfeat;

public class NaturesSanctuary extends ClassFeats{
	public NaturesSanctuary() {
		super("Nature's Sanctuary", "Druid", "Level 14, Circle of the Land");
		this.setDescription("When you reach 14th level, creatures of the natural world sense your connection to nature and become hesitant to attack you. When a beast or plant creature attacks you, that creature must make a Wisdom saving throw against your druid spell save DC. On a failed save, the creature must choose a different target, or the attack automatically misses. On a successful save, the creature is immune to this effect for 24 hours.\n" + 
				"\n" + 
				"The creature is aware of this effect before it makes its attack against you.");
	}
}

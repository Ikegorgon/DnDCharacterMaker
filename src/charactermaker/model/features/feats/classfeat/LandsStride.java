package charactermaker.model.features.feats.classfeat;

public class LandsStride extends ClassFeats{
	public LandsStride() {
		super("Land's Stride", "Druid, Ranger", "Level 6, Circle of the Land (Level 8 Ranger)");
		this.setDescription("Starting at 6th level, moving through nonmagical difficult terrain costs you no extra movement. You can also pass through nonmagical plants without being slowed by them and without taking damage from them if they have thorns, spines, or a similar hazard.\n" + 
				"\n" + 
				"In addition, you have advantage on saving throws against plants that are magically created or manipulated to impede movement, such those created by the entangle spell.");
	}
}

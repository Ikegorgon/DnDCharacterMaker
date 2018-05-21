package charactermaker.model.features.feats.classfeat;

public class FeralSenses extends ClassFeats{
	public FeralSenses() {
		super("Feral Sense", "Ranger", "Level 18");
		this.setDescription("At 18th level, you gain preternatural senses that help you fight creatures you can't see. When you attack a creature you can't see, your inability to see it doesn't impose disadvantage on your attack rolls against it.\n" + 
				"\n" + 
				"You are also aware of the location of any invisible creature within 30 feet of you, provided that the creature isn't hidden from you and you aren't blinded or deafened.");
	}
}

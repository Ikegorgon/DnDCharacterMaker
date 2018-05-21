package charactermaker.model.features.feats.classfeat;

public class Archdruid extends ClassFeats{
	public Archdruid() {
		super("Archdruid", "Druid", "Level 20");
		this.setDescription("At 20th level, you can use your Wild Shape an unlimited number of times.\n" + 
				"\n" + 
				"Additionally, you can ignore the verbal and somatic components of your druid spells, as well as any material components that lack a cost and aren't consumed by a spell. You gain this benefit in both your normal shape and your beast shape from Wild Shape.");
	}
}

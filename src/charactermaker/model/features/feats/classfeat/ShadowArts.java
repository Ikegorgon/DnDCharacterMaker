package charactermaker.model.features.feats.classfeat;

public class ShadowArts extends ClassFeats{
	public ShadowArts() {
		super("Shadow Arts", "Monk", "Level 6, Way of Shadow");
		this.setDescription("Starting when you choose this tradition at 3rd level, you can use your ki to duplicate the effects of certain spells.\n" + 
				"\n" + 
				"As an action, you can spend 2 ki points to cast darkness, darkvision, pass without trace, or silence, without providing material components. Additionally, you gain the minor illusion cantrip if you don’t already know it.");
	}
}

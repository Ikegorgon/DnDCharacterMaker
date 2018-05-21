package charactermaker.model.features.feats.classfeat;

public class EmptyBody extends ClassFeats{
	public EmptyBody() {
		super("Empty Body", "Monk", "Level 18");
		this.setDescription("Beginning at 18th level, you can use your action to spend 4 ki points to become invisible for 1 minute. During that time, you also have resistance to all damage but force damage.\n" + 
				"\n" + 
				"Additionally, you can spend 8 ki points to cast the astral projection spell, without needing material components. When you do so, you can't take any other creatures with you.");
	}
}

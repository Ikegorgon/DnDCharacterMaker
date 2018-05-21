package charactermaker.model.features.feats.classfeat;

public class MysticArcanum extends ClassFeats{
	public MysticArcanum() {
		super("Mystic Arcanum", "Warlock", "Level 11");
		this.setDescription("At 11th level, your patron bestows upon you a magical secret called an arcanum. Choose one 6th-level spell from the warlock spell list as this arcanum.\n" + 
				"\n" + 
				"You can cast your arcanum spell once without expending a spell slot. You must finish a long rest before you can do so again.\n" + 
				"\n" + 
				"At higher levels, you gain more warlock spells of your choice that can be cast in this way: one 7th-level spell at 13th level, one 8th-level spell at 15th level, and one 9th-level spell at 17th level. You regain all uses of your Mystic Arcanum when you finish a long rest.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class FontOfMagic extends ClassFeats{
	public FontOfMagic() {
		super("Font of Magic", "Sorcerer", "Level 2");
		this.setDescription("t 2nd level, you tap into a deep wellspring of magic within yourself. This wellspring is represented by sorcery points, which allow you to create a variety of magical effects.\n" + 
				"\n" + 
				"Sorcery Points\n" + 
				"You have 2 sorcery points, and you gain more as you reach higher levels, as shown in the Sorcery Points column of the Sorcerer table. You can never have more sorcery points than shown on the table for your level. You regain all spent sorcery points when you finish a long rest.\n" + 
				"\n" + 
				"Flexible Casting\n" + 
				"You can use your sorcery points to gain additional spell slots, or sacrifice spell slots to gain additional sorcery points. You learn other ways to use your sorcery points as you reach higher levels.\n" + 
				"\n" + 
				"Creating Spell Slots. You can transform unexpended sorcery points into one spell slot as a bonus action on your turn. The Creating Spell Slots table shows the cost of creating a spell slot of a given level. You can create spell slots no higher in level than 5th.\n" + 
				"\n" + 
				"Any spell slot you create with this feature vanishes when you finish a long rest.\n" + 
				"\n" + 
				"Creating Spell Slots\n" + 
				"Spell Slot Level	Sorcery Point Cost\n" + 
				"1st	2\n" + 
				"2nd	3\n" + 
				"3rd	5\n" + 
				"4th	6\n" + 
				"5th	7\n" + 
				"Converting a Spell Slot to Sorcery Points. As a bonus action on your turn, you can expend one spell slot and gain a number of sorcery points equal to the slot’s level.");
	}
}

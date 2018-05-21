package charactermaker.model.features.feats.classfeat;

public class AlterMemories extends ClassFeats{
	public AlterMemories() {
		super("Alter Memories", "Wizard", "Level 14, School of Enchantemnt");
		this.setDescription("At 14th level, you gain the ability to make a creature unaware of your magical influence on it. When you cast an enchantment spell to charm one or more creatures, you can alter one creature's understanding so that it remains unaware of being charmed.\n" + 
				"\n" + 
				"Additionally, once before the spell expires, you can use your action to try to make the chosen creature forget some of the time it spent charmed. The creature must succeed on an Intelligence saving throw against your wizard spell save DC or lose a number of hours of its memories equal to 1 + your Charisma modifier (minimum 1). You can make the creature forget less time, and the amount of time can't exceed the duration of your enchantment spell.");
	}
}

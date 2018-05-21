package charactermaker.model.features.feats.classfeat;

public class Indomitable extends ClassFeats{
	public Indomitable() {
		super("Indomitable", "Fighter", "Level 9");
		this.setDescription("Beginning at 9th level, you can reroll a saving throw that you fail. If you do so, you must use the new roll, and you can't use this feature again until you finish a long rest.\n" + 
				"\n" + 
				"You can use this feature twice between long rests starting at 13th level and three times between long rests starting at 17th level.\n" + 
				"\n" + 
				"");
	}
}

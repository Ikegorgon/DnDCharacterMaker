package charactermaker.model.features.feats.classfeat;

public class DiscipleOfTheElements extends ClassFeats{
	public DiscipleOfTheElements() {
		super("Disciple of the Elements", "Monk", "Level 3, Way of the Four Elements");
		this.setDescription("At 3rd level, you learn magical disciplines that harness the power of the four elements. Some disciplines require you to spend ki points when you use it.\n" + 
				"\n" + 
				"You learn two elemental disciplines of your choice, which are detailed in the “Elemental Disciplines” section below. You learn two additional elemental disciplines of your choice at 6th, 11th, and 17th level. Each elemental discipline has a minimum monk level that you must meet in order to use it.\n" + 
				"\n" + 
				"Whenever you learn a new elemental discipline, you can also replace one elemental discipline that you already know with a different discipline. You cannot replace cantrips for elemental disciplines.\n" + 
				"\n" + 
				"Casting Elemental Spells. Some elemental disciplines allow you to cast spells. To cast one of these spells, you use its casting time and other rules, but you don’t need to provide material components for it.");
	}
}

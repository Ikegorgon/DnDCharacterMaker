package charactermaker.model.features.feats.classfeat;

public class SongOfRest extends ClassFeats{
	public SongOfRest() {
		super("Song of Rest", "Bard", "Level 2");
		this.setDescription("Beginning at 2nd level, you can use soothing music or oration to help revitalize your wounded allies during a short rest. If you or any friendly creatures who can hear your performance regain hit points at the end of the short rest by spending one or more Hit Dice, each of those creatures regains an extra 1d6 hit points.\n" + 
				"\n" + 
				"The extra hit points increase when you reach certain levels in this class: to 1d8 at 9th level, to 1d10 at 13th level, and to 1d12 at 17th level.");
	}
}

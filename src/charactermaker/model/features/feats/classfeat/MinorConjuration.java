package charactermaker.model.features.feats.classfeat;

public class MinorConjuration extends ClassFeats{
	public MinorConjuration() {
		super("Minor Conjuration", "Wizard", "Level 2, School of Conjuration");
		this.setDescription("Starting at 2nd level when you select this school, you can use your full action to conjure up an inanimate object in your hand or on the ground in an unoccupied space that you can see within 4 metres of you. This object can be no larger than 1 metre on a side and weigh no more than 10 pounds, and its form must be that of a nonmagical object that you have seen. The object is visibly magical, radiating dim light out to 2 metres.\n" + 
				"\n" + 
				"The object disappears after 1 hour, when you use this feature again, or if it takes any damage.");
	}
}

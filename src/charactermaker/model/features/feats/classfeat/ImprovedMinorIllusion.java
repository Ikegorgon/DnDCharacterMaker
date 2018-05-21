package charactermaker.model.features.feats.classfeat;

public class ImprovedMinorIllusion extends ClassFeats{
	public ImprovedMinorIllusion() {
		super("Improved Minor Illusion", "Wizard", "Level 2, School of Illusion");
		this.setDescription("When you choose this school at 2nd level, you learn the minor illusion cantrip. If you already know this cantrip, you learn a different wizard cantrip of your choice. The cantrip doesn't count against your number of cantrips known.\n" + 
				"\n" + 
				"When you cast minor illusion, you can create both a sound and an image with a single casting of the spell.");
	}
}

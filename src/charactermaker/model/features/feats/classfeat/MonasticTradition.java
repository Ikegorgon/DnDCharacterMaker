package charactermaker.model.features.feats.classfeat;

public class MonasticTradition extends ClassFeats{
	public MonasticTradition() {
		super("Monastic Tradition", "Monk", "Level 3");
		this.setDescription("When you reach 3rd level, you commit yourself to a monastic tradition: the Way of the Open Hand, the Way of Shadow, or the Way of the Four Elements, all detailed at the end of the class description. Your tradition\n" + 
				"grants you features at 3rd level and again at 6th, 11th, and 17th level.");
	}
}

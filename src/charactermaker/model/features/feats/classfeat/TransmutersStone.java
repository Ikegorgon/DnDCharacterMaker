package charactermaker.model.features.feats.classfeat;

public class TransmutersStone extends ClassFeats{
	public TransmutersStone() {
		super("Transmuter's Stone", "Wizard", "Level 6, School of Transmutation");
		this.setDescription("Starting at 6th level, you can spend 8 hours creating a transmuter's stone that stores transmutation magic. You can benefit from the stone yourself or give it to another creature. A creature gains a benefit of your choice as long as the stone is in the creature's possession. When you create the stone, choose the benefit from the following options:\n" + 
				"\n" + 
				"Darkvision out to a range of 20 metres\n" + 
				"An increase to speed of 4 metres while the creature is unencumbered\n" + 
				"Proficiency in Constitution saving throws\n" + 
				"+1 resistance to acid, cold, fire, lightning, or thunder damage (your choice whenever you choose this benefit)\n" + 
				"Each time you cast a transmutation spell of 1st level or higher, you can change the effect of your stone if the stone is on your person.\n" + 
				"\n" + 
				"If you create a new transmuter's stone, the previous one ceases to function.");
	}
}

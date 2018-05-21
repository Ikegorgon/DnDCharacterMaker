package charactermaker.model.features.feats.classfeat;

public class DivineDomain extends ClassFeats{
	public DivineDomain() {
		super("Divine Domain", "Cleric", "-");
		this.setDescription("Choose one domain related to your deity: Knowledge, Life, Light, Nature, Tempest, Trickery, or War. Each domain is detailed at the end of the class description, and each one provides examples of gods associated with it. Your choice grants you domain spells and other features when you choose it at 1st level. It also grants you additional ways to use Channel Divinity when you gain that feature at 2nd level, and additional benefits at 6th, 8th, and 17th levels. \n" + 
				"Domain Spells\n" + 
				"Each domain has a list of spells-its domain spells- that you gain at the c1eric levels noted in the domain description. Once you gain a domain spell, you always have it prepared, and it doesn't count against the number of spells you can prepare each day. \n" + 
				"If you have a domain spell that doesn't appear on the cleric spell list, the spell is nonetheless a cleric spell for you.");
	}
}

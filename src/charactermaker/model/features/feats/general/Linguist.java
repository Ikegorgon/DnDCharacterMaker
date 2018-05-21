package charactermaker.model.features.feats.general;

public class Linguist extends GeneralFeats {
	public Linguist() {
		super("Linguist", "-");
		this.setDescription("You have studied languages and codes, gaining the following benefits: \n" + 
				"Increase your Intelligence score by 1, to a maximum of 20. You learn three languages of your choice.\n" + 
				"You can ably create written ciphers. Others can't decipher a code you create unless you teach them, they succeed on an Intelligence check (DC equal to your 1ntelligence score +your proficiency bonus), or they use magic to decipher it.\n" + 
				"");
	}
}

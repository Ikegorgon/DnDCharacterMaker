package charactermaker.model.features.feats.classfeat;

public class ElderChampion extends ClassFeats{
	public ElderChampion() {
		super("Elder Champion", "Paladin", "Level 20, Oath of the Ancient");
		this.setDescription("At 20th level, you can assume the form of an ancient force of nature, taking on an appearance you choose. For example, your skin might turn green or take on a bark-like texture, your hair might become leafy or moss- like, or you might sprout antlers or a lion-like mane. \n" + 
				"Using your action, you undergo a transformation. For 1 minute, you gain the following benefits: \n" + 
				"At the start of each of your turns, you regain 10 hit points.\n" + 
				"Whenever you cast a paladin spell that has a casting time of 1 action, you can cast it using a bonus action instead. \n" + 
				"Enemy creatures within 10 feet of you have disadvantage on saving throws against your paladin spells and Channel Divinity options. \n" + 
				"Once you use this feature, you can't use it again until you finish a long rest.");
	}
}

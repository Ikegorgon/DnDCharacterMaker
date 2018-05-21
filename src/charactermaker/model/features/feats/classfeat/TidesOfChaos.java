package charactermaker.model.features.feats.classfeat;

public class TidesOfChaos extends ClassFeats{
	public TidesOfChaos() {
		super("Tides of Chaos", "Sorcerer", "Level 1, Wild Magic");
		this.setDescription("Starting at 1st level, you can manipulate the forces of chance and chaos to gain advantage on one attack roll, ability check, or saving throw. Once you do so, you must finish a long rest before you can use this feature again. \n" + 
				"Any time before you regain the use of this feature, the DM can have you roll on the Wild Magic Surge table immediately after you cast a sorcerer spell of 1st level or higher. You then regain the use of this feature.");
	}
}

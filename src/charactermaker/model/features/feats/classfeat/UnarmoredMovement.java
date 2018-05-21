package charactermaker.model.features.feats.classfeat;

public class UnarmoredMovement extends ClassFeats{
	public UnarmoredMovement() {
		super("Unarmored Movement", "Monk", "Level 2");
		this.setDescription("Starting at 2nd level, your speed increases by 10 feet while you are not wearing armor or wielding a shield. This bonus increases when you reach certain monk levels, as shown in the Monk table.\n" + 
				"\n" + 
				"At 9th level, you gain the ability to move along vertical surfaces and across liquids on your turn without falling during the move.");
	}
}

package charactermaker.model.features.feats.classfeat;

public class DragonAncestor extends ClassFeats{
	public DragonAncestor() {
		super("Dragon Ancestor", "Sorcerer", "Level 1, Draconic Bloodline");
		this.setDescription("At 1st level, you choose one type of dragon as your ancestor. The damage type associated with each dragon is used by features you gain later.\n" + 
				"\n" + 
				"Draconic Ancestry\n" + 
				"Dragon		Damage Type\n" + 
				"Black		Acid\n" + 
				"Blue		Lightning\n" + 
				"Brass		Fire\n" + 
				"Bronze		Lightning\n" + 
				"Copper		Acid\n" + 
				"Gold		Fire\n" + 
				"Green		Poison\n" + 
				"Red			Fire\n" + 
				"Silver		Cold\n" + 
				"White		Cold\n" + 
				"You can speak, read, and write Draconic. Additionally, whenever you make a Charisma check when interacting with dragons, your proficiency bonus is doubled if it applies to the check.");
	}
}

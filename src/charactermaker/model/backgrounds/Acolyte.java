package charactermaker.model.backgrounds;

import charactermaker.model.items.*;
import charactermaker.model.features.feats.backgroundfeat.*;
import java.util.*;

public class Acolyte extends Backgrounds {
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
	private List<Items> equipment;
	public Acolyte() {
		super("Acolyte");
//		this.setDescription("");
//		this.setBook("PHB");
		feats = new ArrayList<BackgroundFeats>();
		feats.add(new ShelterOfTheFaithful());
		proficiency = new ArrayList<String>();
//		proficiency.add();
		equipment = new ArrayList<Items>();
//		equipment.add();
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setEquipment(equipment);
	}
}

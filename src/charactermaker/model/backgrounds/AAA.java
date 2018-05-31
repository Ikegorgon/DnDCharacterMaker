package charactermaker.model.backgrounds;

import charactermaker.model.items.*;
import charactermaker.model.features.feats.backgroundfeat.*;
import java.util.*;

public class AAA extends Backgrounds {
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
	private List<Items> equipment;
	public AAA() {
//		super("");
//		this.setDescription("");
//		this.setBook("");
		feats = new ArrayList<BackgroundFeats>();
//		feats.add();
		proficiency = new ArrayList<String>();
//		proficiency.add();
		equipment = new ArrayList<Items>();
//		equipment.add();
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setEquipment(equipment);
	}
}

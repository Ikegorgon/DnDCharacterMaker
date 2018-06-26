package charactermaker.model.backgrounds;

import charactermaker.model.features.feats.backgroundfeat.*;
import java.util.*;

public class AAA extends Backgrounds {
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
	public AAA() {
//		super("");
//		this.setDescription("");
		this.setTrait(setTrait());
		this.setIdeal(setIdeal());
		this.setBond(setBond());
		this.setFlaw(setFlaw());
//		this.setBook("");
		feats = new ArrayList<BackgroundFeats>();
//		feats.add(new ());
		proficiency = new ArrayList<String>();
//		proficiency.add("");
		this.setFeats(feats);
		this.setProficiency(proficiency);
	}
	private String setTrait() {
		String trait = "";
		Random rand = new Random();
		List<String> traits = new ArrayList<String>();
		traits.add("");
		traits.add("");
		traits.add("");
		traits.add("");
		traits.add("");
		traits.add("");
		traits.add("");
		traits.add("");
		int num = rand.nextInt(traits.size());
		System.out.println(num);
		trait = traits.get(num);
		return trait;
	}
	private String setIdeal() {
		String ideal = "";
		Random rand = new Random();
		List<String> ideals = new ArrayList<String>();
		ideals.add("");
		ideals.add("");
		ideals.add("");
		ideals.add("");
		ideals.add("");
		ideals.add("");
		int num = rand.nextInt(ideals.size());
		System.out.println(num);
		ideal = ideals.get(num);
		return ideal;
	}
	private String setBond() {
		String bond = "";
		Random rand = new Random();
		List<String> bonds = new ArrayList<String>();
		bonds.add("");
		bonds.add("");
		bonds.add("");
		bonds.add("");
		bonds.add("");
		bonds.add("");
		int num = rand.nextInt(bonds.size());
		System.out.println(num);
		bond = bonds.get(num);
		return bond;
	}
	private String setFlaw() {
		String flaw = "";
		Random rand = new Random();
		List<String> flaws = new ArrayList<String>();
		flaws.add("");
		flaws.add("");
		flaws.add("");
		flaws.add("");
		flaws.add("");
		flaws.add("");
		int num = rand.nextInt(flaws.size());
		System.out.println(num);
		flaw = flaws.get(num);
		return flaw;
	}
}

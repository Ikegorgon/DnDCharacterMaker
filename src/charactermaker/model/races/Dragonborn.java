package charactermaker.model.races;

import java.util.ArrayList;
import java.util.List;
import charactermaker.model.features.feats.racialfeat.*;
import charactermaker.model.features.skills.*;

public class Dragonborn extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> languages;
	public Dragonborn() {
		super("Dragonborn");
		setup();
	}
	private void setup() {
		ability = new ArrayList<Skills>();
		ability.add(new Strength());
		ability.add(new Strength());
		ability.add(new Charisma());
		feats = new ArrayList<RacialFeats>();
		languages = new ArrayList<String>();
		languages.add("Common");
		languages.add("Celestial");
		this.setDescription("abc");
		this.setAbility(ability);
		this.setAge(80);
		this.setAlignment("Good");
		this.setSize("Medium");
		this.setSpeed(30);
		this.setDarkVision(true);
		this.setDarkVisionDistance(60);
//		this.setFeats(feats);
		this.setLanguages(languages);
	}
}

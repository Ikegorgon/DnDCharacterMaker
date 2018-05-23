package charactermaker.model.races;

import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;
import java.util.*;

public class Aasimar_Fallen extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> languages;
	private Charisma charisma;
	public Aasimar_Fallen() {
		super("Aasimar");
		setup();
	}
	private void setup() {
		ability = new ArrayList<Skills>();
		ability.add(charisma);
		feats = new ArrayList<RacialFeats>();
		languages = new ArrayList<String>();
		languages.add("Common");
		languages.add("Celestial");
		this.setDescription("abc");
		this.setAbility(ability);
		this.setAge(160);
		this.setAlignment("Good");
		this.setSize("Medium");
		this.setSpeed(30);
		this.setDarkVision(true);
		this.setDarkVisionDistance(60);
//		this.setFeats(feats);
		this.setLanguages(languages);
	}
}

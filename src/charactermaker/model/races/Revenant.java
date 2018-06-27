package charactermaker.model.races;

import java.util.*;
import charactermaker.model.features.skills.*;
import charactermaker.model.features.feats.racialfeat.*;

public class Revenant extends Races{
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private int mod;
	public Revenant() {
		super("Revenant");
		this.setAge(0);
		this.setHeight("(Same as previous creature)");
		this.setWeight("(Same as previous creature)");
		this.setSpeed(0);
		ability = new ArrayList<Skills>();
		ability.add(new Constitution());
		feats = new ArrayList<RacialFeats>();
		feats.add(new RelentlessNature());
		proficiency = new ArrayList<String>();
		this.setAbility(ability);
		this.setFeats(feats);
		this.setProficiency(proficiency);
		this.setDescription("The Revenant is a playable race. The creature once died, but has come back to the living seeking revenge or the completion of an important task. At a DM's permission, this can even be a slain player character. Once the revenant's goal is complete, they die and cannot be brought back to life by any means.\n" + 
				"\n" + 
				"Due to the nature of the revenant, they are mostly applicable to races which have subraces. The traits of the revenant replace the subrace's traits. It is possible, however, to create a revenant subrace of a race that has no subraces, such as the dragonborn, and modify the main racial traits to suit the theme.");
		this.setBook("UA");
	}
}

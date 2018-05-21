package charactermaker.model.features.feats.racialfeat;

public abstract class RacialFeats {
	private String name;
	private String race;
	private String prerequisite;
	private String description;
	public RacialFeats() {
		
	}
	public RacialFeats(String name, String race) {
		this.name = name;
		this.race = race;
		this.prerequisite = "Prerequisite: -";
		this.description = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrerequisite() {
		return prerequisite;
	}
	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}
}

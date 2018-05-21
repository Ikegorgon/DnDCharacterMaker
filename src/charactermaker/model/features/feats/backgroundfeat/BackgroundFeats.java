package charactermaker.model.features.feats.backgroundfeat;

public abstract class BackgroundFeats {
	private String name;
	private String classes;
	private String prerequisite;
	private String description;
	public BackgroundFeats() {
		
	}
	public BackgroundFeats(String name, String classes) {
		this.name = name;
		this.classes = classes;
		this.prerequisite = "Prerequisite: -";
		this.description = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
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

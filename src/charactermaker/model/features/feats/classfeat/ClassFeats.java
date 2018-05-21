package charactermaker.model.features.feats.classfeat;

public abstract class ClassFeats {
	private String name;
	private String classes;
	private String prerequisite;
	private String description;
	public ClassFeats() {
		
	}
	public ClassFeats(String name, String classes, String prerequisite) {
		this.name = name;
		this.classes = classes;
		this.prerequisite = "Prerequisite: " + prerequisite;
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

package charactermaker.model.races;

public abstract class Races {
	private String name;
	public Races() {
		
	}
	public Races(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

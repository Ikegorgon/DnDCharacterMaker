package charactermaker.model.backgrounds;

public abstract class Backgrounds {
	private String name;
	public Backgrounds() {
		
	}
	public Backgrounds(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

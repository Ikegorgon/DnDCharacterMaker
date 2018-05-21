package charactermaker.model.items.gear;

public abstract class Gear {
	private String name;
	private String cost;
	private String weight;
	private String description;
	public Gear() {
		
	}
	public Gear(String name, String cost, String weight) {
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.description = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descrpition) {
		this.description = descrpition;
	}
}

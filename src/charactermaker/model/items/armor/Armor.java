package charactermaker.model.items.armor;

public abstract class Armor {
	private String name;
	private String cost;
	private String ac;
	private String strength;
	private String stealth;
	private String weight;
	private String type;
	private String description;
	public Armor() {
		
	}
	public Armor (String name, String cost, String ac, String strength, String stealth, String weight, String type) {
		this.name = name;
		this.cost = cost;
		this.ac = ac;
		this.strength = strength;
		this.stealth = stealth;
		this.weight = weight;
		this.type = type;
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
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getStealth() {
		return stealth;
	}
	public void setStealth(String stealth) {
		this.stealth = stealth;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

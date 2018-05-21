package charactermaker.model.items.weapons;

public abstract class Weapons {
	private String name;
	private String cost;
	private String damage;
	private String weight;
	private String properties;
	private String type;
	private String style;
	private String description;
	public Weapons() {
		
	}
	public Weapons(String name, String cost, String damage, String weight, String properties, String type, String style) {
		this.name = name;
		this.cost = cost;
		this.damage = damage;
		this.weight = weight;
		this.properties = properties;
		this.type = type;
		this.style = style;
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
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

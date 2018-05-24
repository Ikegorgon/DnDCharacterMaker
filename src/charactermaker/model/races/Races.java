package charactermaker.model.races;

import charactermaker.model.features.feats.racialfeat.*;
import charactermaker.model.features.skills.*;
import java.util.*;

public abstract class Races {
	private String name;
	private String description;
	private int age;
	private String height;
	private String weight;
	private int speed;
	private List<Skills> ability;
	private List<RacialFeats> feats;
	private List<String> proficiency;
	private String book;
	public Races() {
		
	}
	public Races(String name) {
		this.name = name;
		this.age = 0;
		this.height = "";
		this.weight = "";
		this.speed = 0;
		this.description = "";
		this.book = "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Skills> getAbility() {
		return ability;
	}
	public void setAbility(List<Skills> ability) {
		this.ability = ability;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String size) {
		this.height = size;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public List<RacialFeats> getFeats() {
		return feats;
	}
	public void setFeats(List<RacialFeats> feats) {
		this.feats = feats;
	}
	public List<String> getProficiency() {
		return proficiency;
	}
	public void setProficiency(List<String> proficiency) {
		this.proficiency = proficiency;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
}

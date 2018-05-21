package charactermaker.model.races;

import charactermaker.model.features.feats.*;
import charactermaker.model.features.skills.*;
import java.util.*;

public abstract class Races {
	private String name;
	private String description;
	private List<Skills> ability;
	private int age;
	private String alignment;
	private String size;
	private int speed;
	private boolean darkVision;
	private int darkVisionDistance;
//	private List<Features> feats;
	private List<String> languages;
	public Races() {
		
	}
	public Races(String name) {
		this.name = name;
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
	public String getAlignment() {
		return alignment;
	}
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isDarkVision() {
		return darkVision;
	}
	public void setDarkVision(boolean darkVision) {
		this.darkVision = darkVision;
	}
	public int getDarkVisionDistance() {
		return darkVisionDistance;
	}
	public void setDarkVisionDistance(int darkVisionDistance) {
		this.darkVisionDistance = darkVisionDistance;
	}
//	public List<Features> getFeats() {
//		return feats;
//	}
//	public void setFeats(List<Features> feats) {
//		this.feats = feats;
//	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
}

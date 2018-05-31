package charactermaker.model.backgrounds;

import java.util.*;
import charactermaker.model.features.feats.backgroundfeat.*;
import charactermaker.model.items.*;

public abstract class Backgrounds {
	private String name;
	private String description;
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
	private List<Items> equipment;
	private String book;
	public Backgrounds() {
		
	}
	public Backgrounds(String name) {
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
	public List<BackgroundFeats> getFeats() {
		return feats;
	}
	public void setFeats(List<BackgroundFeats> feats) {
		this.feats = feats;
	}
	public List<String> getProficiency() {
		return proficiency;
	}
	public void setProficiency(List<String> proficiency) {
		this.proficiency = proficiency;
	}
	public List<Items> getEquipment() {
		return equipment;
	}
	public void setEquipment(List<Items> equipment) {
		this.equipment = equipment;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
}

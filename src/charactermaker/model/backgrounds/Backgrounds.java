package charactermaker.model.backgrounds;

import java.util.*;
import charactermaker.model.features.feats.backgroundfeat.*;

public abstract class Backgrounds {
	private String name;
	private String description;
	private String trait;
	private String ideal;
	private String bond;
	private String flaw;
	private List<BackgroundFeats> feats;
	private List<String> proficiency;
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
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getTrait() {
		return trait;
	}
	public void setTrait(String trait) {
		this.trait = trait;
	}
	public String getIdeal() {
		return ideal;
	}
	public void setIdeal(String ideal) {
		this.ideal = ideal;
	}
	public String getBond() {
		return bond;
	}
	public void setBond(String bond) {
		this.bond = bond;
	}
	public String getFlaw() {
		return flaw;
	}
	public void setFlaw(String flaw) {
		this.flaw = flaw;
	}
}

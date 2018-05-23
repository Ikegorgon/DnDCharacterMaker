package charactermaker.model.classes;

import java.util.*;

public abstract class Classes {
	private String name;
	private List<Archetypes> archetypes;
	public Classes() {
		
	}
	public Classes(String name) {
		this.name = name;
		archetypes = new ArrayList<Archetypes>();
	}
	public String getName() {
		return name;
	}
	public List<Archetypes> getArchetypes() {
		return archetypes;
	}
}

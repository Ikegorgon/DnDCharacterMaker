package charactermaker.controller;

import charactermaker.view.*;
import charactermaker.model.*;
import charactermaker.model.classes.*;
import charactermaker.model.races.*;
import charactermaker.model.backgrounds.*;
import charactermaker.model.features.*;
import charactermaker.model.items.*;
import charactermaker.model.spells.*;
import java.util.*;

public class Controller {
	private Frame frame;
	private List<Classes> classes;
	private List<Races> races;
	private List<Backgrounds> backgrounds;
	public Controller() {
		classes = new ArrayList<Classes>();
		classes.add(new Paladin());
		races = new ArrayList<Races>();
		races.add(new Human());
		backgrounds = new ArrayList<Backgrounds>();
		backgrounds.add(new Acolyte());
	}
	public void start() {
		frame = new Frame(this);
	}
	public String [] convertClasses() {
		String [] classTypes = new String [classes.size()];
		for (int i = 0; i < classes.size(); i++) {
			classTypes[i] = classes.get(i).getName();
		}
		return classTypes;
	}
	public String [] convertRaces() {
		String [] raceTypes = new String [races.size()];
		for (int i = 0; i < races.size(); i++) {
			raceTypes[i] = races.get(i).getName();
		}
		return raceTypes;
	}
	public String [] convertBackgrounds() {
		String [] backgroundTypes = new String [backgrounds.size()];
		for (int i = 0; i < backgrounds.size(); i++) {
			backgroundTypes[i] = backgrounds.get(i).getName();
		}
		return backgroundTypes;
	}
	public Frame getFrame() {
		return frame;
	}
}

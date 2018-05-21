package charactermaker.controller;
/*
 * Based off Info from "GIGER'S 5E D&D WIKI!"
 * 		http://gdnd.wikidot.com/
 */
import charactermaker.view.*;
import charactermaker.model.classes.*;
import charactermaker.model.races.*;
import charactermaker.model.backgrounds.*;
import charactermaker.model.features.feats.general.*;
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
		classes.add(new Artificer());
		classes.add(new Barbarian());
		classes.add(new Bard());
		classes.add(new Cleric());
		classes.add(new Druid());
		classes.add(new Fighter());
		classes.add(new Monk());
		classes.add(new Mystic());
		classes.add(new Paladin());
		classes.add(new Ranger());
		classes.add(new Rogue());
		classes.add(new Sorcerer());
		classes.add(new Warlock());
		classes.add(new Wizard());
		races = new ArrayList<Races>();
		races.add(new Aasimar());
		races.add(new Bugbear());
		races.add(new Dragonborn());
		races.add(new Dwarf());
		races.add(new Elf());
		races.add(new Firbolg());
		races.add(new Genasi());
		races.add(new Gnome());
		races.add(new Goblin());
		races.add(new HalfElf());
		races.add(new Halfling());
		races.add(new HalfOrc());
		races.add(new Hobgoblin());
		races.add(new Human());
		races.add(new Kenku());
		races.add(new Kobold());
		races.add(new Lizardfolk());
		races.add(new Orc());
		races.add(new Tabaxi());
		races.add(new Tiefling());
		races.add(new Tortle());
		races.add(new Triton());
		races.add(new YuanTiPureblood());
		backgrounds = new ArrayList<Backgrounds>();
		backgrounds.add(new Acolyte());
		backgrounds.add(new Anthropologist());
		backgrounds.add(new Archaeologist());
		backgrounds.add(new BlackFistDoubleAgent());
		backgrounds.add(new CaravanSpecialist());
		backgrounds.add(new Charlatan());
		backgrounds.add(new CityWatch());
		backgrounds.add(new ClanCrafter());
		backgrounds.add(new CloisteredScholar());
		backgrounds.add(new CormanthorRefugee());
		backgrounds.add(new Courtier());
		backgrounds.add(new Criminal());
		backgrounds.add(new Dissenter());
		backgrounds.add(new DragonCasualty());
		backgrounds.add(new EarthspurMiner());
		backgrounds.add(new Entertainer());
		backgrounds.add(new FactionAgent());
		backgrounds.add(new FarTraveler());
		backgrounds.add(new FolkHero());
		backgrounds.add(new GateUrchin());
		backgrounds.add(new Gladiator());
		backgrounds.add(new GuildArtisan());
		backgrounds.add(new GuildMerchant());
		backgrounds.add(new Harborfolk());
		backgrounds.add(new HauntedOne());
		backgrounds.add(new Heretic());
		backgrounds.add(new Hermit());
		backgrounds.add(new HillsfarMerchant());
		backgrounds.add(new HillsfarSmuggler());
		backgrounds.add(new Inheritor());
		backgrounds.add(new Initiate());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		backgrounds.add(new ());
		
		frame = new Frame(this);
	}
	public void start() {
		
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

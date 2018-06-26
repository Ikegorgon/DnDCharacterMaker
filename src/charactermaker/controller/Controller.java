package charactermaker.controller;
/*
 * Based off Info from "GIGER'S 5E D&D WIKI!"
 * 		http://gdnd.wikidot.com/
 * 
 * 		https://docs.google.com/spreadsheets/d/1fjnoCiYUCOcrMxffWNwppHfuUDlY1Ae0HQ4t-XCaiPA/edit#gid=0
 */
import charactermaker.view.*;
import charactermaker.model.classes.*;
import charactermaker.model.races.*;
import charactermaker.model.backgrounds.*;
import charactermaker.model.features.feats.general.*;
import charactermaker.model.items.*;
import charactermaker.model.spells.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Controller {
	private Frame frame;
	private List<Classes> classes;
	private List<String> archetype;
	private List<Races> races;
	private List<Backgrounds> backgrounds;
	private List<String> alignments;
	public Controller() {
		setupList();
		
		frame = new Frame(this);
	}
	public void setupList() {
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
		archetype = new ArrayList<String>();
//		archetype.add(new Barbarian().getArchetypes().get(0));
//		archetype.add(new Barbarian().getArchetypes().get(1));
		races = new ArrayList<Races>();
		races.add(new Aarakocra());
		races.add(new Aasimar_Fallen());
		races.add(new Aasimar_Protector());
		races.add(new Aasimar_Scourge());
		races.add(new Aasimar_Variant());
		races.add(new Bugbear());
		races.add(new Changeling());
		races.add(new Dragonborn());
		races.add(new Dwarf_Gray());
		races.add(new Dwarf_Hill());
		races.add(new Dwarf_Mountain());
		races.add(new Elf_Drow());
		races.add(new Elf_Eladrin());
		races.add(new Elf_High());
		races.add(new Elf_Joraga());
		races.add(new Elf_MulDaya());
		races.add(new Elf_Tajuru());
		races.add(new Elf_Wood());
		races.add(new Firbolg());
		races.add(new Genasi_Air());
		races.add(new Genasi_Earth());
		races.add(new Genasi_Fire());
		races.add(new Genasi_Water());
		races.add(new Gnome_Deep());
		races.add(new Gnome_Forest());
		races.add(new Gnome_Rock());
		races.add(new Goblin_Grotag());
		races.add(new Goblin_Lavastep());
		races.add(new Goblin_Tuktuk());
		races.add(new Goblin());
		races.add(new Goliath());
		races.add(new HalfElf_Aquatic());
		races.add(new HalfElf_Drow());
		races.add(new HalfElf_MoonSun());
		races.add(new HalfElf_Wood());
		races.add(new HalfElf());
		races.add(new Halfling_Ghostwise());
		races.add(new Halfling_Lightfoot());
		races.add(new Halfling_Stout());
		races.add(new HalfOrc());
		races.add(new Hobgoblin());
		races.add(new Human());
		races.add(new Human_Variant());
		races.add(new Kender());
		races.add(new Kenku());
		races.add(new Kobold());
		races.add(new Kor());
		races.add(new Lizardfolk());
		races.add(new Merfolk_Cosi());
		races.add(new Merfolk_Water());
		races.add(new Merfolk_Wind());
		races.add(new Minotaur());
		races.add(new Orc());
		races.add(new Shifter_Beasthide());
		races.add(new Shifter_Cliffwalk());
		races.add(new Shifter_Longstride());
		races.add(new Shifter_Longtooth());
		races.add(new Shifter_Razorclaw());
		races.add(new Shifter_Wildhunt());
		races.add(new Tabaxi());
		races.add(new Tiefling_Abyssal());
		races.add(new Tiefling_Variant());
		races.add(new Tiefling());
		races.add(new Tortle());
		races.add(new Triton());
		races.add(new Vampire());
		races.add(new Warforged());
		races.add(new YuanTiPureblood());
		backgrounds = new ArrayList<Backgrounds>();
//		backgrounds.add(new Acolyte());
//		backgrounds.add(new Anthropologist());
//		backgrounds.add(new Archaeologist());
//		backgrounds.add(new BlackFistDoubleAgent());
//		backgrounds.add(new CaravanSpecialist());
		backgrounds.add(new Charlatan());
//		backgrounds.add(new CityWatch());
//		backgrounds.add(new ClanCrafter());
//		backgrounds.add(new CloisteredScholar());
//		backgrounds.add(new CormanthorRefugee());
//		backgrounds.add(new Courtier());
		backgrounds.add(new Criminal());
//		backgrounds.add(new Dissenter());
//		backgrounds.add(new DragonCasualty());
//		backgrounds.add(new EarthspurMiner());
		backgrounds.add(new Entertainer());
//		backgrounds.add(new FactionAgent());
//		backgrounds.add(new FarTraveler());
		backgrounds.add(new FolkHero());
//		backgrounds.add(new GateUrchin());
		backgrounds.add(new Gladiator());
		backgrounds.add(new GuildArtisan());
		backgrounds.add(new GuildMerchant());
//		backgrounds.add(new Harborfolk());
//		backgrounds.add(new HauntedOne());
//		backgrounds.add(new Heretic());
		backgrounds.add(new Hermit());
//		backgrounds.add(new HillsfarMerchant());
//		backgrounds.add(new HillsfarSmuggler());
//		backgrounds.add(new Inheritor());
//		backgrounds.add(new Initiate());
//		backgrounds.add(new Inquisitor());
//		backgrounds.add(new Investigator());
//		backgrounds.add(new IronRouteBandit());
		backgrounds.add(new Knight());
//		backgrounds.add(new KnightOfTheOrder());
//		backgrounds.add(new MercenaryVeteran());
//		backgrounds.add(new MulmasterAristocrat());
		backgrounds.add(new Noble());
		backgrounds.add(new Outlander());
//		backgrounds.add(new PhlanInsurgent());
//		backgrounds.add(new PhlanRefugee());
		backgrounds.add(new Pirate());
		backgrounds.add(new Sage());
		backgrounds.add(new Sailor());
//		backgrounds.add(new SecretIdentity());
//		backgrounds.add(new ShadeFanatic());
		backgrounds.add(new Soldier());
		backgrounds.add(new Spy());
//		backgrounds.add(new StojanowPrisoner());
//		backgrounds.add(new TicklebellyNomad());
//		backgrounds.add(new TradeSheriff());
//		backgrounds.add(new UrbanBountyHunter());
		backgrounds.add(new Urchin());
//		backgrounds.add(new UthgardtTribeMember());
//		backgrounds.add(new Vizier());
//		backgrounds.add(new WaterdhavianNoble());
		alignments = new ArrayList<String>();
		alignments.add("Chaotic Evil");
		alignments.add("Chaotic Neutral");
		alignments.add("Chaotic Good");
		alignments.add("Neutral Evil");
		alignments.add("Absolute Neutral");
		alignments.add("Neutral Good");
		alignments.add("Lawful Evil");
		alignments.add("Lawful Neutral");
		alignments.add("Lawful Good");
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
	public String [] convertArchytype() {
		String [] archetypeTypes = new String [archetype.size()];
		for (int i = 0; i < archetype.size(); i++) {
			archetypeTypes[i] = archetype.get(i);
		}
		return archetypeTypes;
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
	public String [] convertAlignments() {
		String [] alignmentTypes = new String [alignments.size()];
		for (int i = 0; i < alignments.size(); i++) {
			alignmentTypes[i] = alignments.get(i);
		}
		return alignmentTypes;
	}
	public void handleError(Exception error) {
		displayText(error.getMessage());
	}
	public void displayText (String sample) {
		JOptionPane.showMessageDialog(null, sample, "", JOptionPane.INFORMATION_MESSAGE, null);
	}
	public Frame getFrame() {
		return frame;
	}
	public List<Classes> getClasses() {
		return classes;
	}
	public List<String> getArchetype() {
		return archetype;
	}
	public List<Races> getRaces() {
		return races;
	}
	public List<Backgrounds> getBackgrounds() {
		return backgrounds;
	}
	public List<String> getAlignments() {
		return alignments;
	}
	
}

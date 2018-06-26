package charactermaker.view;

import charactermaker.controller.*;
import charactermaker.model.features.feats.racialfeat.*;
import charactermaker.model.races.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.border.*;

public class Panel2 extends JPanel {
	private Controller app;
	private Frame frame;
	private Panel1 panel1;
	private SpringLayout layout;
	private JLabel name;
	
	private JLabel holder;
	private JLabel characterNameLabel;
	private JTextField characterName;
	private JLabel classesLabel;
	private JComboBox classes;
	private JLabel archetypesLabel;
	private JComboBox archetypes;
	private JLabel levelLabel;
	private JFormattedTextField level;
	private JLabel backgroundsLabel;
	private JComboBox backgrounds;
	private JLabel racesLabel;
	private JComboBox races;
	private JLabel alignmentLabel;
	private JComboBox alignment;
	private JLabel xpLabel;
	private JFormattedTextField xp;
	private JLabel acLabel;
	private JTextField ac;
	private JLabel initiativeLabel;
	private JTextField initiative;
	private JLabel speedLabel;
	private JTextField speed;
	private JLabel hpLabel;
	private JTextField hpAmount;
	private JTextField hp;
	private JLabel hitDiceLabel;
	private JTextField hitDice;
	private JLabel deathSavesLabel;
	private JLabel success;
	private JLabel failure;
	private JCheckBox success1;
	private JCheckBox success2;
	private JCheckBox success3;
	private JCheckBox failure1;
	private JCheckBox failure2;
	private JCheckBox failure3;
	private JLabel inspirationLabel;
	private JCheckBox inspiration;
	private JLabel proficiencyLabel;
	private JTextField proficiency;
	private JLabel passiveWisdomLabel;
	private JTextField passiveWisdom;
	private JLabel strengthLabel;
	private JCheckBox strengthProficiency;
	private JFormattedTextField strength;
	private JTextField strengthBonus;
	private JTextField strengthSave;
	private JLabel athleticsLabel;
	private JCheckBox athleticsProficiency;
	private JTextField athletics;
	private JLabel dexterityLabel;
	private JCheckBox dexterityProficiency;
	private JFormattedTextField dexterity;
	private JTextField dexterityBonus;
	private JTextField dexteritySave;
	private JLabel acrobaticsLabel;
	private JCheckBox acrobaticsProficiency;
	private JTextField acrobatics;
	private JLabel sleightOfHandLabel;
	private JCheckBox sleightOfHandProficiency;
	private JTextField sleightOfHand;
	private JLabel stealthLabel;
	private JCheckBox stealthProficiency;
	private JTextField stealth;
	private JLabel constitutionLabel;
	private JCheckBox constitutionProficiency;
	private JFormattedTextField constitution;
	private JTextField constitutionBonus;
	private JTextField constitutionSave;
	private JLabel intelligenceLabel;
	private JCheckBox intelligenceProficiency;
	private JFormattedTextField intelligence;
	private JTextField intelligenceBonus;
	private JTextField intelligenceSave;
	private JLabel arcanaLabel;
	private JCheckBox arcanaProficiency;
	private JTextField arcana;
	private JLabel historyLabel;
	private JCheckBox historyProficiency;
	private JTextField history;
	private JLabel investigationLabel;
	private JCheckBox investigationProficiency;
	private JTextField investigation;
	private JLabel natureLabel;
	private JCheckBox natureProficiency;
	private JTextField nature;
	private JLabel religionLabel;
	private JCheckBox religionProficiency;
	private JTextField religion;
	private JLabel wisdomLabel;
	private JCheckBox wisdomProficiency;
	private JFormattedTextField wisdom;
	private JTextField wisdomBonus;
	private JTextField wisdomSave;
	private JLabel animalHandlingLabel;
	private JCheckBox animalHandlingProficiency;
	private JTextField animalHandling;
	private JLabel insightLabel;
	private JCheckBox insightProficiency;
	private JTextField insight;
	private JLabel medicineLabel;
	private JCheckBox medicineProficiency;
	private JTextField medicine;
	private JLabel perceptionLabel;
	private JCheckBox perceptionProficiency;
	private JTextField perception;
	private JLabel survivalLabel;
	private JCheckBox survivalProficiency;
	private JTextField survival;
	private JLabel charismaLabel;
	private JCheckBox charismaProficiency;
	private JFormattedTextField charisma;
	private JTextField charismaBonus;
	private JTextField charismaSave;
	private JLabel deceptionLabel;
	private JCheckBox deceptionProficiency;
	private JTextField deception;
	private JLabel intimidationLabel;
	private JCheckBox intimidationProficiency;
	private JTextField intimidation;
	private JLabel performanceLabel;
	private JCheckBox performanceProficiency;
	private JTextField performance;
	private JLabel persuasionLabel;
	private JCheckBox persuasionProficiency;
	private JTextField persuasion;
	private JLabel strengthSaveLabel;
	private JLabel dexteritySaveLabel;
	private JLabel constitutionSaveLabel;
	private JLabel intelligenceSaveLabel;
	private JLabel wisdomSaveLabel;
	private JLabel charismaSaveLabel;
	
	
	private JLabel descriptionLabel;
	private JScrollPane descriptionArea;
	private static JTextArea description;
	private JLabel heightLabel;
	private JTextField height;
	private JLabel weightLabel;
	private JTextField weight;
	private JLabel ageLabel;
	private JTextField age;
	private JLabel bookLabel;
	private JTextField book;
	
	private JTable featsTable;
	private JScrollPane featsScroll;
	
	private JLabel spellsLabel;
//	private JTable spellsTable;
	
	private JButton stats;
	private JButton info;
	private JButton feats;
	private JButton spells;
	private JButton newCharacter;
	
	public Panel2(Controller app) {
		super();
		this.app = app;
		frame = app.getFrame();
		panel1 = frame.getPanel1();
		layout = new SpringLayout();
		name = new JLabel("Character Creator");
		layout.putConstraint(SpringLayout.NORTH, name, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, name, 60, SpringLayout.NORTH, this);
		name.setToolTipText("Create a new Character for Dungeons and Dragons!");
		name.setOpaque(true);
		name.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		name.setBackground(Color.WHITE);
		layout.putConstraint(SpringLayout.WEST, name, 250, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, name, -250, SpringLayout.EAST, this);
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		holder = new JLabel();
		layout.putConstraint(SpringLayout.NORTH, holder, 10, SpringLayout.SOUTH, name);
		layout.putConstraint(SpringLayout.WEST, holder, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, holder, -10, SpringLayout.EAST, this);
		holder.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 0)));
		characterNameLabel = new JLabel("Name");
		characterNameLabel.setToolTipText("Character Name");
		layout.putConstraint(SpringLayout.NORTH, characterNameLabel, 10, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.WEST, characterNameLabel, 10, SpringLayout.WEST, holder);
		layout.putConstraint(SpringLayout.SOUTH, characterNameLabel, 40, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.EAST, characterNameLabel, 110, SpringLayout.WEST, holder);
		characterNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		characterNameLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		characterNameLabel.setOpaque(true);
		characterName = new JTextField();
		characterName.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, characterName, 0, SpringLayout.NORTH, characterNameLabel);
		layout.putConstraint(SpringLayout.WEST, characterName, 10, SpringLayout.EAST, characterNameLabel);
		layout.putConstraint(SpringLayout.SOUTH, characterName, 0, SpringLayout.SOUTH, characterNameLabel);
		layout.putConstraint(SpringLayout.EAST, characterName, 160, SpringLayout.EAST, characterNameLabel);
		classesLabel = new JLabel("Class");
		classesLabel.setToolTipText("Character Class");
		layout.putConstraint(SpringLayout.NORTH, classesLabel, 5, SpringLayout.SOUTH, characterNameLabel);
		layout.putConstraint(SpringLayout.SOUTH, classesLabel, 35, SpringLayout.SOUTH, characterNameLabel);
		classesLabel.setOpaque(true);
		classesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		classesLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.WEST, classesLabel, 0, SpringLayout.WEST, characterNameLabel);
		layout.putConstraint(SpringLayout.EAST, classesLabel, 0, SpringLayout.EAST, characterNameLabel);
		classes = new JComboBox();
		classes.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		layout.putConstraint(SpringLayout.NORTH, classes, 0, SpringLayout.NORTH, classesLabel);
		layout.putConstraint(SpringLayout.WEST, classes, 0, SpringLayout.WEST, characterName);
		layout.putConstraint(SpringLayout.SOUTH, classes, 0, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.EAST, classes, 0, SpringLayout.EAST, characterName);
		archetypesLabel = new JLabel("Archetype");
		archetypesLabel.setToolTipText("Character Archetype");
		archetypesLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		archetypesLabel.setOpaque(true);
		archetypesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, archetypesLabel, 5, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.WEST, archetypesLabel, 0, SpringLayout.WEST, classesLabel);
		layout.putConstraint(SpringLayout.SOUTH, archetypesLabel, 35, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.EAST, archetypesLabel, 0, SpringLayout.EAST, classesLabel);
		archetypes = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, archetypes, 0, SpringLayout.NORTH, archetypesLabel);
		layout.putConstraint(SpringLayout.WEST, archetypes, 0, SpringLayout.WEST, classes);
		layout.putConstraint(SpringLayout.SOUTH, archetypes, 0, SpringLayout.SOUTH, archetypesLabel);
		layout.putConstraint(SpringLayout.EAST, archetypes, 0, SpringLayout.EAST, classes);
		levelLabel = new JLabel("Level");
		levelLabel.setToolTipText("Character Level");
		layout.putConstraint(SpringLayout.WEST, levelLabel, 0, SpringLayout.WEST, archetypesLabel);
		layout.putConstraint(SpringLayout.EAST, levelLabel, 0, SpringLayout.EAST, archetypesLabel);
		levelLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		levelLabel.setOpaque(true);
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter levelformatter = new NumberFormatter(format);
		levelformatter.setValueClass(Integer.class);
		levelformatter.setMinimum(1);
		levelformatter.setMaximum(20);
//		formatter.setCommitsOnValidEdit(true);
		level = new JFormattedTextField(levelformatter);
		level.setToolTipText("Level between 1 & 20");
		level.setText("1");
		level.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, level, 0, SpringLayout.NORTH, levelLabel);
		layout.putConstraint(SpringLayout.WEST, level, 0, SpringLayout.WEST, classes);
		layout.putConstraint(SpringLayout.SOUTH, level, 0, SpringLayout.SOUTH, levelLabel);
		layout.putConstraint(SpringLayout.EAST, level, 0, SpringLayout.EAST, classes);
		backgroundsLabel = new JLabel("Background");
		layout.putConstraint(SpringLayout.NORTH, backgroundsLabel, 5, SpringLayout.SOUTH, archetypesLabel);
		layout.putConstraint(SpringLayout.SOUTH, backgroundsLabel, 35, SpringLayout.SOUTH, archetypesLabel);
		backgroundsLabel.setToolTipText("Character Background");
		layout.putConstraint(SpringLayout.WEST, backgroundsLabel, 0, SpringLayout.WEST, levelLabel);
		layout.putConstraint(SpringLayout.EAST, backgroundsLabel, 0, SpringLayout.EAST, levelLabel);
		backgroundsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundsLabel.setOpaque(true);
		backgroundsLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		backgrounds = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, backgrounds, 0, SpringLayout.NORTH, backgroundsLabel);
		layout.putConstraint(SpringLayout.WEST, backgrounds, 0, SpringLayout.WEST, level);
		layout.putConstraint(SpringLayout.SOUTH, backgrounds, 0, SpringLayout.SOUTH, backgroundsLabel);
		layout.putConstraint(SpringLayout.EAST, backgrounds, 0, SpringLayout.EAST, level);
		racesLabel = new JLabel("Races");
		racesLabel.setOpaque(true);
		racesLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		racesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, racesLabel, 5, SpringLayout.SOUTH, backgroundsLabel);
		layout.putConstraint(SpringLayout.WEST, racesLabel, 0, SpringLayout.WEST, backgroundsLabel);
		layout.putConstraint(SpringLayout.SOUTH, racesLabel, 35, SpringLayout.SOUTH, backgroundsLabel);
		layout.putConstraint(SpringLayout.EAST, racesLabel, 0, SpringLayout.EAST, backgroundsLabel);
		races = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, races, 0, SpringLayout.NORTH, racesLabel);
		layout.putConstraint(SpringLayout.WEST, races, 0, SpringLayout.WEST, backgrounds);
		layout.putConstraint(SpringLayout.SOUTH, races, 0, SpringLayout.SOUTH, racesLabel);
		layout.putConstraint(SpringLayout.EAST, races, 0, SpringLayout.EAST, backgrounds);
		alignmentLabel = new JLabel("Alignment");
		layout.putConstraint(SpringLayout.NORTH, levelLabel, 5, SpringLayout.SOUTH, alignmentLabel);
		layout.putConstraint(SpringLayout.SOUTH, levelLabel, 35, SpringLayout.SOUTH, alignmentLabel);
		alignmentLabel.setOpaque(true);
		alignmentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		alignmentLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, alignmentLabel, 5, SpringLayout.SOUTH, racesLabel);
		layout.putConstraint(SpringLayout.WEST, alignmentLabel, 0, SpringLayout.WEST, racesLabel);
		layout.putConstraint(SpringLayout.SOUTH, alignmentLabel, 35, SpringLayout.SOUTH, racesLabel);
		layout.putConstraint(SpringLayout.EAST, alignmentLabel, 0, SpringLayout.EAST, racesLabel);
		alignment = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, alignment, 0, SpringLayout.NORTH, alignmentLabel);
		layout.putConstraint(SpringLayout.WEST, alignment, 0, SpringLayout.WEST, races);
		layout.putConstraint(SpringLayout.SOUTH, alignment, 0, SpringLayout.SOUTH, alignmentLabel);
		layout.putConstraint(SpringLayout.EAST, alignment, 0, SpringLayout.EAST, races);
		xpLabel = new JLabel("XP");
		layout.putConstraint(SpringLayout.NORTH, xpLabel, 5, SpringLayout.SOUTH, levelLabel);
		layout.putConstraint(SpringLayout.WEST, xpLabel, 0, SpringLayout.WEST, alignmentLabel);
		layout.putConstraint(SpringLayout.SOUTH, xpLabel, 35, SpringLayout.SOUTH, levelLabel);
		layout.putConstraint(SpringLayout.EAST, xpLabel, 0, SpringLayout.EAST, alignmentLabel);
		xpLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		xpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xpLabel.setOpaque(true);
		NumberFormatter xpformatter = new NumberFormatter(format);
		xpformatter.setValueClass(Integer.class);
		xpformatter.setMinimum(0);
		xpformatter.setMaximum(Integer.MAX_VALUE);
		xp = new JFormattedTextField(xpformatter);
		xp.setText("0");
		xp.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, xp, 0, SpringLayout.NORTH, xpLabel);
		layout.putConstraint(SpringLayout.WEST, xp, 0, SpringLayout.WEST, alignment);
		layout.putConstraint(SpringLayout.SOUTH, xp, 0, SpringLayout.SOUTH, xpLabel);
		layout.putConstraint(SpringLayout.EAST, xp, 0, SpringLayout.EAST, alignment);
		acLabel = new JLabel("AC");
		layout.putConstraint(SpringLayout.NORTH, acLabel, 5, SpringLayout.SOUTH, xpLabel);
		layout.putConstraint(SpringLayout.WEST, acLabel, 0, SpringLayout.WEST, xpLabel);
		layout.putConstraint(SpringLayout.SOUTH, acLabel, 35, SpringLayout.SOUTH, xpLabel);
		layout.putConstraint(SpringLayout.EAST, acLabel, 0, SpringLayout.EAST, xpLabel);
		acLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		acLabel.setHorizontalAlignment(SwingConstants.CENTER);
		acLabel.setOpaque(true);
		ac = new JTextField();
		ac.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, ac, 0, SpringLayout.NORTH, acLabel);
		layout.putConstraint(SpringLayout.WEST, ac, 0, SpringLayout.WEST, xp);
		layout.putConstraint(SpringLayout.SOUTH, ac, 0, SpringLayout.SOUTH, acLabel);
		layout.putConstraint(SpringLayout.EAST, ac, 0, SpringLayout.EAST, xp);
		initiativeLabel = new JLabel("Initiative");
		initiativeLabel.setOpaque(true);
		initiativeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		initiativeLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, initiativeLabel, 5, SpringLayout.SOUTH, acLabel);
		layout.putConstraint(SpringLayout.WEST, initiativeLabel, 0, SpringLayout.WEST, acLabel);
		layout.putConstraint(SpringLayout.SOUTH, initiativeLabel, 35, SpringLayout.SOUTH, acLabel);
		layout.putConstraint(SpringLayout.EAST, initiativeLabel, 0, SpringLayout.EAST, acLabel);
		initiative = new JTextField();
		initiative.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, initiative, 0, SpringLayout.NORTH, initiativeLabel);
		layout.putConstraint(SpringLayout.WEST, initiative, 0, SpringLayout.WEST, ac);
		layout.putConstraint(SpringLayout.SOUTH, initiative, 0, SpringLayout.SOUTH, initiativeLabel);
		layout.putConstraint(SpringLayout.EAST, initiative, 0, SpringLayout.EAST, ac);
		speedLabel = new JLabel("Speed");
		layout.putConstraint(SpringLayout.NORTH, speedLabel, 5, SpringLayout.SOUTH, initiativeLabel);
		layout.putConstraint(SpringLayout.WEST, speedLabel, 0, SpringLayout.WEST, initiativeLabel);
		layout.putConstraint(SpringLayout.SOUTH, speedLabel, 35, SpringLayout.SOUTH, initiativeLabel);
		layout.putConstraint(SpringLayout.EAST, speedLabel, 0, SpringLayout.EAST, initiativeLabel);
		speedLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		speedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		speedLabel.setOpaque(true);
		speed = new JTextField();
		layout.putConstraint(SpringLayout.NORTH, speed, 0, SpringLayout.NORTH, speedLabel);
		layout.putConstraint(SpringLayout.WEST, speed, 0, SpringLayout.WEST, initiative);
		layout.putConstraint(SpringLayout.SOUTH, speed, 0, SpringLayout.SOUTH, speedLabel);
		layout.putConstraint(SpringLayout.EAST, speed, 0, SpringLayout.EAST, initiative);
		speed.setHorizontalAlignment(SwingConstants.CENTER);
		hpLabel = new JLabel("Hit Points");
		hpLabel.setOpaque(true);
		hpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hpLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, hpLabel, 5, SpringLayout.SOUTH, speedLabel);
		layout.putConstraint(SpringLayout.WEST, hpLabel, 0, SpringLayout.WEST, speedLabel);
		layout.putConstraint(SpringLayout.SOUTH, hpLabel, 35, SpringLayout.SOUTH, speedLabel);
		layout.putConstraint(SpringLayout.EAST, hpLabel, 0, SpringLayout.EAST, speedLabel);
		hpAmount = new JTextField();
		hpAmount.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, hpAmount, 0, SpringLayout.NORTH, hpLabel);
		layout.putConstraint(SpringLayout.WEST, hpAmount, 0, SpringLayout.WEST, speed);
		layout.putConstraint(SpringLayout.SOUTH, hpAmount, 0, SpringLayout.SOUTH, hpLabel);
		layout.putConstraint(SpringLayout.EAST, hpAmount, 75, SpringLayout.EAST, hpLabel);
		hp = new JTextField();
		hp.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, hp, 0, SpringLayout.NORTH, hpAmount);
		layout.putConstraint(SpringLayout.WEST, hp, 0, SpringLayout.EAST, hpAmount);
		layout.putConstraint(SpringLayout.SOUTH, hp, 0, SpringLayout.SOUTH, hpAmount);
		layout.putConstraint(SpringLayout.EAST, hp, 0, SpringLayout.EAST, speed);
		hitDiceLabel = new JLabel("Hit Dice");
		layout.putConstraint(SpringLayout.NORTH, hitDiceLabel, 5, SpringLayout.SOUTH, hpLabel);
		layout.putConstraint(SpringLayout.WEST, hitDiceLabel, 0, SpringLayout.WEST, hpLabel);
		layout.putConstraint(SpringLayout.SOUTH, hitDiceLabel, 35, SpringLayout.SOUTH, hpLabel);
		layout.putConstraint(SpringLayout.EAST, hitDiceLabel, 0, SpringLayout.EAST, hpLabel);
		hitDiceLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		hitDiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hitDiceLabel.setOpaque(true);
		hitDice = new JTextField();
		layout.putConstraint(SpringLayout.NORTH, hitDice, 0, SpringLayout.NORTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.WEST, hitDice, 0, SpringLayout.WEST, hpAmount);
		layout.putConstraint(SpringLayout.SOUTH, hitDice, 0, SpringLayout.SOUTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.EAST, hitDice, 0, SpringLayout.EAST, hp);
		hitDice.setHorizontalAlignment(SwingConstants.CENTER);
		deathSavesLabel = new JLabel("Death Saves");
		deathSavesLabel.setOpaque(true);
		deathSavesLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		deathSavesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, deathSavesLabel, 5, SpringLayout.SOUTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.WEST, deathSavesLabel, 0, SpringLayout.WEST, hitDiceLabel);
		layout.putConstraint(SpringLayout.SOUTH, deathSavesLabel, 35, SpringLayout.SOUTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.EAST, deathSavesLabel, 0, SpringLayout.EAST, hitDiceLabel);
		success = new JLabel("Success");
		success.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		success.setHorizontalAlignment(SwingConstants.CENTER);
		success.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, success, 0, SpringLayout.NORTH, deathSavesLabel);
		layout.putConstraint(SpringLayout.WEST, success, 0, SpringLayout.WEST, hitDice);
		layout.putConstraint(SpringLayout.SOUTH, success, 15, SpringLayout.NORTH, deathSavesLabel);
		failure = new JLabel("Failure");
		failure.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layout.putConstraint(SpringLayout.NORTH, failure, -15, SpringLayout.SOUTH, deathSavesLabel);
		layout.putConstraint(SpringLayout.WEST, failure, 0, SpringLayout.WEST, success);
		layout.putConstraint(SpringLayout.SOUTH, failure, 0, SpringLayout.SOUTH, deathSavesLabel);
		layout.putConstraint(SpringLayout.EAST, failure, 0, SpringLayout.EAST, success);
		failure.setOpaque(true);
		failure.setHorizontalAlignment(SwingConstants.CENTER);
		success1 = new JCheckBox();
		layout.putConstraint(SpringLayout.WEST, success1, 10, SpringLayout.EAST, success);
		success1.setOpaque(false);
		layout.putConstraint(SpringLayout.NORTH, success1, 0, SpringLayout.NORTH, success);
		layout.putConstraint(SpringLayout.SOUTH, success1, 0, SpringLayout.SOUTH, success);
		success2 = new JCheckBox();
		success2.setOpaque(false);
		layout.putConstraint(SpringLayout.NORTH, success2, 0, SpringLayout.NORTH, success1);
		layout.putConstraint(SpringLayout.WEST, success2, 5, SpringLayout.EAST, success1);
		layout.putConstraint(SpringLayout.SOUTH, success2, 0, SpringLayout.SOUTH, success1);
		success3 = new JCheckBox();
		success3.setOpaque(false);
		layout.putConstraint(SpringLayout.NORTH, success3, 0, SpringLayout.NORTH, success2);
		layout.putConstraint(SpringLayout.WEST, success3, 5, SpringLayout.EAST, success2);
		layout.putConstraint(SpringLayout.SOUTH, success3, 0, SpringLayout.SOUTH, success2);
		failure1 = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, failure1, 0, SpringLayout.NORTH, failure);
		layout.putConstraint(SpringLayout.WEST, failure1, 10, SpringLayout.EAST, failure);
		layout.putConstraint(SpringLayout.SOUTH, failure1, 0, SpringLayout.SOUTH, failure);
		failure1.setOpaque(false);
		failure2 = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, failure2, 0, SpringLayout.NORTH, failure1);
		layout.putConstraint(SpringLayout.WEST, failure2, 5, SpringLayout.EAST, failure1);
		layout.putConstraint(SpringLayout.SOUTH, failure2, 0, SpringLayout.SOUTH, failure1);
		failure2.setOpaque(false);
		failure3 = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, failure3, 0, SpringLayout.NORTH, failure2);
		layout.putConstraint(SpringLayout.WEST, failure3, 5, SpringLayout.EAST, failure2);
		layout.putConstraint(SpringLayout.SOUTH, failure3, 0, SpringLayout.SOUTH, failure2);
		failure3.setOpaque(false);
		inspirationLabel = new JLabel("Inspiration");
		layout.putConstraint(SpringLayout.NORTH, inspirationLabel, 5, SpringLayout.SOUTH, deathSavesLabel);
		layout.putConstraint(SpringLayout.WEST, inspirationLabel, 0, SpringLayout.WEST, deathSavesLabel);
		layout.putConstraint(SpringLayout.SOUTH, inspirationLabel, 35, SpringLayout.SOUTH, deathSavesLabel);
		layout.putConstraint(SpringLayout.EAST, inspirationLabel, 0, SpringLayout.EAST, deathSavesLabel);
		inspirationLabel.setOpaque(true);
		inspirationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inspirationLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		inspiration = new JCheckBox();
		inspiration.setOpaque(true);
		inspiration.setText("Inspired");
		inspiration.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, inspiration, 0, SpringLayout.NORTH, inspirationLabel);
		layout.putConstraint(SpringLayout.WEST, inspiration, 0, SpringLayout.WEST, hitDice);
		layout.putConstraint(SpringLayout.SOUTH, inspiration, 0, SpringLayout.SOUTH, inspirationLabel);
		layout.putConstraint(SpringLayout.EAST, inspiration, 0, SpringLayout.EAST, hitDice);
		proficiencyLabel = new JLabel("Proficiency");
		layout.putConstraint(SpringLayout.NORTH, proficiencyLabel, 5, SpringLayout.SOUTH, inspirationLabel);
		layout.putConstraint(SpringLayout.WEST, proficiencyLabel, 0, SpringLayout.WEST, inspirationLabel);
		layout.putConstraint(SpringLayout.SOUTH, proficiencyLabel, 35, SpringLayout.SOUTH, inspirationLabel);
		layout.putConstraint(SpringLayout.EAST, proficiencyLabel, 0, SpringLayout.EAST, inspirationLabel);
		proficiencyLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		proficiencyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		proficiencyLabel.setOpaque(true);
		proficiency = new JTextField();
		proficiency.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, proficiency, 0, SpringLayout.NORTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.WEST, proficiency, 0, SpringLayout.WEST, hitDice);
		layout.putConstraint(SpringLayout.SOUTH, proficiency, 0, SpringLayout.SOUTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.EAST, proficiency, 0, SpringLayout.EAST, hitDice);
		passiveWisdomLabel = new JLabel("Passive Wis");
		passiveWisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passiveWisdomLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		passiveWisdomLabel.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, passiveWisdomLabel, 5, SpringLayout.SOUTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.WEST, passiveWisdomLabel, 0, SpringLayout.WEST, proficiencyLabel);
		layout.putConstraint(SpringLayout.SOUTH, passiveWisdomLabel, 35, SpringLayout.SOUTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.EAST, passiveWisdomLabel, 0, SpringLayout.EAST, proficiencyLabel);
		passiveWisdom = new JTextField();
		passiveWisdom.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, passiveWisdom, 0, SpringLayout.NORTH, passiveWisdomLabel);
		layout.putConstraint(SpringLayout.WEST, passiveWisdom, 0, SpringLayout.WEST, proficiency);
		layout.putConstraint(SpringLayout.SOUTH, passiveWisdom, 0, SpringLayout.SOUTH, passiveWisdomLabel);
		layout.putConstraint(SpringLayout.EAST, passiveWisdom, 0, SpringLayout.EAST, proficiency);
		NumberFormatter skillFormatter = new NumberFormatter(format);
		skillFormatter.setValueClass(Integer.class);
		skillFormatter.setMinimum(0);
		skillFormatter.setMaximum(30);
		strengthLabel = new JLabel("Strength");
		layout.putConstraint(SpringLayout.EAST, strengthLabel, 210, SpringLayout.EAST, characterName);
		strengthLabel.setOpaque(true);
		strengthLabel.setHorizontalAlignment(SwingConstants.CENTER);
		strengthLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, strengthLabel, 0, SpringLayout.NORTH, characterName);
		layout.putConstraint(SpringLayout.WEST, strengthLabel, 10, SpringLayout.EAST, characterName);
		layout.putConstraint(SpringLayout.SOUTH, strengthLabel, 0, SpringLayout.SOUTH, characterName);
		strength = new JFormattedTextField(skillFormatter);
		layout.putConstraint(SpringLayout.WEST, strength, 10, SpringLayout.WEST, strengthLabel);
		layout.putConstraint(SpringLayout.EAST, strength, 95, SpringLayout.WEST, strengthLabel);
		strength.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, strength, 5, SpringLayout.SOUTH, strengthLabel);
		layout.putConstraint(SpringLayout.SOUTH, strength, 35, SpringLayout.SOUTH, strengthLabel);
		strength.setText("0");
		strengthBonus = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.WEST, strengthBonus, -95, SpringLayout.EAST, strengthLabel);
		layout.putConstraint(SpringLayout.EAST, strengthBonus, -10, SpringLayout.EAST, strengthLabel);
		strengthBonus.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, strengthBonus, 5, SpringLayout.SOUTH, strengthLabel);
		layout.putConstraint(SpringLayout.SOUTH, strengthBonus, 0, SpringLayout.SOUTH, strength);
		strengthSave = new JTextField("+ 0");
		strengthSave.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, strengthSave, 5, SpringLayout.SOUTH, strengthBonus);
		layout.putConstraint(SpringLayout.WEST, strengthSave, 0, SpringLayout.WEST, strengthBonus);
		layout.putConstraint(SpringLayout.SOUTH, strengthSave, 35, SpringLayout.SOUTH, strengthBonus);
		layout.putConstraint(SpringLayout.EAST, strengthSave, 0, SpringLayout.EAST, strengthBonus);
		dexterityLabel = new JLabel("Dexterity");
		dexterityLabel.setOpaque(true);
		dexterityLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.WEST, dexterityLabel, 0, SpringLayout.WEST, strengthLabel);
		layout.putConstraint(SpringLayout.EAST, dexterityLabel, 0, SpringLayout.EAST, strengthLabel);
		dexterityLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dexterity = new JFormattedTextField(skillFormatter);
		dexterity.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, dexterity, 5, SpringLayout.SOUTH, dexterityLabel);
		layout.putConstraint(SpringLayout.WEST, dexterity, 10, SpringLayout.WEST, dexterityLabel);
		layout.putConstraint(SpringLayout.SOUTH, dexterity, 35, SpringLayout.SOUTH, dexterityLabel);
		layout.putConstraint(SpringLayout.EAST, dexterity, 95, SpringLayout.WEST, dexterityLabel);
		dexterity.setText("0");
		dexterityBonus = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, dexterityBonus, 5, SpringLayout.SOUTH, dexterityLabel);
		layout.putConstraint(SpringLayout.WEST, dexterityBonus, -95, SpringLayout.EAST, dexterityLabel);
		layout.putConstraint(SpringLayout.SOUTH, dexterityBonus, 35, SpringLayout.SOUTH, dexterityLabel);
		layout.putConstraint(SpringLayout.EAST, dexterityBonus, -10, SpringLayout.EAST, dexterityLabel);
		dexterityBonus.setHorizontalAlignment(SwingConstants.CENTER);
		dexteritySave = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, dexteritySave, 5, SpringLayout.SOUTH, dexterityBonus);
		layout.putConstraint(SpringLayout.WEST, dexteritySave, 0, SpringLayout.WEST, dexterityBonus);
		layout.putConstraint(SpringLayout.SOUTH, dexteritySave, 35, SpringLayout.SOUTH, dexterityBonus);
		layout.putConstraint(SpringLayout.EAST, dexteritySave, 0, SpringLayout.EAST, dexterityBonus);
		dexteritySave.setHorizontalAlignment(SwingConstants.CENTER);
		constitution = new JFormattedTextField(skillFormatter);
		constitution.setHorizontalAlignment(SwingConstants.CENTER);
		constitution.setText("0");
		constitutionBonus = new JTextField("+ 0");
		constitutionBonus.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionSave = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, constitutionSave, 5, SpringLayout.SOUTH, constitutionBonus);
		layout.putConstraint(SpringLayout.WEST, constitutionSave, 0, SpringLayout.WEST, constitutionBonus);
		layout.putConstraint(SpringLayout.SOUTH, constitutionSave, 35, SpringLayout.SOUTH, constitutionBonus);
		layout.putConstraint(SpringLayout.EAST, constitutionSave, 0, SpringLayout.EAST, constitutionBonus);
		constitutionSave.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceLabel = new JLabel("Intelligence");
		intelligenceLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		intelligenceLabel.setOpaque(true);
		intelligenceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		intelligence = new JFormattedTextField(skillFormatter);
		layout.putConstraint(SpringLayout.NORTH, intelligence, 5, SpringLayout.SOUTH, intelligenceLabel);
		layout.putConstraint(SpringLayout.WEST, intelligence, 10, SpringLayout.WEST, intelligenceLabel);
		layout.putConstraint(SpringLayout.SOUTH, intelligence, 35, SpringLayout.SOUTH, intelligenceLabel);
		layout.putConstraint(SpringLayout.EAST, intelligence, 95, SpringLayout.WEST, intelligenceLabel);
		intelligence.setHorizontalAlignment(SwingConstants.CENTER);
		intelligence.setText("0");
		intelligenceBonus = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, intelligenceBonus, 5, SpringLayout.SOUTH, intelligenceLabel);
		layout.putConstraint(SpringLayout.WEST, intelligenceBonus, -95, SpringLayout.EAST, intelligenceLabel);
		layout.putConstraint(SpringLayout.SOUTH, intelligenceBonus, 35, SpringLayout.SOUTH, intelligenceLabel);
		layout.putConstraint(SpringLayout.EAST, intelligenceBonus, -10, SpringLayout.EAST, intelligenceLabel);
		intelligenceBonus.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceSave = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, intelligenceSave, 5, SpringLayout.SOUTH, intelligenceBonus);
		layout.putConstraint(SpringLayout.WEST, intelligenceSave, 0, SpringLayout.WEST, intelligenceBonus);
		layout.putConstraint(SpringLayout.SOUTH, intelligenceSave, 35, SpringLayout.SOUTH, intelligenceBonus);
		layout.putConstraint(SpringLayout.EAST, intelligenceSave, 0, SpringLayout.EAST, intelligenceBonus);
		intelligenceSave.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomLabel = new JLabel("Wisdom");
		layout.putConstraint(SpringLayout.WEST, wisdomLabel, 0, SpringLayout.WEST, intelligenceLabel);
		layout.putConstraint(SpringLayout.EAST, wisdomLabel, 0, SpringLayout.EAST, intelligenceLabel);
		wisdomLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		wisdomLabel.setOpaque(true);
		wisdomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wisdom = new JFormattedTextField(skillFormatter);
		layout.putConstraint(SpringLayout.NORTH, wisdom, 5, SpringLayout.SOUTH, wisdomLabel);
		layout.putConstraint(SpringLayout.WEST, wisdom, 10, SpringLayout.WEST, wisdomLabel);
		layout.putConstraint(SpringLayout.SOUTH, wisdom, 35, SpringLayout.SOUTH, wisdomLabel);
		layout.putConstraint(SpringLayout.EAST, wisdom, 95, SpringLayout.WEST, wisdomLabel);
		wisdom.setHorizontalAlignment(SwingConstants.CENTER);
		wisdom.setText("0");
		wisdomBonus = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, wisdomBonus, 5, SpringLayout.SOUTH, wisdomLabel);
		layout.putConstraint(SpringLayout.WEST, wisdomBonus, -95, SpringLayout.EAST, wisdomLabel);
		layout.putConstraint(SpringLayout.SOUTH, wisdomBonus, 35, SpringLayout.SOUTH, wisdomLabel);
		layout.putConstraint(SpringLayout.EAST, wisdomBonus, -10, SpringLayout.EAST, wisdomLabel);
		wisdomBonus.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomSave = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, wisdomSave, 5, SpringLayout.SOUTH, wisdomBonus);
		layout.putConstraint(SpringLayout.WEST, wisdomSave, 0, SpringLayout.WEST, wisdomBonus);
		layout.putConstraint(SpringLayout.SOUTH, wisdomSave, 35, SpringLayout.SOUTH, wisdomBonus);
		layout.putConstraint(SpringLayout.EAST, wisdomSave, 0, SpringLayout.EAST, wisdomBonus);
		wisdomSave.setHorizontalAlignment(SwingConstants.CENTER);
		charismaLabel = new JLabel("Charisma");
		layout.putConstraint(SpringLayout.WEST, charismaLabel, 0, SpringLayout.WEST, wisdomLabel);
		layout.putConstraint(SpringLayout.EAST, charismaLabel, 0, SpringLayout.EAST, wisdomLabel);
		charismaLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		charismaLabel.setOpaque(true);
		charismaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		charisma = new JFormattedTextField(skillFormatter);
		layout.putConstraint(SpringLayout.NORTH, charisma, 5, SpringLayout.SOUTH, charismaLabel);
		layout.putConstraint(SpringLayout.WEST, charisma, 10, SpringLayout.WEST, charismaLabel);
		layout.putConstraint(SpringLayout.SOUTH, charisma, 35, SpringLayout.SOUTH, charismaLabel);
		layout.putConstraint(SpringLayout.EAST, charisma, 95, SpringLayout.WEST, charismaLabel);
		charisma.setHorizontalAlignment(SwingConstants.CENTER);
		charisma.setText("0");
		charismaBonus = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, charismaBonus, 5, SpringLayout.SOUTH, charismaLabel);
		layout.putConstraint(SpringLayout.WEST, charismaBonus, -95, SpringLayout.EAST, charismaLabel);
		layout.putConstraint(SpringLayout.SOUTH, charismaBonus, 35, SpringLayout.SOUTH, charismaLabel);
		layout.putConstraint(SpringLayout.EAST, charismaBonus, -10, SpringLayout.EAST, charismaLabel);
		charismaBonus.setHorizontalAlignment(SwingConstants.CENTER);
		charismaSave = new JTextField("+ 0");
		layout.putConstraint(SpringLayout.NORTH, charismaSave, 5, SpringLayout.SOUTH, charismaBonus);
		layout.putConstraint(SpringLayout.WEST, charismaSave, 0, SpringLayout.WEST, charismaBonus);
		layout.putConstraint(SpringLayout.SOUTH, charismaSave, 35, SpringLayout.SOUTH, charismaBonus);
		layout.putConstraint(SpringLayout.EAST, charismaSave, 0, SpringLayout.EAST, charismaBonus);
		charismaSave.setHorizontalAlignment(SwingConstants.CENTER);
		athleticsLabel = new JLabel("Athletics");
		athleticsProficiency = new JCheckBox();
		athletics = new JTextField("+ 0");
		acrobaticsLabel = new JLabel("Acrobatics");
		acrobaticsProficiency = new JCheckBox();
		acrobatics = new JTextField("+ 0");
		sleightOfHandLabel = new JLabel("Sleight of Hand");
		sleightOfHandProficiency = new JCheckBox();
		sleightOfHand = new JTextField("+ 0");
		stealthLabel = new JLabel("Stealth");
		stealthProficiency = new JCheckBox();
		stealth = new JTextField("+ 0");
		arcanaLabel = new JLabel("Arcana");
		arcanaProficiency = new JCheckBox();
		arcana = new JTextField("+ 0");
		historyLabel = new JLabel("History");
		historyProficiency = new JCheckBox();
		history = new JTextField("+ 0");
		investigationLabel = new JLabel("Investigation");
		investigationProficiency = new JCheckBox();
		investigation = new JTextField("+ 0");
		natureLabel = new JLabel("Nature");
		natureProficiency = new JCheckBox();
		nature = new JTextField("+ 0");
		religionLabel = new JLabel("Religion");
		religionProficiency = new JCheckBox();
		religion = new JTextField("+ 0");
		animalHandlingLabel = new JLabel("Animal Handling");
		animalHandlingProficiency = new JCheckBox();
		animalHandling = new JTextField("+ 0");
		insightLabel = new JLabel("Insight");
		insightProficiency = new JCheckBox();
		insight = new JTextField("+ 0");
		medicineLabel = new JLabel("Medicine");
		medicineProficiency = new JCheckBox();
		medicine = new JTextField("+ 0");
		perceptionLabel = new JLabel("Perception");
		perceptionProficiency = new JCheckBox();
		perception = new JTextField("+ 0");
		survivalLabel = new JLabel("Survival");
		survivalProficiency = new JCheckBox();
		survival = new JTextField("+ 0");
		deceptionLabel = new JLabel("Deception");
		deceptionProficiency = new JCheckBox();
		deception = new JTextField("+ 0");
		intimidationLabel = new JLabel("Intimidation");
		intimidationProficiency = new JCheckBox();
		intimidation = new JTextField("+ 0");
		performanceLabel = new JLabel("Performance");
		performanceProficiency = new JCheckBox();
		performance = new JTextField("+ 0");
		persuasionLabel = new JLabel("Persuasion");
		persuasionProficiency = new JCheckBox();
		persuasion = new JTextField("+ 0");
		strengthSaveLabel = new JLabel("Saving Throw");
		dexteritySaveLabel = new JLabel("Saving Throw");
		constitutionSaveLabel = new JLabel("Saving Throw");
		intelligenceSaveLabel = new JLabel("Saving Throw");
		wisdomSaveLabel = new JLabel("Saving Throw");
		charismaSaveLabel = new JLabel("Saving Throw");
		strengthProficiency = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, dexterityLabel, 5, SpringLayout.SOUTH, strengthProficiency);
		layout.putConstraint(SpringLayout.SOUTH, dexterityLabel, 35, SpringLayout.SOUTH, strengthProficiency);
		strengthProficiency.setText("Proficient");
		strengthProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, strengthProficiency, 5, SpringLayout.SOUTH, strength);
		layout.putConstraint(SpringLayout.WEST, strengthProficiency, 0, SpringLayout.WEST, strength);
		layout.putConstraint(SpringLayout.SOUTH, strengthProficiency, 35, SpringLayout.SOUTH, strength);
		layout.putConstraint(SpringLayout.EAST, strengthProficiency, 0, SpringLayout.EAST, strength);
		dexterityProficiency = new JCheckBox();
		dexterityProficiency.setText("Proficient");
		layout.putConstraint(SpringLayout.NORTH, dexterityProficiency, 5, SpringLayout.SOUTH, dexterity);
		layout.putConstraint(SpringLayout.WEST, dexterityProficiency, 0, SpringLayout.WEST, dexterity);
		layout.putConstraint(SpringLayout.SOUTH, dexterityProficiency, 35, SpringLayout.SOUTH, dexterity);
		layout.putConstraint(SpringLayout.EAST, dexterityProficiency, 0, SpringLayout.EAST, dexterity);
		dexterityProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		constitutionProficiency = new JCheckBox();
		constitutionProficiency.setText("Proficient");
		layout.putConstraint(SpringLayout.NORTH, constitutionProficiency, 5, SpringLayout.SOUTH, constitution);
		layout.putConstraint(SpringLayout.WEST, constitutionProficiency, 0, SpringLayout.WEST, constitution);
		layout.putConstraint(SpringLayout.SOUTH, constitutionProficiency, 35, SpringLayout.SOUTH, constitution);
		layout.putConstraint(SpringLayout.EAST, constitutionProficiency, 0, SpringLayout.EAST, constitution);
		layout.putConstraint(SpringLayout.NORTH, intelligenceLabel, 5, SpringLayout.SOUTH, constitutionProficiency);
		layout.putConstraint(SpringLayout.SOUTH, intelligenceLabel, 35, SpringLayout.SOUTH, constitutionProficiency);
		constitutionProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		intelligenceProficiency = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, intelligenceProficiency, 5, SpringLayout.SOUTH, intelligence);
		layout.putConstraint(SpringLayout.WEST, intelligenceProficiency, 0, SpringLayout.WEST, intelligence);
		layout.putConstraint(SpringLayout.SOUTH, intelligenceProficiency, 35, SpringLayout.SOUTH, intelligence);
		layout.putConstraint(SpringLayout.EAST, intelligenceProficiency, 0, SpringLayout.EAST, intelligence);
		intelligenceProficiency.setText("Proficient");
		layout.putConstraint(SpringLayout.NORTH, wisdomLabel, 5, SpringLayout.SOUTH, intelligenceProficiency);
		layout.putConstraint(SpringLayout.SOUTH, wisdomLabel, 35, SpringLayout.SOUTH, intelligenceProficiency);
		intelligenceProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		wisdomProficiency = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, wisdomProficiency, 5, SpringLayout.SOUTH, wisdom);
		layout.putConstraint(SpringLayout.WEST, wisdomProficiency, 0, SpringLayout.WEST, wisdom);
		layout.putConstraint(SpringLayout.SOUTH, wisdomProficiency, 35, SpringLayout.SOUTH, wisdom);
		layout.putConstraint(SpringLayout.EAST, wisdomProficiency, 0, SpringLayout.EAST, wisdom);
		wisdomProficiency.setText("Proficient");
		layout.putConstraint(SpringLayout.NORTH, charismaLabel, 5, SpringLayout.SOUTH, wisdomProficiency);
		layout.putConstraint(SpringLayout.SOUTH, charismaLabel, 35, SpringLayout.SOUTH, wisdomProficiency);
		wisdomProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		charismaProficiency = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, charismaProficiency, 5, SpringLayout.SOUTH, charisma);
		layout.putConstraint(SpringLayout.WEST, charismaProficiency, 0, SpringLayout.WEST, charisma);
		layout.putConstraint(SpringLayout.SOUTH, charismaProficiency, 35, SpringLayout.SOUTH, charisma);
		layout.putConstraint(SpringLayout.EAST, charismaProficiency, 0, SpringLayout.EAST, charisma);
		charismaProficiency.setText("Proficient");
		charismaProficiency.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		descriptionLabel = new JLabel("Description");
		descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		descriptionLabel.setOpaque(true);
		descriptionLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, descriptionLabel, 10, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.WEST, descriptionLabel, 10, SpringLayout.WEST, holder);
		layout.putConstraint(SpringLayout.SOUTH, descriptionLabel, 40, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.EAST, descriptionLabel, 310, SpringLayout.WEST, holder);
		descriptionArea = new JScrollPane();
		layout.putConstraint(SpringLayout.NORTH, descriptionArea, 10, SpringLayout.SOUTH, descriptionLabel);
		layout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, descriptionLabel);
		layout.putConstraint(SpringLayout.SOUTH, descriptionArea, -10, SpringLayout.SOUTH, holder);
		layout.putConstraint(SpringLayout.EAST, descriptionArea, 0, SpringLayout.EAST, descriptionLabel);
		description = new JTextArea();
		descriptionArea.setViewportView(description);
		descriptionArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		descriptionArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		descriptionArea.setBackground(Color.LIGHT_GRAY);
		description.setWrapStyleWord(true);
		description.setLineWrap(true);
		heightLabel = new JLabel("Height");
		heightLabel.setOpaque(true);
		heightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		heightLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		height = new JTextField();
		height.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, heightLabel, 0, SpringLayout.NORTH, height);
		layout.putConstraint(SpringLayout.WEST, heightLabel, -110, SpringLayout.WEST, height);
		layout.putConstraint(SpringLayout.SOUTH, heightLabel, 0, SpringLayout.SOUTH, height);
		layout.putConstraint(SpringLayout.EAST, heightLabel, -10, SpringLayout.WEST, height);
		layout.putConstraint(SpringLayout.NORTH, height, 10, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.WEST, height, -160, SpringLayout.EAST, holder);
		layout.putConstraint(SpringLayout.SOUTH, height, 40, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.EAST, height, -10, SpringLayout.EAST, holder);
		weightLabel = new JLabel("Weight");
		layout.putConstraint(SpringLayout.NORTH, weightLabel, 10, SpringLayout.SOUTH, heightLabel);
		layout.putConstraint(SpringLayout.WEST, weightLabel, 0, SpringLayout.WEST, heightLabel);
		layout.putConstraint(SpringLayout.SOUTH, weightLabel, 40, SpringLayout.SOUTH, heightLabel);
		layout.putConstraint(SpringLayout.EAST, weightLabel, 0, SpringLayout.EAST, heightLabel);
		weightLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		weightLabel.setHorizontalAlignment(SwingConstants.CENTER);
		weightLabel.setOpaque(true);
		weight = new JTextField();
		weight.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, weight, 0, SpringLayout.NORTH, weightLabel);
		layout.putConstraint(SpringLayout.WEST, weight, 0, SpringLayout.WEST, height);
		layout.putConstraint(SpringLayout.SOUTH, weight, 0, SpringLayout.SOUTH, weightLabel);
		layout.putConstraint(SpringLayout.EAST, weight, 0, SpringLayout.EAST, height);
		ageLabel = new JLabel("Age");
		layout.putConstraint(SpringLayout.NORTH, ageLabel, 10, SpringLayout.SOUTH, weightLabel);
		layout.putConstraint(SpringLayout.WEST, ageLabel, 0, SpringLayout.WEST, weightLabel);
		layout.putConstraint(SpringLayout.SOUTH, ageLabel, 40, SpringLayout.SOUTH, weightLabel);
		layout.putConstraint(SpringLayout.EAST, ageLabel, 0, SpringLayout.EAST, weightLabel);
		ageLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ageLabel.setOpaque(true);
		age = new JTextField();
		age.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, age, 0, SpringLayout.NORTH, ageLabel);
		layout.putConstraint(SpringLayout.WEST, age, 0, SpringLayout.WEST, weight);
		layout.putConstraint(SpringLayout.SOUTH, age, 0, SpringLayout.SOUTH, ageLabel);
		layout.putConstraint(SpringLayout.EAST, age, 0, SpringLayout.EAST, weight);
		bookLabel = new JLabel("Book");
		layout.putConstraint(SpringLayout.NORTH, bookLabel, 10, SpringLayout.SOUTH, ageLabel);
		layout.putConstraint(SpringLayout.WEST, bookLabel, 0, SpringLayout.WEST, ageLabel);
		layout.putConstraint(SpringLayout.SOUTH, bookLabel, 40, SpringLayout.SOUTH, ageLabel);
		layout.putConstraint(SpringLayout.EAST, bookLabel, 0, SpringLayout.EAST, ageLabel);
		bookLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		bookLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bookLabel.setOpaque(true);
		book = new JTextField();
		book.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, book, 0, SpringLayout.NORTH, bookLabel);
		layout.putConstraint(SpringLayout.WEST, book, 0, SpringLayout.WEST, age);
		layout.putConstraint(SpringLayout.SOUTH, book, 0, SpringLayout.SOUTH, bookLabel);
		layout.putConstraint(SpringLayout.EAST, book, 0, SpringLayout.EAST, age);
		
		
		
		spellsLabel = new JLabel("Spells: To Be Built");
		spellsLabel.setBorder(new LineBorder(Color.WHITE, 10));
		spellsLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 30));
		spellsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		spellsLabel.setForeground(Color.WHITE);
		spellsLabel.setBackground(Color.BLACK);
		spellsLabel.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, spellsLabel, 10, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.WEST, spellsLabel, 10, SpringLayout.WEST, holder);
		layout.putConstraint(SpringLayout.SOUTH, spellsLabel, -10, SpringLayout.SOUTH, holder);
		layout.putConstraint(SpringLayout.EAST, spellsLabel, -10, SpringLayout.EAST, holder);
		
		
		Races race = app.getRaces().get(panel1.getRaceList().getSelectedIndex());
		List<RacialFeats> feat = new ArrayList<RacialFeats>();
		for(int i = 0; i < race.getFeats().size(); i++) {
			feat.add(race.getFeats().get(i));
		}
		String[] header = {"Name", "Race", "Prerequisite", "Description"};
		Object[][] data = new Object[feat.size()][header.length];
		for(int i = 0; i < feat.size(); i++) {
			String[] temp = {feat.get(i).getName(), feat.get(i).getRace(),
					feat.get(i).getPrerequisite(), feat.get(i).getDescription()};
			data[i] = temp;
		}
		featsTable = new JTable(data, header);
		featsTable.setEnabled(false);
		featsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		featsTable.setEditingRow(0);
		featsTable.setEditingColumn(0);
		featsTable.setOpaque(false);
		featsTable.setRowMargin(2);
		featsTable.setRowHeight(32);
		featsTable.setGridColor(Color.DARK_GRAY);
		featsTable.setForeground(Color.BLACK);
		featsTable.setBackground(Color.WHITE);
		featsTable.setFont(new Font("Times New Roman", Font.PLAIN, 20));
//		JTableHeader a = feat;
		
		
		featsScroll = new JScrollPane(featsTable);
		featsScroll.setBorder(new LineBorder(Color.BLACK, 5));
		layout.putConstraint(SpringLayout.NORTH, featsScroll, 10, SpringLayout.NORTH, holder);
		layout.putConstraint(SpringLayout.WEST, featsScroll, 10, SpringLayout.WEST, holder);
		layout.putConstraint(SpringLayout.SOUTH, featsScroll, -10, SpringLayout.SOUTH, holder);
		layout.putConstraint(SpringLayout.EAST, featsScroll, -10, SpringLayout.EAST, holder);
		
		
		
		stats = new JButton("Stats");
		layout.putConstraint(SpringLayout.NORTH, stats, -60, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, stats, 145, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, holder, -10, SpringLayout.NORTH, stats);
		layout.putConstraint(SpringLayout.WEST, stats, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, stats, -10, SpringLayout.SOUTH, this);
		info = new JButton("Info");
		layout.putConstraint(SpringLayout.NORTH, info, 0, SpringLayout.NORTH, stats);
		layout.putConstraint(SpringLayout.WEST, info, 10, SpringLayout.EAST, stats);
		layout.putConstraint(SpringLayout.SOUTH, info, 0, SpringLayout.SOUTH, stats);
		layout.putConstraint(SpringLayout.EAST, info, 145, SpringLayout.EAST, stats);
		feats = new JButton("Features");
		layout.putConstraint(SpringLayout.NORTH, feats, 0, SpringLayout.NORTH, info);
		layout.putConstraint(SpringLayout.WEST, feats, 10, SpringLayout.EAST, info);
		layout.putConstraint(SpringLayout.SOUTH, feats, 0, SpringLayout.SOUTH, info);
		layout.putConstraint(SpringLayout.EAST, feats, 145, SpringLayout.EAST, info);
		spells = new JButton("Spells");
		layout.putConstraint(SpringLayout.NORTH, spells, 0, SpringLayout.NORTH, feats);
		layout.putConstraint(SpringLayout.WEST, spells, 10, SpringLayout.EAST, feats);
		layout.putConstraint(SpringLayout.SOUTH, spells, 0, SpringLayout.SOUTH, feats);
		layout.putConstraint(SpringLayout.EAST, spells, 145, SpringLayout.EAST, feats);
		newCharacter = new JButton("New Character");
		layout.putConstraint(SpringLayout.NORTH, newCharacter, 0, SpringLayout.NORTH, spells);
		layout.putConstraint(SpringLayout.WEST, newCharacter, 10, SpringLayout.EAST, spells);
		layout.putConstraint(SpringLayout.SOUTH, newCharacter, 0, SpringLayout.SOUTH, spells);
		layout.putConstraint(SpringLayout.EAST, newCharacter, 145, SpringLayout.EAST, spells);
		
		setupPanel();
		setupComboBox();
		setupLayout();
		setupContent();
		setupListeners();
	}
	private void setupPanel() {
		this.setLayout(layout);
		this.setBackground(Color.GRAY.darker());
		this.add(name);
		this.add(characterNameLabel);
		this.add(characterName);
		this.add(classesLabel);
		this.add(classes);
		this.add(archetypesLabel);
		this.add(archetypes);
		this.add(levelLabel);
		this.add(level);
		this.add(backgroundsLabel);
		this.add(backgrounds);
		this.add(racesLabel);
		this.add(races);
		this.add(alignmentLabel);
		this.add(alignment);
		this.add(xpLabel);
		this.add(xp);
		this.add(acLabel);
		this.add(ac);
		this.add(initiativeLabel);
		this.add(initiative);
		this.add(speedLabel);
		this.add(speed);
		this.add(hpLabel);
		this.add(hpAmount);
		this.add(hp);
		this.add(hitDiceLabel);
		this.add(hitDice);
		this.add(deathSavesLabel);
		this.add(success);
		this.add(failure);
		this.add(success1);
		this.add(success2);
		this.add(success3);
		this.add(failure1);
		this.add(failure2);
		this.add(failure3);
		this.add(inspirationLabel);
		this.add(inspiration);
		this.add(proficiencyLabel);
		this.add(proficiency);
		this.add(passiveWisdomLabel);
		this.add(passiveWisdom);
		this.add(stats);
		this.add(info);
		this.add(feats);
		this.add(spells);
		this.add(newCharacter);
		this.add(strengthLabel);
		this.add(strength);
		this.add(strengthBonus);
		this.add(strengthProficiency);
		this.add(strengthSave);
		this.add(dexterityLabel);
		this.add(dexterity);
		this.add(dexterityBonus);
		this.add(dexterityProficiency);
		this.add(dexteritySave);
		constitutionLabel = new JLabel("Constitution");
		layout.putConstraint(SpringLayout.NORTH, constitutionBonus, 5, SpringLayout.SOUTH, constitutionLabel);
		layout.putConstraint(SpringLayout.WEST, constitutionBonus, -95, SpringLayout.EAST, constitutionLabel);
		layout.putConstraint(SpringLayout.SOUTH, constitutionBonus, 35, SpringLayout.SOUTH, constitutionLabel);
		layout.putConstraint(SpringLayout.EAST, constitutionBonus, -10, SpringLayout.EAST, constitutionLabel);
		layout.putConstraint(SpringLayout.NORTH, constitution, 5, SpringLayout.SOUTH, constitutionLabel);
		layout.putConstraint(SpringLayout.WEST, constitution, 10, SpringLayout.WEST, constitutionLabel);
		layout.putConstraint(SpringLayout.SOUTH, constitution, 35, SpringLayout.SOUTH, constitutionLabel);
		layout.putConstraint(SpringLayout.EAST, constitution, 95, SpringLayout.WEST, constitutionLabel);
		layout.putConstraint(SpringLayout.NORTH, constitutionLabel, 5, SpringLayout.SOUTH, dexterityProficiency);
		layout.putConstraint(SpringLayout.WEST, constitutionLabel, 0, SpringLayout.WEST, dexterityLabel);
		layout.putConstraint(SpringLayout.SOUTH, constitutionLabel, 35, SpringLayout.SOUTH, dexterityProficiency);
		layout.putConstraint(SpringLayout.EAST, constitutionLabel, 0, SpringLayout.EAST, dexterityLabel);
		layout.putConstraint(SpringLayout.WEST, intelligenceLabel, 0, SpringLayout.WEST, constitutionLabel);
		layout.putConstraint(SpringLayout.EAST, intelligenceLabel, 0, SpringLayout.EAST, constitutionLabel);
		constitutionLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		constitutionLabel.setOpaque(true);
		constitutionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		this.add(constitutionLabel);
		this.add(constitution);
		this.add(constitutionBonus);
		this.add(constitutionProficiency);
		this.add(constitutionSave);
		this.add(intelligenceLabel);
		this.add(intelligence);
		this.add(intelligenceBonus);
		this.add(intelligenceProficiency);
		this.add(intelligenceSave);
		this.add(wisdomLabel);
		this.add(wisdom);
		this.add(wisdomBonus);
		this.add(wisdomProficiency);
		this.add(wisdomSave);
		this.add(charismaLabel);
		this.add(charisma);
		this.add(charismaBonus);
		this.add(charismaProficiency);
		this.add(charismaSave);
		this.add(athleticsLabel);
		this.add(athleticsProficiency);
		this.add(athletics);
		this.add(acrobaticsLabel);
		this.add(acrobaticsProficiency);
		this.add(acrobatics);
		this.add(sleightOfHandLabel);
		this.add(sleightOfHandProficiency);
		this.add(sleightOfHand);
		this.add(stealthLabel);
		this.add(stealthProficiency);
		this.add(stealth);
		this.add(arcanaLabel);
		this.add(arcanaProficiency);
		this.add(arcana);
		this.add(historyLabel);
		this.add(historyProficiency);
		this.add(history);
		this.add(investigationLabel);
		this.add(investigationProficiency);
		this.add(investigation);
		this.add(natureLabel);
		this.add(natureProficiency);
		this.add(nature);
		this.add(religionLabel);
		this.add(religionProficiency);
		this.add(religion);
		this.add(animalHandlingLabel);
		this.add(animalHandlingProficiency);
		this.add(animalHandling);
		this.add(insightLabel);
		this.add(insightProficiency);
		this.add(insight);
		this.add(medicineLabel);
		this.add(medicineProficiency);
		this.add(medicine);
		this.add(perceptionLabel);
		this.add(perceptionProficiency);
		this.add(perception);
		this.add(survivalLabel);
		this.add(survivalProficiency);
		this.add(survival);
		this.add(deceptionLabel);
		this.add(deceptionProficiency);
		this.add(deception);
		this.add(intimidationLabel);
		this.add(intimidationProficiency);
		this.add(intimidation);
		this.add(performanceLabel);
		this.add(performanceProficiency);
		this.add(performance);
		this.add(persuasionLabel);
		this.add(persuasionProficiency);
		this.add(persuasion);
		this.add(strengthSaveLabel);
		this.add(dexteritySaveLabel);
		this.add(constitutionSaveLabel);
		this.add(intelligenceSaveLabel);
		this.add(wisdomSaveLabel);
		this.add(charismaSaveLabel);
		this.add(descriptionLabel);
		this.add(descriptionArea);
		this.add(heightLabel);
		this.add(height);
		this.add(weightLabel);
		this.add(weight);
		this.add(ageLabel);
		this.add(age);
		this.add(bookLabel);
		this.add(book);
		this.add(featsScroll);
		this.add(spellsLabel);
		
		this.add(holder);
		
		deactivate();
		activateStats();
	}
	private void setupComboBox() {
		DefaultComboBoxModel classModel = new DefaultComboBoxModel(app.convertClasses());
		classes.setModel(classModel);
		DefaultComboBoxModel archetypeModel = new DefaultComboBoxModel(app.convertArchytype());
		archetypes.setModel(archetypeModel);
		DefaultComboBoxModel raceModel = new DefaultComboBoxModel(app.convertRaces());
		races.setModel(raceModel);
		DefaultComboBoxModel backgroundModel = new DefaultComboBoxModel(app.convertBackgrounds());
		backgrounds.setModel(backgroundModel);
		DefaultComboBoxModel alignmentModel = new DefaultComboBoxModel(app.convertAlignments());
		alignment.setModel(alignmentModel);
	}
	private void setupLayout() {
		
	}
	private void setupContent() {
		strength.setText("" + rollDice());
		strengthBonus.setText(modifier(Integer.parseInt(strength.getText())));
		if (strengthProficiency.isSelected()) {
			strengthSave.setText(modifier(Integer.parseInt(strength.getText())));
		} else {
			strengthSave.setText(modifier(Integer.parseInt(strength.getText())));
		}
		dexterity.setText("" + rollDice());
		dexterityBonus.setText(modifier(Integer.parseInt(dexterity.getText())));
		if (dexterityProficiency.isSelected()) {
			dexteritySave.setText(modifier(Integer.parseInt(dexterity.getText())));
		} else {
			dexteritySave.setText(modifier(Integer.parseInt(dexterity.getText())));
		}
		constitution.setText("" + rollDice());
		constitutionBonus.setText(modifier(Integer.parseInt(constitution.getText())));
		if (constitutionProficiency.isSelected()) {
			constitutionSave.setText(modifier(Integer.parseInt(constitution.getText())));
		} else {
			constitutionSave.setText(modifier(Integer.parseInt(constitution.getText())));
		}
		intelligence.setText("" + rollDice());
		intelligenceBonus.setText(modifier(Integer.parseInt(intelligence.getText())));
		if (intelligenceProficiency.isSelected()) {
			intelligenceSave.setText(modifier(Integer.parseInt(intelligence.getText())));
		} else {
			intelligenceSave.setText(modifier(Integer.parseInt(intelligence.getText())));
		}
		wisdom.setText("" + rollDice());
		wisdomBonus.setText(modifier(Integer.parseInt(wisdom.getText())));
		if (wisdomProficiency.isSelected()) {
			wisdomSave.setText(modifier(Integer.parseInt(wisdom.getText())));
		} else {
			wisdomSave.setText(modifier(Integer.parseInt(wisdom.getText())));
		}
		charisma.setText("" + rollDice());
		charismaBonus.setText(modifier(Integer.parseInt(charisma.getText())));
		if (charismaProficiency.isSelected()) {
			charismaSave.setText(modifier(Integer.parseInt(charisma.getText())));
		} else {
			charismaSave.setText(modifier(Integer.parseInt(charisma.getText())));
		}
		
		characterName.setText(panel1.getCharacterName().getText());
		classes.setSelectedIndex(panel1.getClassList().getSelectedIndex());
		archetypes.setSelectedIndex(panel1.getArchetypeList().getSelectedIndex());
		backgrounds.setSelectedIndex(panel1.getBackgroundList().getSelectedIndex());
		races.setSelectedIndex(panel1.getRaceList().getSelectedIndex());
		alignment.setSelectedIndex(panel1.getAlignmentList().getSelectedIndex());
		speed.setText(app.getRaces().get(races.getSelectedIndex()).getSpeed() + " Feet");
		initiative.setText(dexterityBonus.getText());
		setupLevel();
		
		description.setText(app.getRaces().get(races.getSelectedIndex()).getDescription());
		age.setText(app.getRaces().get(races.getSelectedIndex()).getAge() + " Years Old");
		height.setText(app.getRaces().get(races.getSelectedIndex()).getHeight());
		weight.setText(app.getRaces().get(races.getSelectedIndex()).getWeight());
		book.setText(app.getRaces().get(races.getSelectedIndex()).getBook());
	}
	private int rollDice() {
		int roll = 0;
		Random rand = new Random();
		int a = rand.nextInt(6) + 1;
		int b = rand.nextInt(6) + 1;
		int c = rand.nextInt(6) + 1;
		int d = rand.nextInt(6) + 1;
		int no = a;
		if (no > b) {
			no = b;
		}
		if (no > c) {
			no = c;
		}
		if (no > d) {
			no = d;
		}
		roll = a + b + c + d;
		roll = roll - no;
		return roll;
	}
	private String modifier(int num) {
		String mod = "";
		if (num == 0 || num == 1) {
			mod = "- 5";
		}
		if (num == 2 || num == 3) {
			mod = "- 4";
		}
		if (num == 4 || num == 5) {
			mod = "- 3";
		}
		if (num == 6 || num == 7) {
			mod = "- 2";
		}
		if (num == 8 || num == 9) {
			mod = "- 1";
		}
		if (num == 10 || num == 11) {
			mod = "+ 0";
		}
		if (num == 12 || num == 13) {
			mod = "+ 1";
		}
		if (num == 14 || num == 15) {
			mod = "+ 2";
		}
		if (num == 16 || num == 17) {
			mod = "+ 3";
		}
		if (num == 18 || num == 19) {
			mod = "+ 4";
		}
		if (num == 20 || num == 21) {
			mod = "+ 5";
		}
		if (num == 22 || num == 23) {
			mod = "+ 6";
		}
		if (num == 24 || num == 25) {
			mod = "+ 7";
		}
		if (num == 26 || num == 27) {
			mod = "+ 8";
		}
		if (num == 28 || num == 29) {
			mod = "+ 9";
		}
		if (num >= 30) {
			mod = "+ 10";
		}
		return mod;
	}
	private void setupLevel() {
		int xpnum = Integer.parseInt(xp.getText());
		int lev = 0;
		if (xpnum < 300) {
			lev = 1;
		}
		if (xpnum >= 300) {
			lev = 2;
		}
		if (xpnum >= 900) {
			lev = 3;
		}
		if (xpnum >= 2700) {
			lev = 4;
		}
		if (xpnum >= 6500) {
			lev = 5;
		}
		if (xpnum >= 14000) {
			lev = 6;
		}
		if (xpnum >= 23000) {
			lev = 7;
		}
		if (xpnum >= 34000) {
			lev = 8;
		}
		if (xpnum >= 48000) {
			lev = 9;
		}
		if (xpnum >= 64000) {
			lev = 10;
		}
		if (xpnum >= 85000) {
			lev = 11;
		}
		if (xpnum >= 100000) {
			lev = 12;
		}
		if (xpnum >= 120000) {
			lev = 13;
		}
		if (xpnum >= 140000) {
			lev = 14;
		}
		if (xpnum >= 165000) {
			lev = 15;
		}
		if (xpnum >= 195000) {
			lev = 16;
		}
		if (xpnum >= 225000) {
			lev = 17;
		}
		if (xpnum >= 265000) {
			lev = 18;
		}
		if (xpnum >= 305000) {
			lev = 19;
		}
		if (xpnum >= 355000) {
			lev = 20;
		}
		level.setText(lev + "");
		setupProficiency();
	}
	public void setupProficiency() {
		int lev = Integer.parseInt(level.getText());
		int prof = 0;
		if (lev < 5) {
			prof = 2;
		}
		if (lev >= 5) {
			prof = 3;
		}
		if (lev >= 9) {
			prof = 4;
		}
		if (lev >= 13) {
			prof = 5;
		}
		if (lev >= 17) {
			prof = 6;
		}
		proficiency.setText("+ " + prof);
	}
	private void deactivate() {
		characterNameLabel.setVisible(false);
		characterName.setVisible(false);
		classesLabel.setVisible(false);
		classes.setVisible(false);
		archetypesLabel.setVisible(false);
		archetypes.setVisible(false);
		levelLabel.setVisible(false);
		level.setVisible(false);
		backgroundsLabel.setVisible(false);
		backgrounds.setVisible(false);
		racesLabel.setVisible(false);
		races.setVisible(false);
		alignmentLabel.setVisible(false);
		alignment.setVisible(false);
		xpLabel.setVisible(false);
		xp.setVisible(false);
		acLabel.setVisible(false);
		ac.setVisible(false);
		initiativeLabel.setVisible(false);
		initiative.setVisible(false);
		speedLabel.setVisible(false);
		speed.setVisible(false);
		hpLabel.setVisible(false);
		hpAmount.setVisible(false);
		hp.setVisible(false);
		hitDiceLabel.setVisible(false);
		hitDice.setVisible(false);
		deathSavesLabel.setVisible(false);
		success.setVisible(false);
		failure.setVisible(false);
		success1.setVisible(false);
		success2.setVisible(false);
		success3.setVisible(false);
		failure1.setVisible(false);
		failure2.setVisible(false);
		failure3.setVisible(false);
		inspirationLabel.setVisible(false);
		inspiration.setVisible(false);
		proficiencyLabel.setVisible(false);
		proficiency.setVisible(false);
		passiveWisdomLabel.setVisible(false);
		passiveWisdom.setVisible(false);
		descriptionLabel.setVisible(false);
		descriptionArea.setVisible(false);
		description.setVisible(false);
		heightLabel.setVisible(false);
		height.setVisible(false);
		weightLabel.setVisible(false);
		weight.setVisible(false);
		ageLabel.setVisible(false);
		age.setVisible(false);
		bookLabel.setVisible(false);
		book.setVisible(false);
		strengthLabel.setVisible(false);
		strengthProficiency.setVisible(false);
		strength.setVisible(false);
		strengthBonus.setVisible(false);
		strengthSave.setVisible(false);
		athleticsLabel.setVisible(false);
		athleticsProficiency.setVisible(false);
		athletics.setVisible(false);
		dexterityLabel.setVisible(false);
		dexterityProficiency.setVisible(false);
		dexterity.setVisible(false);
		dexterityBonus.setVisible(false);
		dexteritySave.setVisible(false);
		acrobaticsLabel.setVisible(false);
		acrobaticsProficiency.setVisible(false);
		acrobatics.setVisible(false);
		sleightOfHandLabel.setVisible(false);
		sleightOfHandProficiency.setVisible(false);
		sleightOfHand.setVisible(false);
		stealthLabel.setVisible(false);
		stealthProficiency.setVisible(false);
		stealth.setVisible(false);
		constitutionLabel.setVisible(false);
		constitutionProficiency.setVisible(false);
		constitution.setVisible(false);
		constitutionBonus.setVisible(false);
		constitutionSave.setVisible(false);
		intelligenceLabel.setVisible(false);
		intelligenceProficiency.setVisible(false);
		intelligence.setVisible(false);
		intelligenceBonus.setVisible(false);
		intelligenceSave.setVisible(false);
		arcanaLabel.setVisible(false);
		arcanaProficiency.setVisible(false);
		arcana.setVisible(false);
		historyLabel.setVisible(false);
		historyProficiency.setVisible(false);
		history.setVisible(false);
		investigationLabel.setVisible(false);
		investigationProficiency.setVisible(false);
		investigation.setVisible(false);
		natureLabel.setVisible(false);
		natureProficiency.setVisible(false);
		nature.setVisible(false);
		religionLabel.setVisible(false);
		religionProficiency.setVisible(false);
		religion.setVisible(false);
		wisdomLabel.setVisible(false);
		wisdomProficiency.setVisible(false);
		wisdom.setVisible(false);
		wisdomBonus.setVisible(false);
		wisdomSave.setVisible(false);
		animalHandlingLabel.setVisible(false);
		animalHandlingProficiency.setVisible(false);
		animalHandling.setVisible(false);
		insightLabel.setVisible(false);
		insightProficiency.setVisible(false);
		insight.setVisible(false);
		medicineLabel.setVisible(false);
		medicineProficiency.setVisible(false);
		medicine.setVisible(false);
		perceptionLabel.setVisible(false);
		perceptionProficiency.setVisible(false);
		perception.setVisible(false);
		survivalLabel.setVisible(false);
		survivalProficiency.setVisible(false);
		survival.setVisible(false);
		charismaLabel.setVisible(false);
		charismaProficiency.setVisible(false);
		charisma.setVisible(false);
		charismaBonus.setVisible(false);
		charismaSave.setVisible(false);
		deceptionLabel.setVisible(false);
		deceptionProficiency.setVisible(false);
		deception.setVisible(false);
		intimidationLabel.setVisible(false);
		intimidationProficiency.setVisible(false);
		intimidation.setVisible(false);
		performanceLabel.setVisible(false);
		performanceProficiency.setVisible(false);
		performance.setVisible(false);
		persuasionLabel.setVisible(false);
		persuasionProficiency.setVisible(false);
		persuasion.setVisible(false);
		strengthSaveLabel.setVisible(false);
		dexteritySaveLabel.setVisible(false);
		constitutionSaveLabel.setVisible(false);
		intelligenceSaveLabel.setVisible(false);
		wisdomSaveLabel.setVisible(false);
		charismaSaveLabel.setVisible(false);
		featsScroll.setVisible(false);
		spellsLabel.setVisible(false);
	}
	private void activateStats() {
		characterNameLabel.setVisible(true);
		characterName.setVisible(true);
		classesLabel.setVisible(true);
		classes.setVisible(true);
		archetypesLabel.setVisible(true);
		archetypes.setVisible(true);
		levelLabel.setVisible(true);
		level.setVisible(true);
		backgroundsLabel.setVisible(true);
		backgrounds.setVisible(true);
		racesLabel.setVisible(true);
		races.setVisible(true);
		alignmentLabel.setVisible(true);
		alignment.setVisible(true);
		xpLabel.setVisible(true);
		xp.setVisible(true);
		acLabel.setVisible(true);
		ac.setVisible(true);
		initiativeLabel.setVisible(true);
		initiative.setVisible(true);
		speedLabel.setVisible(true);
		speed.setVisible(true);
		hpLabel.setVisible(true);
		hpAmount.setVisible(true);
		hp.setVisible(true);
		hitDiceLabel.setVisible(true);
		hitDice.setVisible(true);
		deathSavesLabel.setVisible(true);
		success.setVisible(true);
		failure.setVisible(true);
		success1.setVisible(true);
		success2.setVisible(true);
		success3.setVisible(true);
		failure1.setVisible(true);
		failure2.setVisible(true);
		failure3.setVisible(true);
		inspirationLabel.setVisible(true);
		inspiration.setVisible(true);
		proficiencyLabel.setVisible(true);
		proficiency.setVisible(true);
		passiveWisdomLabel.setVisible(true);
		passiveWisdom.setVisible(true);
		strengthLabel.setVisible(true);
		strengthProficiency.setVisible(true);
		strength.setVisible(true);
		strengthBonus.setVisible(true);
		strengthSave.setVisible(true);
		athleticsLabel.setVisible(true);
		athleticsProficiency.setVisible(true);
		athletics.setVisible(true);
		dexterityLabel.setVisible(true);
		dexterityProficiency.setVisible(true);
		dexterity.setVisible(true);
		dexterityBonus.setVisible(true);
		dexteritySave.setVisible(true);
		acrobaticsLabel.setVisible(true);
		acrobaticsProficiency.setVisible(true);
		acrobatics.setVisible(true);
		sleightOfHandLabel.setVisible(true);
		sleightOfHandProficiency.setVisible(true);
		sleightOfHand.setVisible(true);
		stealthLabel.setVisible(true);
		stealthProficiency.setVisible(true);
		stealth.setVisible(true);
		constitutionLabel.setVisible(true);
		constitutionProficiency.setVisible(true);
		constitution.setVisible(true);
		constitutionBonus.setVisible(true);
		constitutionSave.setVisible(true);
		intelligenceLabel.setVisible(true);
		intelligenceProficiency.setVisible(true);
		intelligence.setVisible(true);
		intelligenceBonus.setVisible(true);
		intelligenceSave.setVisible(true);
		arcanaLabel.setVisible(true);
		arcanaProficiency.setVisible(true);
		arcana.setVisible(true);
		historyLabel.setVisible(true);
		historyProficiency.setVisible(true);
		history.setVisible(true);
		investigationLabel.setVisible(true);
		investigationProficiency.setVisible(true);
		investigation.setVisible(true);
		natureLabel.setVisible(true);
		natureProficiency.setVisible(true);
		nature.setVisible(true);
		religionLabel.setVisible(true);
		religionProficiency.setVisible(true);
		religion.setVisible(true);
		wisdomLabel.setVisible(true);
		wisdomProficiency.setVisible(true);
		wisdom.setVisible(true);
		wisdomBonus.setVisible(true);
		wisdomSave.setVisible(true);
		animalHandlingLabel.setVisible(true);
		animalHandlingProficiency.setVisible(true);
		animalHandling.setVisible(true);
		insightLabel.setVisible(true);
		insightProficiency.setVisible(true);
		insight.setVisible(true);
		medicineLabel.setVisible(true);
		medicineProficiency.setVisible(true);
		medicine.setVisible(true);
		perceptionLabel.setVisible(true);
		perceptionProficiency.setVisible(true);
		perception.setVisible(true);
		survivalLabel.setVisible(true);
		survivalProficiency.setVisible(true);
		survival.setVisible(true);
		charismaLabel.setVisible(true);
		charismaProficiency.setVisible(true);
		charisma.setVisible(true);
		charismaBonus.setVisible(true);
		charismaSave.setVisible(true);
		deceptionLabel.setVisible(true);
		deceptionProficiency.setVisible(true);
		deception.setVisible(true);
		intimidationLabel.setVisible(true);
		intimidationProficiency.setVisible(true);
		intimidation.setVisible(true);
		performanceLabel.setVisible(true);
		performanceProficiency.setVisible(true);
		performance.setVisible(true);
		persuasionLabel.setVisible(true);
		persuasionProficiency.setVisible(true);
		persuasion.setVisible(true);
		strengthSaveLabel.setVisible(true);
		dexteritySaveLabel.setVisible(true);
		constitutionSaveLabel.setVisible(true);
		intelligenceSaveLabel.setVisible(true);
		wisdomSaveLabel.setVisible(true);
		charismaSaveLabel.setVisible(true);
	}
	private void activateInfo() {
		descriptionLabel.setVisible(true);
		descriptionArea.setVisible(true);
		description.setVisible(true);
		heightLabel.setVisible(true);
		height.setVisible(true);
		weightLabel.setVisible(true);
		weight.setVisible(true);
		ageLabel.setVisible(true);
		age.setVisible(true);
		bookLabel.setVisible(true);
		book.setVisible(true);
	}
	private void activateFeats() {
		featsScroll.setVisible(true);
	}
	private void activateSpells() {
		spellsLabel.setVisible(true);
	}
	private void setupListeners() {
		races.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.getRaceList().setSelectedIndex(races.getSelectedIndex());
				setupContent();
			}
		});
		level.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 0;
				try {
					num = Integer.parseInt(level.getText());
				} catch (NumberFormatException error) {
					
				}
				if (num <= 20 || !level.getText().equals("")) {
					try {
						setupProficiency();
					} catch (NumberFormatException error) {
						
					}
				}
			}
		});
		level.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				int num = 0;
				try {
					num = Integer.parseInt(level.getText());
				} catch (NumberFormatException error) {
					
				}
				if (num <= 20 || !level.getText().equals("")) {
					try {
						setupProficiency();
					} catch (NumberFormatException error) {
						
					}
				}
			}
			public void focusLost(FocusEvent e) {
				int num = 0;
				try {
					num = Integer.parseInt(level.getText());
				} catch (NumberFormatException error) {
					
				}
				if (num <= 20 || !level.getText().equals("")) {
					try {
						setupProficiency();
					} catch (NumberFormatException error) {
						
					}
				}
			}
		});
		xp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!level.getText().equals("")) {
					try {
						setupLevel();
					} catch (NumberFormatException error) {
						
					}
				}
			}
		});
		xp.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (!level.getText().equals("")) {
					try {
						setupLevel();
					} catch (NumberFormatException error) {
						
					}
				}
			}
			public void focusLost(FocusEvent e) {
				if (!level.getText().equals("")) {
					try {
						setupLevel();
					} catch (NumberFormatException error) {
						
					}
				}
			}
		});
		stats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				deactivate();
				activateStats();
			}
		});
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				deactivate();
				activateInfo();
			}
		});
		feats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				deactivate();
				activateFeats();
			}
		});
		spells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				deactivate();
				activateSpells();
			}
		});
		newCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				app.setupList();
				frame.changePanel();
			}
		});
	}
}

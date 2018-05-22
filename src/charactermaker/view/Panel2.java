package charactermaker.view;

import charactermaker.controller.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel2 extends JPanel {
	private Controller app;
	private Frame frame;
	private Panel1 panel1;
	private SpringLayout layout;
	private JLabel name;
	private JLabel characterNameLabel;
	private JTextField characterName;
	private JLabel classesLabel;
	private JComboBox classes;
	private JLabel levelLabel;
	private JTextField level;
	private JLabel backgroundsLabel;
	private JComboBox backgrounds;
	private JLabel racesLabel;
	private JComboBox races;
	private JLabel alignmentLabel;
	private JComboBox alignment;
	private JLabel xpLabel;
	private JTextField xp;
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
	private JLabel inspirationLabel;
	private JCheckBox inspiration;
	private JLabel proficiencyLabel;
	private JTextField proficiency;
	
	public Panel2(Controller app) {
		super();
		this.app = app;
		panel1 = new Panel1(app);
		layout = new SpringLayout();
		name = new JLabel("Character Creator");
		name.setToolTipText("Create a new Character for Dungeons and Dragons!");
		name.setOpaque(true);
		name.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		name.setBackground(Color.WHITE);
		layout.putConstraint(SpringLayout.WEST, name, 250, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, name, -250, SpringLayout.EAST, this);
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, name, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, name, 60, SpringLayout.NORTH, this);
		characterNameLabel = new JLabel("Name");
		characterNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		characterNameLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		characterNameLabel.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, characterNameLabel, 10, SpringLayout.SOUTH, name);
		layout.putConstraint(SpringLayout.WEST, characterNameLabel, 10, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, characterNameLabel, 40, SpringLayout.SOUTH, name);
		layout.putConstraint(SpringLayout.EAST, characterNameLabel, 110, SpringLayout.WEST, this);
//		characterName = new JTextField(panel1.getCharacterName().getText());
		characterName.setHorizontalAlignment(SwingConstants.TRAILING);
		layout.putConstraint(SpringLayout.NORTH, characterName, 0, SpringLayout.NORTH, characterNameLabel);
		layout.putConstraint(SpringLayout.WEST, characterName, 10, SpringLayout.EAST, characterNameLabel);
		layout.putConstraint(SpringLayout.SOUTH, characterName, 0, SpringLayout.SOUTH, characterNameLabel);
		layout.putConstraint(SpringLayout.EAST, characterName, 160, SpringLayout.EAST, characterNameLabel);
		classesLabel = new JLabel("Class");
		layout.putConstraint(SpringLayout.NORTH, classesLabel, 5, SpringLayout.SOUTH, characterNameLabel);
		layout.putConstraint(SpringLayout.SOUTH, classesLabel, 35, SpringLayout.SOUTH, characterNameLabel);
		classesLabel.setOpaque(true);
		classesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		classesLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.WEST, classesLabel, 0, SpringLayout.WEST, characterNameLabel);
		layout.putConstraint(SpringLayout.EAST, classesLabel, 0, SpringLayout.EAST, characterNameLabel);
		classes = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, classes, 0, SpringLayout.NORTH, classesLabel);
		layout.putConstraint(SpringLayout.WEST, classes, 0, SpringLayout.WEST, characterName);
		layout.putConstraint(SpringLayout.SOUTH, classes, 0, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.EAST, classes, 0, SpringLayout.EAST, characterName);
		levelLabel = new JLabel("Level");
		levelLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
		levelLabel.setOpaque(true);
		layout.putConstraint(SpringLayout.NORTH, levelLabel, 5, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.WEST, levelLabel, 0, SpringLayout.WEST, classesLabel);
		layout.putConstraint(SpringLayout.SOUTH, levelLabel, 35, SpringLayout.SOUTH, classesLabel);
		layout.putConstraint(SpringLayout.EAST, levelLabel, 0, SpringLayout.EAST, classesLabel);
		level = new JTextField();
		layout.putConstraint(SpringLayout.NORTH, level, 0, SpringLayout.NORTH, levelLabel);
		layout.putConstraint(SpringLayout.WEST, level, 0, SpringLayout.WEST, classes);
		layout.putConstraint(SpringLayout.SOUTH, level, 0, SpringLayout.SOUTH, levelLabel);
		layout.putConstraint(SpringLayout.EAST, level, 0, SpringLayout.EAST, classes);
		backgroundsLabel = new JLabel("Background");
		layout.putConstraint(SpringLayout.NORTH, backgroundsLabel, 5, SpringLayout.SOUTH, levelLabel);
		layout.putConstraint(SpringLayout.WEST, backgroundsLabel, 0, SpringLayout.WEST, levelLabel);
		layout.putConstraint(SpringLayout.SOUTH, backgroundsLabel, 35, SpringLayout.SOUTH, levelLabel);
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
		layout.putConstraint(SpringLayout.NORTH, xpLabel, 5, SpringLayout.SOUTH, alignmentLabel);
		layout.putConstraint(SpringLayout.WEST, xpLabel, 0, SpringLayout.WEST, alignmentLabel);
		layout.putConstraint(SpringLayout.SOUTH, xpLabel, 35, SpringLayout.SOUTH, alignmentLabel);
		layout.putConstraint(SpringLayout.EAST, xpLabel, 0, SpringLayout.EAST, alignmentLabel);
		xpLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		xpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xpLabel.setOpaque(true);
		xp = new JTextField("0");
		xp.setHorizontalAlignment(SwingConstants.TRAILING);
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
		ac.setHorizontalAlignment(SwingConstants.TRAILING);
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
		initiative.setHorizontalAlignment(SwingConstants.TRAILING);
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
		speed.setHorizontalAlignment(SwingConstants.TRAILING);
		hpLabel = new JLabel("Hit Points");
		hpLabel.setOpaque(true);
		hpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		hpLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, hpLabel, 5, SpringLayout.SOUTH, speedLabel);
		layout.putConstraint(SpringLayout.WEST, hpLabel, 0, SpringLayout.WEST, speedLabel);
		layout.putConstraint(SpringLayout.SOUTH, hpLabel, 35, SpringLayout.SOUTH, speedLabel);
		layout.putConstraint(SpringLayout.EAST, hpLabel, 0, SpringLayout.EAST, speedLabel);
		hpAmount = new JTextField();
		hpAmount.setHorizontalAlignment(SwingConstants.TRAILING);
		layout.putConstraint(SpringLayout.NORTH, hpAmount, 0, SpringLayout.NORTH, hpLabel);
		layout.putConstraint(SpringLayout.WEST, hpAmount, 0, SpringLayout.WEST, speed);
		layout.putConstraint(SpringLayout.SOUTH, hpAmount, 0, SpringLayout.SOUTH, hpLabel);
		layout.putConstraint(SpringLayout.EAST, hpAmount, 75, SpringLayout.EAST, hpLabel);
		hp = new JTextField();
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
		hitDice.setHorizontalAlignment(SwingConstants.TRAILING);
		inspirationLabel = new JLabel("Inspiration");
		inspirationLabel.setOpaque(true);
		inspirationLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inspirationLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, inspirationLabel, 5, SpringLayout.SOUTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.WEST, inspirationLabel, 0, SpringLayout.WEST, hitDiceLabel);
		layout.putConstraint(SpringLayout.SOUTH, inspirationLabel, 35, SpringLayout.SOUTH, hitDiceLabel);
		layout.putConstraint(SpringLayout.EAST, inspirationLabel, 0, SpringLayout.EAST, hitDiceLabel);
		inspiration = new JCheckBox();
		layout.putConstraint(SpringLayout.NORTH, inspiration, 0, SpringLayout.NORTH, inspirationLabel);
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
		layout.putConstraint(SpringLayout.NORTH, proficiency, 0, SpringLayout.NORTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.WEST, proficiency, 0, SpringLayout.WEST, hitDice);
		layout.putConstraint(SpringLayout.SOUTH, proficiency, 0, SpringLayout.SOUTH, proficiencyLabel);
		layout.putConstraint(SpringLayout.EAST, proficiency, 0, SpringLayout.EAST, hitDice);
		
		
		
		setupPanel();
		setupComboBox();
		setupLayout();
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
		this.add(inspirationLabel);
		this.add(inspiration);
		this.add(proficiencyLabel);
		this.add(proficiency);
	}
	private void setupComboBox() {
		DefaultComboBoxModel classModel = new DefaultComboBoxModel(app.convertClasses());
		classes.setModel(classModel);
//		DefaultComboBoxModel archetypeModel = new DefaultComboBoxModel(app.convertArchytype());
//		archetypes.setModel(archetypeModel);
		DefaultComboBoxModel raceModel = new DefaultComboBoxModel(app.convertRaces());
		races.setModel(raceModel);
		DefaultComboBoxModel backgroundModel = new DefaultComboBoxModel(app.convertBackgrounds());
		backgrounds.setModel(backgroundModel);
		DefaultComboBoxModel alignmentModel = new DefaultComboBoxModel(app.convertAlignments());
		alignment.setModel(alignmentModel);
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		
	}
}

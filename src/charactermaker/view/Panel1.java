package charactermaker.view;

import charactermaker.controller.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel1 extends JPanel {
	private Controller app;
	private Frame frame;
	private SpringLayout layout;
	private JLabel name;
	private JLabel character;
	private JTextField characterName;
	private JLabel classes;
	private JComboBox classList;
	private JLabel archetype;
	private JComboBox archetypeList;
	private JLabel races;
	private JComboBox raceList;
	private JLabel backgrounds;
	private JComboBox backgroundList;
	private JLabel alignment;
	private JComboBox alignmentList;
	private JButton create;
	public Panel1(Controller app) {
		super();
		this.app = app;
		layout = new SpringLayout();
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
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
		character = new JLabel("Name");
		layout.putConstraint(SpringLayout.NORTH, character, 150, SpringLayout.SOUTH, name);
		layout.putConstraint(SpringLayout.SOUTH, character, 180, SpringLayout.SOUTH, name);
		character.setToolTipText("Name your Character.");
		character.setOpaque(true);
		character.setHorizontalAlignment(SwingConstants.CENTER);
		character.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		character.setBackground(Color.WHITE);
		layout.putConstraint(SpringLayout.WEST, character, 0, SpringLayout.WEST, name);
		layout.putConstraint(SpringLayout.EAST, character, 100, SpringLayout.WEST, name);
		characterName = new JTextField();
		characterName.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, characterName, 0, SpringLayout.NORTH, character);
		layout.putConstraint(SpringLayout.WEST, characterName, 5, SpringLayout.EAST, character);
		layout.putConstraint(SpringLayout.SOUTH, characterName, 0, SpringLayout.SOUTH, character);
		layout.putConstraint(SpringLayout.EAST, characterName, 0, SpringLayout.EAST, name);
		classes = new JLabel("Class");
		layout.putConstraint(SpringLayout.NORTH, classes, 5, SpringLayout.SOUTH, character);
		layout.putConstraint(SpringLayout.WEST, classes, 0, SpringLayout.WEST, name);
		layout.putConstraint(SpringLayout.SOUTH, classes, 35, SpringLayout.SOUTH, character);
		layout.putConstraint(SpringLayout.EAST, classes, 100, SpringLayout.WEST, name);
		classes.setToolTipText("Choose a Class for your Character.");
		classes.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		classes.setOpaque(true);
		classes.setBackground(Color.WHITE);
		classes.setHorizontalAlignment(SwingConstants.CENTER);
		classList = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, classList, 0, SpringLayout.NORTH, classes);
		layout.putConstraint(SpringLayout.WEST, classList, 5, SpringLayout.EAST, classes);
		layout.putConstraint(SpringLayout.SOUTH, classList, 0, SpringLayout.SOUTH, classes);
		layout.putConstraint(SpringLayout.EAST, classList, 0, SpringLayout.EAST, characterName);
		archetype = new JLabel("Archetype");
		archetype.setToolTipText("Choose an Archetype for your Character based off your Class.");
		archetype.setOpaque(true);
		archetype.setBackground(Color.WHITE);
		archetype.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		archetype.setHorizontalAlignment(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, archetype, 5, SpringLayout.SOUTH, classes);
		layout.putConstraint(SpringLayout.WEST, archetype, 0, SpringLayout.WEST, classes);
		layout.putConstraint(SpringLayout.SOUTH, archetype, 35, SpringLayout.SOUTH, classes);
		layout.putConstraint(SpringLayout.EAST, archetype, 0, SpringLayout.EAST, classes);
		archetypeList = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, archetypeList, 0, SpringLayout.NORTH, archetype);
		layout.putConstraint(SpringLayout.WEST, archetypeList, 5, SpringLayout.EAST, archetype);
		layout.putConstraint(SpringLayout.SOUTH, archetypeList, 0, SpringLayout.SOUTH, archetype);
		layout.putConstraint(SpringLayout.EAST, archetypeList, 0, SpringLayout.EAST, classList);
		races = new JLabel("Race");
		layout.putConstraint(SpringLayout.NORTH, races, 5, SpringLayout.SOUTH, archetype);
		layout.putConstraint(SpringLayout.WEST, races, 0, SpringLayout.WEST, archetype);
		layout.putConstraint(SpringLayout.SOUTH, races, 35, SpringLayout.SOUTH, archetype);
		layout.putConstraint(SpringLayout.EAST, races, 0, SpringLayout.EAST, archetype);
		races.setToolTipText("Choose a Race for your Character.");
		races.setOpaque(true);
		races.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		races.setBackground(Color.WHITE);
		races.setHorizontalAlignment(SwingConstants.CENTER);
		raceList = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, raceList, 0, SpringLayout.NORTH, races);
		layout.putConstraint(SpringLayout.WEST, raceList, 5, SpringLayout.EAST, races);
		layout.putConstraint(SpringLayout.SOUTH, raceList, 0, SpringLayout.SOUTH, races);
		layout.putConstraint(SpringLayout.EAST, raceList, 0, SpringLayout.EAST, classList);
		backgrounds = new JLabel("Background");
		backgrounds.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layout.putConstraint(SpringLayout.NORTH, backgrounds, 5, SpringLayout.SOUTH, races);
		layout.putConstraint(SpringLayout.WEST, backgrounds, 0, SpringLayout.WEST, races);
		layout.putConstraint(SpringLayout.SOUTH, backgrounds, 35, SpringLayout.SOUTH, races);
		layout.putConstraint(SpringLayout.EAST, backgrounds, 0, SpringLayout.EAST, races);
		backgrounds.setBackground(Color.WHITE);
		backgrounds.setOpaque(true);
		backgrounds.setToolTipText("Choose a Background for your Character.");
		backgrounds.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundList = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, backgroundList, 0, SpringLayout.NORTH, backgrounds);
		layout.putConstraint(SpringLayout.WEST, backgroundList, 5, SpringLayout.EAST, backgrounds);
		layout.putConstraint(SpringLayout.SOUTH, backgroundList, 0, SpringLayout.SOUTH, backgrounds);
		layout.putConstraint(SpringLayout.EAST, backgroundList, 0, SpringLayout.EAST, raceList);
		alignment = new JLabel("Alignment");
		alignment.setToolTipText("Choose an Alignment for your Character.");
		alignment.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		alignment.setOpaque(true);
		alignment.setHorizontalAlignment(SwingConstants.CENTER);
		alignment.setHorizontalTextPosition(SwingConstants.CENTER);
		layout.putConstraint(SpringLayout.NORTH, alignment, 5, SpringLayout.SOUTH, backgrounds);
		layout.putConstraint(SpringLayout.WEST, alignment, 0, SpringLayout.WEST, backgrounds);
		layout.putConstraint(SpringLayout.SOUTH, alignment, 35, SpringLayout.SOUTH, backgrounds);
		layout.putConstraint(SpringLayout.EAST, alignment, 0, SpringLayout.EAST, backgrounds);
		alignmentList = new JComboBox();
		layout.putConstraint(SpringLayout.NORTH, alignmentList, 0, SpringLayout.NORTH, alignment);
		layout.putConstraint(SpringLayout.WEST, alignmentList, 5, SpringLayout.EAST, alignment);
		layout.putConstraint(SpringLayout.SOUTH, alignmentList, 0, SpringLayout.SOUTH, alignment);
		layout.putConstraint(SpringLayout.EAST, alignmentList, 0, SpringLayout.EAST, backgroundList);
		create = new JButton("Create");
		create.setToolTipText("Click to create your Character.");
		layout.putConstraint(SpringLayout.NORTH, create, 5, SpringLayout.SOUTH, alignment);
		layout.putConstraint(SpringLayout.WEST, create, 50, SpringLayout.WEST, alignment);
		layout.putConstraint(SpringLayout.SOUTH, create, 35, SpringLayout.SOUTH, alignment);
		layout.putConstraint(SpringLayout.EAST, create, -50, SpringLayout.EAST, alignmentList);
		
		setupPanel();
		setupComboBoxes();
		setupLayout();
		setupListeners();
	}
	private void setupComboBoxes() {
		DefaultComboBoxModel classModel = new DefaultComboBoxModel(app.convertClasses());
		classList.setModel(classModel);
		DefaultComboBoxModel archetypeModel = new DefaultComboBoxModel(app.convertArchytype());
		archetypeList.setModel(archetypeModel);
		DefaultComboBoxModel raceModel = new DefaultComboBoxModel(app.convertRaces());
		raceList.setModel(raceModel);
		DefaultComboBoxModel backgroundModel = new DefaultComboBoxModel(app.convertBackgrounds());
		backgroundList.setModel(backgroundModel);
		DefaultComboBoxModel alignmentModel = new DefaultComboBoxModel(app.convertAlignments());
		alignmentList.setModel(alignmentModel);
	}
	private void setupPanel() {
		this.setLayout(layout);
		this.setBackground(Color.GRAY.darker());
		this.add(name);
		this.add(character);
		this.add(characterName);
		this.add(classes);
		this.add(classList);
		this.add(archetype);
		this.add(archetypeList);
		this.add(races);
		this.add(raceList);
		this.add(backgrounds);
		this.add(backgroundList);
		this.add(alignment);
		this.add(alignmentList);
		this.add(create);
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				frame = app.getFrame();
				frame.changePanel();
			}
		});
	}
	
	public JTextField getCharacterName() {
		return characterName;
	}
	public JComboBox getClassList() {
		return classList;
	}
	public JComboBox getArchetypeList() {
		return archetypeList;
	}
	public JComboBox getRaceList() {
		return raceList;
	}
	public JComboBox getBackgroundList() {
		return backgroundList;
	}
	public JComboBox getAlignmentList() {
		return alignmentList;
	}
}

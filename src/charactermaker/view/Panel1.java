package charactermaker.view;

import charactermaker.controller.*;
import java.awt.*;
import javax.swing.*;

public class Panel1 extends JPanel {
	private Controller app;
	private Frame frame;
	private SpringLayout layout;
	private JLabel name;
	private JLabel classes;
	private JComboBox classList;
	private JLabel races;
	private JComboBox raceList;
	private JLabel backgrounds;
	private JComboBox backgroundList;
	public Panel1() {
		
	}
	public Panel1(Controller app) {
		super();
		this.app = app;
		layout = new SpringLayout();
		name = new JLabel("Character Creator");
		classes = new JLabel("Class");
		classList = new JComboBox();
		races = new JLabel("Race");
		raceList = new JComboBox();
		backgrounds = new JLabel("Background");
		backgroundList = new JComboBox();
		
		setupComboBoxes();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupComboBoxes() {
		DefaultComboBoxModel classModel = new DefaultComboBoxModel(app.convertClasses());
		classList.setModel(classModel);
		DefaultComboBoxModel raceModel = new DefaultComboBoxModel(app.convertRaces());
		raceList.setModel(raceModel);
		DefaultComboBoxModel backgroundModel = new DefaultComboBoxModel(app.convertBackgrounds());
		backgroundList.setModel(backgroundModel);
	}
	private void setupPanel() {
		this.setBackground(Color.GRAY.darker());
		this.setLayout(layout);
		this.add(name);
		this.add(classes);
		this.add(races);
		this.add(backgrounds);
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		
	}
}

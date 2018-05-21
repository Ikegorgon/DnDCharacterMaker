package charactermaker.view;

import charactermaker.controller.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Panel2 extends JPanel {
	private Controller app;
	private Frame frame;
	private SpringLayout layout;
	private JLabel name;
	private JTextField chacterName;
	private JComboBox classes;
	private JTextField level;
	private JComboBox backgrounds;
	private JLabel races;
	private JLabel alignment;
	private JLabel xp;
	public Panel2(Controller app) {
		super();
		this.app = app;
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
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel() {
		this.setLayout(layout);
		this.setBackground(Color.GRAY.darker());
		this.add(name);
	}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		
	}
}

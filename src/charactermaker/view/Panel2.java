package charactermaker.view;

import charactermaker.controller.*;
import java.awt.*;
import javax.swing.*;

public class Panel2 extends JPanel {
	private Controller app;
	private Frame frame;
	private SpringLayout layout;
	private JLabel name;
//	private JLabel classes;
//	private JLabel races;
//	private JLabel backgrounds;
	public Panel2() {
		
	}
	public Panel2(Controller app) {
		super();
		this.app = app;
		layout = new SpringLayout();
		name = new JLabel("Character Creator");
		
	}
}

package charactermaker.view;

import charactermaker.controller.*;
//import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private Controller app;
	private Panel1 panel1;
	private Panel2 panel2;
	public Frame(Controller app) {
		super();
		this.app = app;
		panel1 = new Panel1(app);
		setupFrame();
	}
	private void setupFrame() {
		this.setContentPane(panel1);
		this.setTitle("D&D Character Creator");
		this.setSize(750, 800);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setName("D&D Character Creator");
//		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
//				.getResource("charactermaker/view/images/Icon.png")));
	}
	public void changePanel() {
		panel2 = new Panel2(app);
		if (this.getContentPane() == panel1) {
			this.setContentPane(panel2);
		} else {
			this.setContentPane(panel1);
		}
		this.revalidate();
	}
	public Controller getController() {
		return app;
	}
	public Panel1 getPanel1() {
		return panel1;
	}
	public Panel2 getPanel2() {
		return panel2;
	}
}

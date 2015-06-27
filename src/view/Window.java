package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = -3739008754324139579L;

	public TriangulationPanel panel;
	
	public Window() {
		super("Triangulacion Delaunay");
		setLayout(new BorderLayout(20, 20));
		addMenu(this);
		addTriangulationPanel(this);
		addSidePanel(this);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void addSidePanel(Window window) {
		
	}

	private void addTriangulationPanel(Window window) {
		panel = new TriangulationPanel();
		add(panel);
		
		
	}

	private void addMenu(Window window) {
		MenuBar menu = new MenuBar(window);
		setJMenuBar(menu);
		
	}
}

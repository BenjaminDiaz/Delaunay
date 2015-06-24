package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = 7071161052750496428L;

	public Window window;
	private JMenu file, help;
	private JMenuItem newT, exit, about;

	public MenuBar(Window window) {
		this.window = window;
		file = new JMenu("Archivo");
		newT = new JMenuItem("Nuevo");
		newT.addActionListener(this);
		file.add(newT);
		exit = new JMenuItem("Salir");
		exit.addActionListener(this);
		file.add(exit);
		help = new JMenu("Ayuda");
		about = new JMenuItem("Acerca de Triangulacion Delaunay");
		about.addActionListener(this);
		help.add(about);
		add(file);
		add(help);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == exit) {
			System.exit(ABORT);
		} else if (source == newT) {
			window.panel.reset();
		} else if (source == about) {
			JOptionPane
					.showMessageDialog(
							window,
							"Este programa realiza una triangulacion Delaunay utilizando el algoritmo incremental de Bowyer–Watson \n\n"
									+ "This program generates a Delaunay triangulation using Bowyer-Watson incremental algorithm \n\n"
									+ "https://github.com/BenjaminDiaz");
		}

	}
}

package core;

import javax.swing.SwingUtilities;

import view.Window;

public class DelaunayTriangulation {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Window window = new Window();
				window.setVisible(true);
			}
		});
	}

}
